package zeroeightseven;

/* */

import java.util.*;
public class s1
        {

static int val(char c)
        {
        if (c >= '0' && c <= '9')
            return (int)c - '0';
        else
            return (int)c - 'A' + 10;
        }

static int toDeci(String str,
        int base)
        {
        int len = str.length();
        int power = 1;
        int num = 0;
        int i;
        for (i = len - 1; i >= 0; i--)
        {
        if (val(str.charAt(i)) >= base)
        {
        System.out.println("Invalid Number");
        return -1;
        }

        num += val(str.charAt(i)) * power;
        power = power * base;
        }

        return num;
        }

public static void main (String[] args)
        {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int base = in.nextInt();
        System.out.println(toDeci(str, base));
        }
        }
