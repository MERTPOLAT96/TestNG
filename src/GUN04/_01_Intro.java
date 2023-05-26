package GUN04;

import org.testng.annotations.*;

public class _01_Intro {

    /*
     @BeforeSuit
       @BeforeTest
         @BeforeGroup
           @BeforeClass
             @BeforeMethod
                 @Test1 method
                 @Test2 method
             @AfterMethod
           @AfterClass
         @AfterGroup
       @AfterTest
     @AfterSuit
   */

    @BeforeClass
    void bClass() {
        System.out.println("Before Class");
    }


    @BeforeMethod
    void bMethod() {
        System.out.println("Before Metod");
    }

    @Test
    void _03_Intro_Test1(){
        System.out.println("Intro_3 -> Test 1");
    }

    @Test
    void _03_Intro_Test2(){
        System.out.println("Intro_3-> Test 2");
    }

    @AfterMethod
    void aMethod() {
        System.out.println("After Metod");
    }

    @AfterClass
    void aClass() {
        System.out.println("After Class");
    }



}
