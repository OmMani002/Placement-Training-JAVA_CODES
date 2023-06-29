package twotwosix;

//I/P: aaabbbc
//O/P: a3b3c1

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class s4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> map = new TreeMap<>();

        String blah = in.nextLine();

        for (int i = 0; i < blah.length(); i++) {
            char c = blah.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, (map.get(c) + 1));
            }
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}

