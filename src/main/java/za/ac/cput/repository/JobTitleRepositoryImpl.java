/*
 *  Name: Abongile Tshopi
 *  Student Number: 214254151
 *  Group: 23
 */
package za.ac.cput.repository;

import za.ac.cput.entity.JobTitle;

import java.util.HashSet;
import java.util.Set;


public class JobTitleRepositoryImpl implements IJobTitleRepository {

    private static JobTitleRepositoryImpl repository = null;
    private Set<JobTitle> jobTitleDB;

    private JobTitleRepositoryImpl(){
        this.jobTitleDB = new HashSet<>();
    }

    public static JobTitleRepositoryImpl getRepository() {
        if (repository == null) {
            repository = new JobTitleRepositoryImpl();
        }
        return repository;
    }


    public JobTitle create(JobTitle jobTitle) {
        this.jobTitleDB.add(jobTitle);
        return jobTitle;
    }

    @Override
    public JobTitle read(String doctorID) {
        for (JobTitle job : jobTitleDB){
            if (job.getDoctorID().equals(doctorID)){
                return job;
            }
        }
        return null;
    }

    @Override
    public JobTitle update(JobTitle jobTitle) {
        JobTitle job1 = read(JobTitle.getSecretaryID());
        if (job1 != null){
            jobTitleDB.remove(job1);
            jobTitleDB.add(jobTitle);
            return jobTitle;
        }
        return null;
    }

    @Override
    public boolean delete(String employeeID) {
        JobTitle deleteJobTitle = read((employeeID));
        if (deleteJobTitle== null) {
            System.out.println("Job Title is null");
            return false;
        }

        jobTitleDB.remove(deleteJobTitle);
        System.out.println("JobTitle is removed");
        return true;
    }

    @Override
    public Set<JobTitle> getAll() {
        return jobTitleDB;
    }
}
