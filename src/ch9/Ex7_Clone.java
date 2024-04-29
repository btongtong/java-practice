package ch9;

public class Ex7_Clone {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}

class Point implements Cloneable {  // Cloneable을 구현했는지 확인, 안 되었으면 CloneNotSupportedException 발생
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    // 공변 반환타입 가능!
    public Point clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Point)obj;
    }
}
