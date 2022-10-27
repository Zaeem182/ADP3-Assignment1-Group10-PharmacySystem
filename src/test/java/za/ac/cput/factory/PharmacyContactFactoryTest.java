package za.ac.cput.factory;

/* PharmacyContactFactoryTest.java
FactoryTest for the PharmacyContact
Author: Waseem Dollie (216040566)
Date: 13 October 2022 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Pharmacy;
import za.ac.cput.domain.PharmacyContact;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PharmacyContactFactoryTest {
    @Test
    void testCreatePharmacyContact() {
        PharmacyContact pharmacyContact = PharmacyContactFactory.build("123", "0564236655", "waseem@gmail.com");
        Assertions.assertNotNull(pharmacyContact);
        System.out.println(pharmacyContact);
    }

    @Test
    void testCreatePharmacyContactWithError() {
        PharmacyContact pharmacyContact = PharmacyContactFactory.build("123", "0564236655", "waseem@gmail.com");
        Assertions.assertNotNull(pharmacyContact);
        System.out.println(pharmacyContact);
    }
}