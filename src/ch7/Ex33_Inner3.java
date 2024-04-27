package ch7;

public class Ex33_Inner3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
//        int siv = outerIv;    // static 클래스는 외부 클래스의 instance 멤버 접근 불가
        int scv = outerCv;
    }

    void myMethod() {
        int lv = 0; // final 생략 상태, 상수는 메서드가 종료되어도 constant pool에 남아있으므로 지역 클래스가 참조하는 상황에서 ok
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
