//Strong Number program


import java.util.Scanner;

public class strongNumbers {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int num, temp, reminder, sum = 0, i, fact;
        sc = new Scanner(System.in);

        System.out.print("Enter any Number : ");
        num = sc.nextInt();

        temp = num;
        while( temp > 0)
        {
            fact = 1;
            i = 1;
            reminder = temp % 10;
            while (i <= reminder)
            {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of " + reminder + "  is:  " + fact);
            sum = sum + fact;
            temp = temp /10;
        }

        System.out.println("Sum of Factorials of a Given Number " + num + " is:  " + sum);

        if(num==sum) {
            System.out.println("Result is a Strong number");
        }

        else {
            System.out.println("Result is not a strong number");
        }
    }
}
