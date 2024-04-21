package ch4;

public class Ex21_Flow21 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(j == i) {
                    System.out.printf("[%d, %d]", i, j);
                } else {
                    System.out.print("\t\t");
                };
            }
            System.out.println();
        }
    }
}
