public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "programming";

        boolean[] visited = new boolean[256];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!visited[ch]) {
                System.out.print(ch);
                visited[ch] = true;
            }
        }
    }
}
