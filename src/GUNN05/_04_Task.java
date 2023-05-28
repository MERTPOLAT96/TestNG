package GUNN05;

import Utılıty.BaseDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Daha önceki derslerde yaptğımız Search fonksiyonunu
 * mac,ipod ve samsung için Dataprovider ile yapınız.
 */

public class _04_Task  {

    @Test(dataProvider = "search")
    void SearchTest(String markalar){

        System.out.println("marka= " + markalar);
    }

    @DataProvider

    public Object[] search(){

        Object[] data={"mac","ipod","samsung"};

        return data;
    }


}
