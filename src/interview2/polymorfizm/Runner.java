package interview2.polymorfizm;

public class Runner {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.getMethod();
        //in order to acces ChomeDriver methods that is not present WebDriver , you
        //are switching your driver reference type ChromeDriver
        ((ChromeDriver) driver).LocalStorage();


        ((FirefoxDriver) driver).SessionStorage();// it gives us Class Cast Exception you can not cast child class reference each other






    }
}
