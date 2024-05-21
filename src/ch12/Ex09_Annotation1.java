package ch12;

public class Ex09_Annotation1 {

}

abstract class Parent {
    void parentMethod(){}
}

class Child extends Parent {
//    @Override
//    void parentmethod(){}
    @Override
    void parentMethod(){}
}
