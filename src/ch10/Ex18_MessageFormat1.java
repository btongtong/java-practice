package ch10;

import java.text.MessageFormat;

public class Ex18_MessageFormat1 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";

        Object[] arguments = {
                "이유미", "02-123-1234", "25", "03-08"
        };

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
