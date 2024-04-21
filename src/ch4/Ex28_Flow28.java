package ch4;

import java.util.Scanner;

public class Ex28_Flow28 {
    public static void main(String[] args) {
        int input, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요. >> ");

            input = scanner.nextInt();

            if(input > answer) {
                System.out.println("더 작은 값으로 다시 도전하세요.");
            } else if (input < answer) {
                System.out.println("더 큰 값으로 다시 도전하세요.");
            }

        } while (input != answer);

        System.out.println("정답입니다.");
    }
}
