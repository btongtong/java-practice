package ch7;

public class Ex23_PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer1 b = new Buyer1();
        Tv1 tv = new Tv1();
        Computer computer = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(computer);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(computer);
        b.summary();
    }
}
