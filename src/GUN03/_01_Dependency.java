package GUN03;

import org.testng.annotations.Test;

public class _01_Dependency {

    // arabanın hareketi :start, drive, park, stop hareket sırası

    // dependsOnMethods ile testleri birbirine bağladım

    // dependsOnMethods 2 testi bağlayadabilirim örneğin park car için hem startCar hemde driveCar


    @Test

    void startCar(){

        System.out.println("startCar");
    }

    @Test( dependsOnMethods = {"startCar"}) // bu testin çalışması, startCar ın hatasız çalışmasına bağımlı

    void driveCar(){

        System.out.println("driveCar");
    }

    @Test(dependsOnMethods = {"driveCar"})

    void parkCar(){

        System.out.println("parkCar");
    }

    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true) // bir problem olursa da mutlaka çalış

    void stopCar(){

        System.out.println("stopCar");
    }

    // aynı seviyedeki testleri için priority verilebilir.
    // bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde
    //2 üste kadart otomatik çağırıp çalışabilir.
}
