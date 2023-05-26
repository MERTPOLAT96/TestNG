package GUN03;

import Utılıty.BaseDriver;
import Utılıty.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static Utılıty.BaseDriver.driver;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En sondan 2. adresi siliniz.
 */


public class _02_AddressFunctionality extends BaseDriver {

    // no such element : yani locator bulunamadı

    @Test
    void addAddress(){

        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        WebElement newAdress= driver.findElement(By.linkText("New Address"));
        newAdress.click();

        WebElement firstName= driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Mert");

        WebElement lastname= driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Polat");

        WebElement company= driver.findElement(By.id("input-company"));
        company.sendKeys("Techno Study");

        WebElement address1= driver.findElement(By.id("input-address-1"));
        address1.sendKeys("21a London Road");

        WebElement address2= driver.findElement(By.id("input-address-2"));
        address2.sendKeys("RG2 5BJ");

        WebElement city= driver.findElement(By.id("input-city"));
        city.sendKeys("Reading");

        WebElement postCode= driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("12345");

        // ülke seçimi tamam
        WebElement webCountry= driver.findElement(By.id("input-country"));
        Select country=new Select(webCountry);
        country.selectByVisibleText("Turkey");

        wait.until(ExpectedConditions.elementToBeClickable(webCountry));

        // state yani şehir seçimi
        //WebElement options=driver.findElement(By.cssSelector("select[id='input-zone']>option"));
        //wait.until(ExpectedConditions.stalenessOf(options));



        WebElement webState= driver.findElement(By.id("input-zone"));
        Select state=new Select(webState);
        //state.selectByVisibleText("Ankara");
        //state.selectByValue("3321");
        state.selectByIndex(7); // stale element hatası:tez buldum erken kaybettim

        // selectByVisibleText : findelement gibi çalıştığından
        // implicitly wait i kullanır

        //selectbyvisibletext ve selectbyvalue : findElement gibi çalıştığından imlicitly wait i kullanır

        // selectByIndex : implicitly Wait ile çalışmıyor, ancak ExplicitWait ile çalışır

        //Stale Element hatası demek : eskisi gibi olmayan demek (yenilenmiş demek) (tez buldum erken kaybettim) tanımlanabilir



        WebElement defaddress=driver.findElement(By.xpath("//input[@value='1']"));
        defaddress.click();

        WebElement continuebutton=driver.findElement(By.xpath("//input[@value='Continue']"));
        continuebutton.click();

        Tools.successMessageValidations();

        Tools.Bekle(5);

    }

    @Test(dependsOnMethods = {"addAddress"})
    void editAddress(){

        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Edit"));
        WebElement sonEdit=editAll.get(editAll.size()-1); // son edit
        sonEdit.click();

        WebElement firstName= driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Mert");

        WebElement lastname= driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys("Polat");

        WebElement continuebutton=driver.findElement(By.xpath("//input[@value='Continue']"));
        continuebutton.click();

        Tools.successMessageValidations();




    }

    @Test(dependsOnMethods = {"editAddress"})
    void deleteAddress(){

        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Delete"));
        WebElement silinebiliradres=editAll.get(editAll.size()-2); // silinebilir 2.cisi
        silinebiliradres.click();

        Tools.successMessageValidations();


    }




}
