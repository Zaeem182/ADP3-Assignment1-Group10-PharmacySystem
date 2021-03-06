package za.ac.cput.Factory;

/** EmployeeContactFactoryTest.java
 * Test for the EmployeeContactFactory
 * Author: Daniella Burgess (219446482)
 * Date: 08 April 2022
 */


import za.ac.cput.Entity.EmployeeContact;
import za.ac.cput.Factory.EmployeeContactFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeContactFactoryTest {

@Test
  public void test() {
      EmployeeContact employeeContact = EmployeeContactFactory.createEmployeeContact("1", "0672664466","Phone number");
    System.out.println(employeeContact);
      assertNotNull(employeeContact);
  }


}