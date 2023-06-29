public class rotateString {

    static String leftrotate(String str, int d) {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    static String rightRotate(String str, int d) {
        return leftrotate(str, str.length() -  d);
    }

    public static void main(String[] args) {
        String str1 = "faceprep";
        System.out.println(leftrotate(str1, 3));
    }
}
