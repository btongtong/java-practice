package ch12;

import java.util.ArrayList;

class NewClass3 {
    int newField;
    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;
    @Deprecated
    int getOldField() {
        return oldField;
    }
}

public class Ex11_Annotation3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewClass3 nc = new NewClass3();

        nc.oldField = 10;
        System.out.println(nc.getOldField());

        @SuppressWarnings("unchecked")
        ArrayList<NewClass3> list = new ArrayList();
        list.add(nc);
    }
}
