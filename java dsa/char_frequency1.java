public class char_frequency1 {
    public static void main(String[] args) {
        String s = "aabbc";

        char[] arr = s.toCharArray();
        char visited = '@';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != visited) {
                char ch = arr[i];
                int count = 0;
                for (int j = i; j < arr.length; j++) {
                    if (ch == arr[j]) {
                        count++;
                        arr[j] = visited;
                    }
                }
                System.out.println("frequency of " + ch + ": " + count);
            }
        }
    }
}
