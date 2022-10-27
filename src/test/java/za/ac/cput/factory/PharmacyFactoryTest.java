package za.ac.cput.factory;

/* PharmacyFactoryTest.java
FactoryTest for the Pharmacy
Author: Waseem Dollie (216040566)
Date: 13 October 2022 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Pharmacy;
import za.ac.cput.domain.Prescription;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PharmacyFactoryTest {

    @Test
    void testCreatePharmacy() {
        Pharmacy pharmacy = PharmacyFactory.build("123", "DolliePharm", "22","32");
        Assertions.assertNotNull(pharmacy);
        System.out.println(pharmacy);
    }

    @Test
    void testCreatePharmacyWithError() {
        Pharmacy pharmacy = PharmacyFactory.build("123", "DolliePharm", "22","32");
        Assertions.assertNotNull(pharmacy);
        System.out.println(pharmacy);
    }
}
