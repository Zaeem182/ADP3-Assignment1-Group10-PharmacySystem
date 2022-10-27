package za.ac.cput.factory;

/* PharmacyContactFactory.java
Factory for the PharmacyContact
Author: Waseem Dollie (216040566)
Date: 11 October 2022 */

import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Pharmacy;
import za.ac.cput.domain.PharmacyContact;
import za.ac.cput.util.StringHelper;

public class PharmacyContactFactory {
    public static PharmacyContact build(String pharmId, String contactNumber, String email){

        if(StringHelper.isNullorEmpty(pharmId) || StringHelper.isNullorEmpty(contactNumber) || StringHelper.isNullorEmpty(email) ){
            throw new IllegalArgumentException("pharmId or contactNumber is null or empty");
        }

        return new PharmacyContact.Builder().pharmId(pharmId)
                .contactNumber(contactNumber)
                .email(email)
                .build();
    }
}
