package GUN01;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _01_Giris {

    @BeforeTest // before test olduğu için ilk burası çalıştırlıyor yani ben testlerden önce çalışırım
    public void Test1(){

        System.out.println("test 1 çalıştı");
    }

    @Test
    public void Test2(){

        System.out.println("test 2 çalıştı");
    }

    @Test
    public void Test3(){

        System.out.println("test 3 çalıştı");
    }
}
