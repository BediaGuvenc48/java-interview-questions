package JavaOOP.ObjectClass;

import JavaOOP.ObjectClass.TV;

public class TVTester {

    public static void main(String[] args) {

        TV myTV = new TV();       //INSTANTIATION of TV class
        TV smartTV = new TV("Sharp");//Instantiating TV class
        TV cTV = new TV("HP");


        smartTV.isOn(true);
        myTV.isOn(true);
        System.out.println(myTV.isOn());
        System.out.println(smartTV.isOn());

        myTV.setChannel(50);
        smartTV.setChannel(23);
        cTV.setChannel(180);
        myTV.isOn();

        myTV.turnOn();
        smartTV.turnOn();


        System.out.println(myTV.getChannel());
        System.out.println(smartTV.getChannel());
        System.out.println(cTV.getChannel());


        myTV.channelUp();
        smartTV.channelDown();

        System.out.println(myTV.getChannel());
        System.out.println(smartTV.getChannel());

        cTV.isOn(true);

        cTV.turnOff();

    }
}
