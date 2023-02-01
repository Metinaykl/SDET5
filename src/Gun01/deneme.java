package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techno.study/");

    }
}
