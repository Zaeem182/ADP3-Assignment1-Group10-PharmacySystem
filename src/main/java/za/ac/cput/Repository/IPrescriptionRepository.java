/* IPrescriptionRepository.java
 Prescription Repository Interface
 Author: Zaeem Petersen (219010145)
 Date: 07 April 2022
*/
package za.ac.cput.Repository;

import za.ac.cput.Entity.Prescription;

import java.util.Set;

public interface IPrescriptionRepository extends IRepository<Prescription, Integer> {

    public Set<Prescription> getAll();
}
