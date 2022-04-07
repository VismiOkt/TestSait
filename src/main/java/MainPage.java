import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends Page {
    public String point;
    public MainPage(WebDriver driver){
        super(driver);
    }
    public void openMainPage() {
        driver.get("https://demoqa.com/");
    }
    public void openElement() {
        driver.findElement(By.xpath("//h5[text() = 'Elements']")).click();
    }
    public void openForms() {
        driver.findElement(By.xpath())
    }

}
