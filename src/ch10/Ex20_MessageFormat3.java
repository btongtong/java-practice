package ch10;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex20_MessageFormat3 {
    public static void main(String[] args) throws ParseException {
        String[] data = {
                "INSERT INTO CUST_INFO VALUES ('이유미', '02-123-1234', '25', '03-08');",
                "INSERT INTO CUST_INFO VALUES ('유고운', '02-123-4567', '25', '11-02');"
        };

        String pattern = "INSERT INTO CUST_INFO VALUES ({0}, {1}, {2}, {3});";
        MessageFormat mf = new MessageFormat(pattern);

        for(int i = 0; i < data.length; i++) {
            Object[] objs = mf.parse(data[i]);
            for(int j = 0; j < objs.length; j++) {
                System.out.print(objs[j] + ", ");
            }
            System.out.println();
        }
    }
}
