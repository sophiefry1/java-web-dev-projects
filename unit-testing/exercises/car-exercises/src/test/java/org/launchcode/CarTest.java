package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    @Test
    public void initCar() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testGasTankAfterDriving() {
        assertEquals( 10, test_car.getGasTankLevel(),.001);
        test_car.drive(50);
    }


     @Test
    public void testGasTankAfterExceedingTankRange(){
             test_car.drive(501);
             assertEquals(test_car.getGasTankLevel(), 0, .001);

     }
         @Test()
         public void testGasOverfillException() {
             assertthrows(IllegalArgumentException.class, () -> );
         }
}