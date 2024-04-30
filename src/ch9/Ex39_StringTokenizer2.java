package ch9;

import java.util.StringTokenizer;

public class Ex39_StringTokenizer2 {
    public static void main(String[] args) {
        String expression = "x = 100 * (200 + 300) / 2";
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
