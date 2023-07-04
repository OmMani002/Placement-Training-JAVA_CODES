package zerofourseven;

import java.util.Stack;

/*Leader Array*/
public class s2 {
    void printLeader(int[] arr, int s){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[s-1]);

        for (int i = s-2; i>=0; i--){
            if(arr[i] >= stack.peek()){
                stack.push(arr[i]);
            }
        }
        while(!stack.empty()){
            System.out.println(stack.pop()+ " ");
        }
    }
    public static void main(String[] args){
        s2 lead = new s2();
        int[] arr = new int[] {15, 19, 5, 3, 4, 2};
        int n = arr.length;
        lead.printLeader(arr, n);
    }

}
