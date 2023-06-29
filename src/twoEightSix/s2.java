package twoEightSix;

/*Write a function which takes a String as an argument. The String consists of binary digits separated with an alphabets
* as follows:
* - A denotes AND operator
* - B denotes OR operator
* - C denotes XOR operator
* You are required to calculate the result of the string
* I/P: 1C0C1A0B1*/
import java.util.*;

public class s2 {
    public static int OperationsBinaryString(char[] str)
    {
        int len=0;
        int ans= str[0]-'0';
        for(len=0;str[len]!='\0';len++);
        for(int i=1;i<len-1;i+=2)
        {
            int j=i+1;
            if(str[i]=='A')
            {
                ans = ans & (str[j]-'0');
            }
            else if(str[i]=='B')
            {
                ans = ans | (str[j]-'0');
            }
            else if(str[i]=='C')
            {
                ans = ans ^ (str[j]-'0');
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner in  =new Scanner(System.in);
        String g = in.nextLine();
        char[] str = new char[g.length()+1];
        for(int i=0;i<g.length();i++){
            str[i] = g.charAt(i);
        }
        System.out.println(OperationsBinaryString(str));
    }
}
