/*
 *  Name: Abongile Tshopi
 *  Student Number: 214254151
 *  Group: 23
 */
package za.ac.cput.repository;

import za.ac.cput.entity.Inventory;
import za.ac.cput.entity.JobTitle;

import java.util.HashSet;
import java.util.Set;


public class InventoryRepositoryImpl implements IInventoryRepository {

    private static InventoryRepositoryImpl repository = null;
    private Set<Inventory> inventoryDB;

    private InventoryRepositoryImpl(){
        this.inventoryDB = new HashSet<>();
    }

    public static InventoryRepositoryImpl getRepository() {
        if (repository == null) {
            repository = new InventoryRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Inventory create(Inventory inventory) {
        this.inventoryDB.add(inventory);
        return inventory;
    }

    @Override
    public JobTitle read(String inventoryID) {
        for (Inventory Inv : inventoryDB){
            if (Inv.getInventoryID().equals(inventoryID)){
                return Inv;
            }
        }
        return null;
    }

    @Override
    public Inventory update(Inventory inventory) {
        Inventory inv1 = read(inventory.getInventoryID());
        if (inv1 != null){
            inventoryDB.remove(inv1);
            inventoryDB.add(inventory);
            return inventory;
        }
        return null;
    }

    @Override
    public boolean delete(String inventoryID) {
        Inventory deleteInventory = read((inventoryID));
        if (deleteInventory== null) {
            System.out.println("Inventory is null");
            return false;
        }

        inventoryDB.remove(deleteInventory);
        System.out.println("Inventory is removed");
        return true;
    }

    @Override
    public Set<Inventory> getAll() {
        return inventoryDB;
    }
}
