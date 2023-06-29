package twothreesix;

import java.util.LinkedList;
import java.util.Queue;

public class sortQueue {
    static void sort1(Queue<Integer> q, int qsize) {
        if(qsize <= 0) {
            return;
        }
        q.add(q.peek());
        q.remove();
        sort1(q, qsize - 1);
    }
    static void pushQueue (Queue<Integer> q, int temp, int qsize) {
        if(q.isEmpty() || qsize == 0) {
            q.add(temp);
            return;
        } else if (temp <= q.peek()) {
            q.add(temp);
            sort1(q, qsize);
        }
        else {
            q.add(q.peek());
            q.remove();

            pushQueue(q, temp, qsize - 1);
        }
    }
    static void sortGivenQueue (Queue<Integer> q) {
        if(q.isEmpty()) {
            return;
        }
        int temp = q.peek();

        q.remove();

        sortGivenQueue(q);

        pushQueue(q, temp, q.size());
    }

    public static void main(String [] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(20);
        qu.add(4);
        qu.add(5);
        qu.add(16);
        qu.add(3);
        qu.add(1);

        sortGivenQueue(qu);

        while (!qu.isEmpty()) {
            System.out.println(qu.peek() + " ");
            qu.remove();
        }
    }
}
