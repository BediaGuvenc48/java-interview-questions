package interview2.polymorfizm;

public class ChromeDriver implements WebDriver {

    public void LocalStorage(){

        System.out.println("ChromeDriverMethod LocakStorage " );
    }
    public void TouchScreen(){

        System.out.println("ChromeDriverMethod TouchScreen" );
    }

    @Override
    public void findBy() {
        System.out.println("ChromeDriver FindBy");
    }

    @Override
    public void getMethod() {
        System.out.println("ChromeDriver getMethod");
    }

    @Override
    public void getTitleMethod() {
        System.out.println("ChromeDriver getTitleMethod");
    }
}
