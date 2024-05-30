package ch15;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SuperUserInfo {
    String name;
    String password;

    SuperUserInfo() {
        this("Unknown", "1111");
    }

    SuperUserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
public class Ex42_UserInfo2 extends SuperUserInfo implements Serializable {
    int age;

    Ex42_UserInfo2() {
        this("Unknown", "1111", 0);
    }

    Ex42_UserInfo2(String name, String password, int age) {
        super(name, password);
        this.age = age;
    }

    public String toString() {
        return "(" + name + ", " + password + ", " + age + ")";
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(name);
//        out.writeUTF(password);
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
//        password = in.readUTF();
        in.defaultReadObject();
    }
}
