package interview2;

public interface InterfaceDeneme {

    void text();

    static void A(){
        System.out.println("A  static method");
    }

    default void B(){
        System.out.println("B default method");
    }
}
