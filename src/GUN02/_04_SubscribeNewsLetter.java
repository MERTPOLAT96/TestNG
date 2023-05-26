package GUN02;

import Utılıty.BaseDriver;
import Utılıty.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _04_SubscribeNewsLetter extends BaseDriver {

    By link=By.linkText("Newsletter");
    By subYes=By.xpath("//input[@value='1']");

    By subNo=By.xpath("//input[@value='0']");

    By cntbtn=By.xpath("//input[@value='Continue']");

    @Test(priority = 1)
    void subscribeFunctionYes(){


        WebElement newsLetterLink= driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeYes= driver.findElement(subYes);
        subscribeYes.click();

        WebElement continueButton= driver.findElement(cntbtn);
        continueButton.click();

       Tools.successMessageValidations();

    }

    @Test(priority = 2)
    void subscribeFunctionNo(){

        WebElement newsLetterLink= driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeNo= driver.findElement(subNo);
        subscribeNo.click();

        WebElement continueButton= driver.findElement(cntbtn);
        continueButton.click();

        Tools.successMessageValidations();


    }

    @Test(priority = 3)
    void subscribeFunctionForBoth(){

        WebElement newsLetterLink= driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeYes= driver.findElement(subYes);
        WebElement subscribeNo= driver.findElement(subNo);

        if (subscribeYes.isSelected())
            subscribeNo.click();
        else
            subscribeYes.click();

        WebElement continueButton= driver.findElement(cntbtn);
        continueButton.click();

        Tools.successMessageValidations();



    }


}
