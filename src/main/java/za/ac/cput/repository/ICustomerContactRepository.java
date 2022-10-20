/**
 * Author: Siphosethu Feni
 * Student Number: 217237614
 *  *  Project Group: 10
 * ICustomerContactRepository.java
 */

package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.CustomerContact;

import java.util.List;

@Repository
public interface ICustomerContactRepository extends JpaRepository<CustomerContact, Long> {
    List<CustomerContact> findAllByCustomerId(String customerId);
    List<CustomerContact> findAllByContactId(String contactId);
}
