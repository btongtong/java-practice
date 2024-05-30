package ch15;

import java.io.Serializable;

public class Ex39_UserInfo implements Serializable {
    String name;
    String password;
    int age;

    public Ex39_UserInfo () {
        this("Unknown", "1111", 0);
    }

    public Ex39_UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String toString() {
        return "(" + name + ", " + password + ", " + age + ")";
    }
}
