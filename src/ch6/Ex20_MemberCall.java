package ch6;

public class Ex20_MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv;
    static int cv2 = new Ex20_MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv);
        Ex20_MemberCall c = new Ex20_MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1();
        Ex20_MemberCall c = new Ex20_MemberCall();
        c.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
