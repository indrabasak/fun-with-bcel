package example.simple.app;

public class ClassA {

    private String myAttrib1;

    private int myAttrib2;

    public String methodX(String param1, int param2) {
        myAttrib1 = param1;
        myAttrib2 = param2;

        ClassB bclazz = new ClassB();

        StringBuilder strBldr = new StringBuilder();
        String retVal = strBldr.append("ClassA.methodX(")
                .append(param1)
                .append(", ")
                .append(param2)
                .append(") -> ")
                .append(bclazz.methodY()).toString();

        return retVal;
    }
}
