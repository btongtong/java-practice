package ch4;

import java.util.Scanner;

public class Ex10_Flow10 {
    public static void main(String[] args) {
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요.(1~100) >> ");

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        switch (score / 10) {
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'D';
                break;
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
