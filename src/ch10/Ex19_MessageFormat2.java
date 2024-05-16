package ch10;

import java.text.MessageFormat;

public class Ex19_MessageFormat2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'', ''{1}'', ''{2}'', ''{3}'');";

        Object[][] arguments = {
                {"이유미", "02-123-1234", "25", "03-08"},
                {"유고운", "010-1234-5678", "25", "11-02"}
        };

        for(int i = 0; i < arguments.length; i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
