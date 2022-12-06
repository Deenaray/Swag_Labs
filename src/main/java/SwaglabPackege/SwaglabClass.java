package SwaglabPackege;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabClass {
    static WebDriver driver;

    public void openUrl()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEENARAY\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    public void loginpage()
    {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    public void clickLogin()
    {
        driver.findElement(By.id("login-button")).click();
    }
    public void addToCart() throws InterruptedException {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }
    public void checkOut()
    {
        driver.findElement(By.id("checkout")).click();
    }
    public void AddressInfo()
    {
        driver.findElement(By.id("first-name")).sendKeys("Deepika");
        driver.findElement(By.id("last-name")).sendKeys("Narayan");
        driver.findElement(By.id("postal-code")).sendKeys("560076");
        driver.findElement(By.id("continue")).click();
    }
    public void finishbutton()
    {
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("back-to-products")).click();
    }
    public void logOut() throws InterruptedException {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
    }
    public void clickLogout()
    {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
}
