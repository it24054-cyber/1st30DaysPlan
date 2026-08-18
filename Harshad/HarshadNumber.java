import java.util.Scanner;

public class HarshadNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int sum = 0;
        int temp = x;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if (sum != 0 && x % sum == 0) {
            System.out.println("This is a harshad number");
        } else {
            System.out.println("This is not a harshad number");
        }
    }
}
