/*
 *  Name: Siphosethu
 *  Student Number: 217237614
 *  Group: 10
 *
 */

package za.ac.cput.factory;

import za.ac.cput.entity.Inventory;
import za.ac.cput.util.SiphosethuHelper;

public class InventoryFactory {
    public static Inventory createAppointment(String medicationID, int tableStockAmount,
                                              int medicineStockAmount) {


        String InventoryID = SiphosethuHelper.generateID();
        Inventory Invent = new Inventory.Builder().setTableStockAmount(tableStockAmount)
                .setInventoryID(InventoryID)
                .setMedicationID(medicationID)
                .setTableStockAmount(tableStockAmount)
                .setMedicineStockAmount(medicineStockAmount)
                .build();
        return Invent;
    }
}
