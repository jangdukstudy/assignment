import java.util.Scanner;

class Ex4_3 {
    public static void main(String[] args) {
        System.out.print("숫자 하나를 입력하세요. >");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input==0) {
            System.out.println("입력한 숫자는 0입니다");
        } else {
            System.out.printf("입력한 숫자는 0이 아니라 %d입니다.", input);
        }

    }
}
