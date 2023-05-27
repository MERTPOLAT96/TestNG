package GUN04;

import Utılıty.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _04_ContactUs extends BaseDriver {

    @Test
    @Parameters("mesaj") // xml de ki parametre adı aynı olmak zorunda
    void contactUs(String gelenMesaj){
        //String gelenmesaj:metod için gerekli tanımlama aunı olmak zorunda değil

        WebElement contactUsBtn= driver.findElement(By.linkText("Contact Us"));
        contactUsBtn.click();

        WebElement enquiryArea= driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys(gelenMesaj);

        WebElement submitButton= driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
}
