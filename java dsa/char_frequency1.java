public class char_frequency1 {
    public static void main(String[] args) {
        String s = "Programming is a skill that improves with consistent practice and curiosity. When a developer starts learning programming, they often begin with small examples such as printing text or counting characters in a string. Over time, these small programs grow into more complex applications that handle large amounts of data. Understanding how frequently each character appears in a long paragraph helps in learning concepts like loops, arrays, strings, and optimization. Many real-world problems, such as data compression, text analysis, and search engines, rely heavily on character frequency analysis. Therefore, writing and testing programs with long paragraphs is an important step in becoming a confident and skilled programmer.";

        s=s.toLowerCase();

        char[] arr = s.toCharArray();
        char visited = '@';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != visited) {
                char c = arr[i];
                int count = 0;
                for (int j = i; j < arr.length; j++) {
                    if (c == arr[j]) {
                        count++;
                        arr[j] = visited;
                    }
                }
                System.out.println("frequency of " + c + ": " + count);

            }
        }
    }
}
