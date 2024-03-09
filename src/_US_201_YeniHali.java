import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _US_201_YeniHali extends BaseDriver {

 @Test
    public void _US_201_YeniHali(){

    try {

        driver.get("https://demowebshop.tricentis.com/");


        WebElement registerButton = driver.findElement(By.linkText("Register"));
        registerButton.click();


        Actions actions = new Actions(driver);
        WebElement firstName = driver.findElement(By.id("FirstName"));
        WebElement lastName = driver.findElement(By.id("LastName"));
        WebElement maleRadioButton = driver.findElement(By.id("gender-female"));
        WebElement email = driver.findElement(By.id("Email"));
        WebElement password = driver.findElement(By.id("Password"));
        WebElement confirmPassword= driver.findElement(By.id("ConfirmPassword"));
        WebElement registerButton2 = driver.findElement(By.id("register-button"));
        MyFunc.Bekle(3);
        actions.moveToElement(firstName)
                .click()
                .sendKeys("test")
                .sendKeys(Keys.TAB)
                .sendKeys("Tester")
                .sendKeys(Keys.TAB)
                .click(maleRadioButton)
                .sendKeys(Keys.TAB)
                .sendKeys("test123@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Test123")
                .sendKeys(Keys.TAB)
                .sendKeys("Test123")
                .sendKeys(Keys.TAB)
                .click(registerButton2)
                .perform();

    } finally {
        driver.quit();
    }
 }

}











































