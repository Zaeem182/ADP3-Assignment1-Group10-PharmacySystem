//*
//        *  Name: Siphosethu
//        *  Student Number: 217237614
//        *  Group: 10
//        *
//        */

package za.ac.cput.factory;



import za.ac.cput.entity.JobTitle;
import za.ac.cput.util.SiphosethuHelper;

public class JobTitleFactory {
    public static JobTitle createJobTitle(String doctorID, String secretaryID) {


        String employeeId = SiphosethuHelper.generateID();
        JobTitle jobTitle = new JobTitle.Builder().setEmployeeID(employeeId)
                .setDoctorID(doctorID)
                .setSecretaryID(secretaryID)
                .build();
        return jobTitle;
    }
}
