package za.ac.cput.Factory;
/*MedicationFactory.java
Factory for the Medication
Author : Ilyaas Davids (219466424)
Date : 10 April 2022*/
import za.ac.cput.Entity.Medication;
import za.ac.cput.Util.IlyaasHelper;

public class MedicationFactory {

    public static Medication createMedication(String SuppID,String MedName,String MedManuf){
        String mID = IlyaasHelper.GenerateId();
        if (IlyaasHelper.isNullorEmpty(MedName)||IlyaasHelper.isNullorEmpty(MedManuf)){
            return null;
        }

        Medication medication = new Medication.Builder().medId(mID)
                .suppId(SuppID)
                .medName(MedName)
                .medManuf(MedManuf)
                .build();
        return medication;
    }

}
