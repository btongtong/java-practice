package ch4;

public class Ex18_Flow18 {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            System.out.printf("=== %d 단 ===%n", i);
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
        }
    }
}
