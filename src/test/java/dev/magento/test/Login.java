package dev.magento.test;

import dev.magento.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseTest {
    @Test
    public void LoginWithEmailCorrect(){
        driver.findElement(By.className("authorization-link")).click();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("vcalderon@unsa.edu.pe");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Contra123*");
        WebElement submit = driver.findElement(By.id("send2"));
        submit.submit();
        String valorN = "Welcome, Valeria Calderon!";

        WebElement msg = driver.findElement(By.xpath("//span[contains(text(),'Welcome, Valeria Calderon!')]"));
        Assert.assertEquals(msg.getText(),valorN);
    }

    @Test
    public void LoginWithEmailIncorrect(){

        driver.findElement(By.className("authorization-link")).click();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("vcalderon@unsa.edu.pe");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Contra123");
        WebElement submit = driver.findElement(By.id("send2"));
        submit.submit();
        String valorN = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";

        WebElement msg = driver.findElement(By.xpath("//div[contains(text(),'The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.')]"));
        Assert.assertEquals(msg.getText(),valorN);
    }

}
