import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;

        int missing = expectedSum - sum;

        System.out.println(missing);

        sc.close();
    }
}
