package bcel;

import java.io.IOException;
import java.io.InputStream;
import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;

public class ClassParserExample {

    public static void main(String... args) throws IOException {
        InputStream istream =
                ClassParserExample.class.getResourceAsStream("/ClassA.class");

        ClassParser parser = new ClassParser(istream, "ClassA.class");

        JavaClass clazz = parser.parse();
        Attribute[] attrs = clazz.getAttributes();
        System.out.println("*********");
    }
}
