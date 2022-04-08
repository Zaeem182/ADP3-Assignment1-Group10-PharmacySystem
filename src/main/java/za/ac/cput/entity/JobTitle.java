/*
 *  Name: Siphosethu Feni
 *  Student Number: 217237614
 *  Group: 10
 *
 */

package za.ac.cput.entity;

public class JobTitle {

    private String employeeID;
    private static String secretaryID;
    private String doctorID;

    private JobTitle(Builder builder) {
        this.employeeID=builder.employeeID;
        this.secretaryID =builder.secretaryID;
        this.doctorID = builder.doctorID;
    }

    public String getEmployeeID() {
        return employeeID;
    }
    public static String getSecretaryID() {
        return secretaryID;
    }
    public String getDoctorID() {
        return doctorID;
    }

    public static class Builder {
        private String employeeID;
        private String secretaryID;
        private String doctorID;


        public Builder setEmployeeID(String employeeID) {
            this.employeeID = employeeID;
            return this;
        }

        public Builder setSecretaryID(String SecretaryID) {
            this.secretaryID = secretaryID;
            return this;
        }

        public Builder setDoctorID(String doctorID) {
            this.doctorID = doctorID;
            return this;
        }


        public JobTitle build() {
            return new JobTitle(this);
        }

        public Builder copy(JobTitle jobTitle) {
            this.employeeID = jobTitle.employeeID;
            this.secretaryID = jobTitle.secretaryID;
            this.doctorID = jobTitle.doctorID;
            return this;
        }
    }

    @Override
    public String toString() {
        return "JobTitleFactory{" +
                "employeeID='" + employeeID + '\'' +
                ", secretaryID='" + secretaryID + '\'' +
                ", doctorID='" + doctorID + '\'' +
                '}';
    }
}

