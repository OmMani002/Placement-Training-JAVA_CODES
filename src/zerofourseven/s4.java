package zerofourseven;

public class s4 {
    static String binaryNum(int n)
    {
        String ans= " ";
        while (n>0){
            ans = (Integer.toString(n&1)) + ans;
            n >>=1;
        }
        return ans;
    }

    static int checkPalindrome(int n){
        String s1 = binaryNum(n);

        StringBuilder s2 = new StringBuilder(s1);

        s2 = s2.reverse();

        return s1.equals(s2.toString()) ? 1 : 0;
    }
    public static void main(String[] args) {
        int x = 219;
        System.out.println(checkPalindrome(x));
        x =10;
        System.out.println(checkPalindrome(x));
    }

}
