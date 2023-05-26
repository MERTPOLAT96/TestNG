package GUN02;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _01_Enable {

    @Test

    void test1() {


        System.out.println("test1");
    }

    @Test(enabled = false)
        void test2 () {

            System.out.println("test2");

        }

        @Test
        void test3 () {

            System.out.println("test3");
        }

        @BeforeClass
    void baslangıcIslemler(){

            System.out.println("başlangıç işlemleri yapılıyor");
        }

        @AfterClass
    void bitisIslemler(){

            System.out.println("bitiş işlemleri yapılıyor");
        }
    }
