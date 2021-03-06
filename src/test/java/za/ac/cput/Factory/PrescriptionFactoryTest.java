/* PrescriptionFactoryTest.java
 Test class for the Prescription Factory class
 Author: Zaeem Petersen (219010145)
 Date: 07 April 2022
*/
package za.ac.cput.Factory;

import za.ac.cput.Entity.Prescription;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.PrescriptionFactory;

import static org.junit.jupiter.api.Assertions.*;

class PrescriptionFactoryTest {

    @Test
    public void Test(){
        Prescription prescription = PrescriptionFactory.createPrescription(2, 2, "Pre-compounding prescription", 7);
        assertNotNull(prescription);
        System.out.println(prescription);
    }

}