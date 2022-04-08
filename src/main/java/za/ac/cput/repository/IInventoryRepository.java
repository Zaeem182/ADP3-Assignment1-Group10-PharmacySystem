/*
 *  Name: Siphosethu Feni
 *  Student Number: 217237614
 *  Group: 10
 */

package za.ac.cput.repository;



import za.ac.cput.entity.Inventory;

import java.util.Set;

public interface IInventoryRepository extends IRepository<Inventory, String> {
    public Set<Inventory> getAll();
}
