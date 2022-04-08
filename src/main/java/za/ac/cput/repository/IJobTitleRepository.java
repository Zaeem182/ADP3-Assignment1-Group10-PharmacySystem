/*
 *  Name: Siphosethu Feni
 *  Student Number: 217237614
 *  Group: 10
 */

package za.ac.cput.repository;


import za.ac.cput.entity.JobTitle;

import java.util.Set;

public interface IJobTitleRepository extends IRepository<JobTitle, String> {
    public Set<JobTitle> getAll();
}
