package GUN07;

import GUN06._03_PlaceOrderElements;
import Utılıty.BaseDriver;
import Utılıty.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_WishListPOM extends BaseDriver {

_03_PlaceOrderElements poe=new _03_PlaceOrderElements();
    @Test
    @Parameters("searchofText")
    void addToWishList(String text){


        poe.searchBox.sendKeys(text);
        poe.searchButton.click();

        _02_WishListElements wle=new _02_WishListElements();

        int randomchoice= Tools.RandomGenerator(wle.searchResult.size()); // 0,1,2,3
        String wishItemText=wle.searchResult.get(randomchoice).getText(); // tıklatılacak elemanın ismini aldım
        wle.wishList.get(randomchoice).click(); // random elementin wish listine tıklattım
        wle.btnWishProducts.click();
        Tools.listContainsString(wle.wishTableNames,wishItemText);







    }
}
