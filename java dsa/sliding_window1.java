
import java.util.*;

public class sliding_window1 {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> l = new ArrayList<>();

        int a = s.length();
        int b = p.length();

        if (b > a) return l;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // build map1 for p
        for (int i = 0; i < b; i++) {
            char ch = p.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // build first window map2
        for (int i = 0; i < b; i++) {
            char ch = s.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        if (map1.equals(map2)) {
            l.add(0);
        }

        // sliding window
        for (int i = b; i < a; i++) {

            char newChar = s.charAt(i);        // add new char
            map2.put(newChar, map2.getOrDefault(newChar, 0) + 1);

            char removeChar = s.charAt(i - b); // remove old char
            map2.put(removeChar, map2.get(removeChar) - 1);

            if (map2.get(removeChar) == 0) {
                map2.remove(removeChar);
            }

            if (map1.equals(map2)) {
                l.add(i - b + 1);
            }
        }

        return l;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string s:");
        String s = sc.nextLine();

        System.out.println("Enter string p:");
        String p = sc.nextLine();

        List<Integer> result = findAnagrams(s, p);

        System.out.println("Anagram indices: " + result);

        sc.close();
    }
}