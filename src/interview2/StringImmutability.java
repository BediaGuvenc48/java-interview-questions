package interview2;

public class StringImmutability {

    //Immutability is the fundamental property of string objects.
    // In whatever way you create the string objects, either using string literals or using
    // new operator, they are immutable.

    public static void main(String[] args) {

        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        System.out.println(a==c);//this is not true, because literal is goes to the String pool
        //only compare reference

        System.out.println(a.equals(c));//this is checking just value
        System.out.println("a "+ a.hashCode());
        System.out.println("b "+ b.hashCode());
        System.out.println("c "+ c.hashCode());




        String s1 = "JAVA";

        String s2 = "JAVA";

        System.out.println(s1 == s2);         //Output : true//== checking just the where they store

        s1 = s1 + "J2EE";

        System.out.println(s1 == s2);         //Output : false

      //  =============================================================================

        //New Keyword
        String s3 = new String("JAVA");

        System.out.println(s3);         //Output : JAVA

        s3.concat("J2EE");

        System.out.println(s3);         //Output : JAVA

        //  =============================================================================

        //why we can not compare objects by using equal operator
//        == tests for reference equality.====>primitive data type can store value and reference thats why == is enough but for object is not enough.
//        .equals() tests for value equality.
//
//        Consequently, if you actually want to test whether two strings have the same value
//        you should use .equals() (except in a few situations where you can guarantee that two strings with the same value will be represented by the same object eg: String interning).
    }
}
