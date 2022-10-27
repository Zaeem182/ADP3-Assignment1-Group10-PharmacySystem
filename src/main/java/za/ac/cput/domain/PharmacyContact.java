package za.ac.cput.domain;

/* Pharmacy.java
Domain for the Pharmacy
Author: Waseem Dollie (216040566)
Date: 10 October 2022 */

import com.sun.istack.NotNull;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class PharmacyContact implements Serializable {

    @Id
    private String  pharmId;

    @Embedded
    private String contactNumber;
    private String email;


    protected PharmacyContact() {}

    PharmacyContact(Builder builder){
        this.pharmId = builder.pharmId;
        this.contactNumber = builder.contactNumber;
        this.email = builder.email;
    }

    public String getPharmId() {
        return pharmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PharmacyContact that = (PharmacyContact) o;
        return pharmId.equals(that.pharmId) && contactNumber.equals(that.contactNumber) && email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pharmId, contactNumber,email);
    }

    @Override
    public String toString() {
        return "PharmacyContact{" +
                "pharmId='" + pharmId + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private String pharmId;
        private String contactNumber;
        private String email;

        public Builder pharmId(String pharmId) {
            this.pharmId = pharmId;
            return this;
        }

        public Builder contactNumber(String contactNumber){
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }


        public Builder copy(PharmacyContact pharmacyContact) {
            this.pharmId = pharmacyContact.pharmId;
            this.contactNumber = pharmacyContact.contactNumber;
            this.email = pharmacyContact.email;
            return this;
        }

        public PharmacyContact build() {return new PharmacyContact(this);}


    }


}

