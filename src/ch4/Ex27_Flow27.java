package ch4;

import java.util.Scanner;

public class Ex27_Flow27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0 입력)");

        while (flag) {
            System.out.print(">> ");

            num = scanner.nextInt();

            if(num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }

        System.out.println("합계: " + sum);
    }
}
