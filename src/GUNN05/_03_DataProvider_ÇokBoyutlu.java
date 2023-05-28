package GUNN05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider_ÇokBoyutlu {

    @Test(dataProvider = "UserData")
    void UsernameTest(String username,String password){
        System.out.println("user = " + username+" "+password);
    }

    @DataProvider

    public Object[][] UserData(){

        Object[][] data={
                {"mert","114566"},
                {"okay","4324"},
                {"polat","6548"},
                {"mertt","35490"}


        };

        return data;
    }
}
