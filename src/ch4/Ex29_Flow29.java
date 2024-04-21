package ch4;

public class Ex29_Flow29 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            int tmp = i;

            System.out.print("i = " + i + " ");
            do {
                if(tmp % 10 % 3 == 0 && tmp % 10 != 0) {
                    System.out.print("짝");
                }

            } while ((tmp /= 10) != 0);
            System.out.println();
        }
    }
}
