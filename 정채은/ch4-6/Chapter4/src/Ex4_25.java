import java.awt.*;
import java.util.Scanner;

public class Ex4_25 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하새요.>");
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while(num!=0) {
            sum += num%10;
            System.out.printf("sum=%3d num=%d", sum, num);
            num /= 10;
            System.out.println();
        }
        System.out.printf("각 자리수의 합:%d", sum);
    }
}
