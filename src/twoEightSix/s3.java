package twoEightSix;
import java.util.*;
//Equilibrium Point


public class s3 {
    public static int EQPoint(List<Integer> nums) {
        int left = 0, pivot = 0, right = 0;
        for (int i = 1; i < nums.size(); i++) {
            right += nums.get(i);
        }
        while (pivot < nums.size() - 1 && right != left) {
            pivot++;
            right -= nums.get(pivot);
            left += nums.get(pivot - 1);
        }
        return (left == right) ? pivot : -1;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        List<Integer> num = new ArrayList<Integer>();
        num.add(sc.nextInt());
        num.add(sc.nextInt());
        num.add(sc.nextInt());
        num.add(sc.nextInt());
        num.add(sc.nextInt());
        num.add(sc.nextInt());
        System.out.println(EQPoint(num));

    }
}

