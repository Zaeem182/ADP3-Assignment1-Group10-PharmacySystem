/* ICustomerRepository.java
 Customer  Repository Interface
 Author: Zaeem Petersen (219010145)
 Date: 07 April 2022
*/

package za.ac.cput.Repository;

import za.ac.cput.Entity.Customer;

import java.util.Set;

public interface ICustomerRepository extends IRepository<Customer, Integer> {

    public Set<Customer> getAll();
}
