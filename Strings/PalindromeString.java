public class PalindromeString {
    public static void main(String[] args) {

        String str = "madam";

        int i = 0;
        int j = str.length() - 1;

        boolean palindrome = true;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                palindrome = false;
                break;
            }

            i++;
            j--;
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
