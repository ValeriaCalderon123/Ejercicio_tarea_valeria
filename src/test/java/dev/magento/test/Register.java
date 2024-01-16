package dev.magento.test;

import dev.magento.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Register extends BaseTest {
    @Test
    public void RegisterNewAccount(){

        String valorN = "My Account";
        WebElement linkElement = driver.findElement(By.xpath("//a[contains(text(),'Create an Account')]"));
        linkElement.click();
        WebElement firstname = driver.findElement(By.id("firstname"));
        firstname.sendKeys("Valeria");
        WebElement lastname = driver.findElement(By.id("lastname"));
        lastname.sendKeys("Calderon");
        WebElement email = driver.findElement(By.id("email_address"));
        email.sendKeys("vcalderon15@unsa.edu.pe");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Contra123*");
        WebElement password_confirmation = driver.findElement(By.id("password-confirmation"));
        password_confirmation.sendKeys("Contra123*");
        WebElement submit = driver.findElement(By.xpath("//button[contains(span,'Create an Account')]"));
        submit.submit();

        WebElement msg = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
        Assert.assertEquals(msg.getText(),valorN);
    }
}
