package ch8;

public class Ex09_Exception9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생한 예외.");
            throw e;
//            throw new Exception("고의로 발생한 예외.");
        } catch (Exception e) {
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
