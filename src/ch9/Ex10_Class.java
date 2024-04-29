package ch9;

public class Ex10_Class {
    public static void main(String[] args) throws Exception{
        Ex10_Card c1 = new Ex10_Card("HEART", 3);
        Ex10_Card c2 = Ex10_Card.class.newInstance();

        Class cObj = c1.getClass();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());

    }
}

final class Ex10_Card {
    String kind;
    int num;

    Ex10_Card () {
        this("SPADE", 1);
    }
    Ex10_Card (String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }
}
