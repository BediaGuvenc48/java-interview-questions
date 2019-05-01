package interview2.polymorfizm;

public class FirefoxDriver implements WebDriver {

    public void SessionStorage(){

        System.out.println("Firefox DriverMethod SsesionStorage " );
    }

    @Override
    public void findBy() {
        System.out.println("FirefoxDriver FindBy");
    }

    @Override
    public void getMethod() {
        System.out.println("FirefoxDriver getMethod");
    }

    @Override
    public void getTitleMethod() {
        System.out.println("FirefoxDriver getTitleMethod");
    }
}
