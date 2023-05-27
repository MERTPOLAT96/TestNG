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

    @BeforeSuite
    void bSuit() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    void bTest() {
        System.out.println("Before Test");
    }


    @BeforeGroups
    void bGroups() {
        System.out.println("Before Groups");
    }

    @BeforeClass
    void bClass() {
        System.out.println("Before Class");
    }


    @BeforeMethod
    void bMethod() {
        System.out.println("Before Metod");
    }

    @Test
    void _03_Intro_Test1() {
        System.out.println("Intro_3 -> Test 1");
    }

    @Test
    void _03_Intro_Test2() {
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

    @AfterGroups
    void aGroups() {
        System.out.println("After Groups");
    }

    @AfterTest
    void aTest(){
        System.out.println("After Suit");
    }

    @AfterSuite
    void aSuite() {
        System.out.println("After Suite");


    }

}




