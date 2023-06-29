package twoninesix;

//I/P: "He-llo-Wo-rld"
//O/P: "---HelloWorld"
import java.util.*;

public class s1 {
    public static void move(char[] str1){
        int i= str1.length-1;
        for(int j=i;j>=0;j--){
            if (str1[j] != '-')
            {
                char c = str1[i];
                str1[i] = str1[j];
                str1[j] = c;
                i--;
            }
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] ch = s.toCharArray();
        move(ch);
        System.out.println(String.valueOf(ch));
    }
}
