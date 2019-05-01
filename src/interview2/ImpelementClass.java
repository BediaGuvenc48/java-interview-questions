package interview2;

public class ImpelementClass  implements InterfaceDeneme{


//    This is why in java 8, we have a new concept “default methods”. These methods can be added to any existing interface and we do not need to implement
//    these methods in the implementation classes mandatorily, thus we can add these default methods to existing interfaces without breaking the code.


    @Override
    public void text() {
        System.out.println("impelement class");
    }

    static void A(){
        System.out.println("A  static method from Impelement class");
    }

    public static void main(String[] args) {

        ImpelementClass i= new ImpelementClass();

        i.text();

      ImpelementClass.A();
        i.B();
    }


}
