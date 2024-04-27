package ch7;

public class Ex25_ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParseManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParseManager.getParser("HTML");
        parser.parse("document2.html");
    }
}

interface Parseable {
    public abstract void parse (String fileName);
}

class ParseManager {
    public static Parseable getParser(String type) {
        if(type.equals("XML")) {
            return new XMLParse();
        } else {
            Parseable p = new HTMLParse();
            return p;
        }
    }
}

class XMLParse implements Parseable {

    @Override
    public void parse(String fileName) {
        System.out.println(fileName + " - XML parsing completed.");
    }

}

class HTMLParse implements Parseable {

    @Override
    public void parse(String fileName) {
        System.out.println(fileName + " - HTML parsing completed.");
    }

}