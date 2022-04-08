/**
 * Author: Siphosethu Feni
 * Inventory.java
 */
package za.ac.cput.entity;

public class Inventory {
    private int tableStockAmount, medicineStockAmount;
    private String inventoryID, medicationID;


    public Inventory(String inventoryID, String medicationID, int tableStockAmount, int medicineStockAmount) {
        this.inventoryID = inventoryID;
        this.medicationID = medicationID;
        this.tableStockAmount = tableStockAmount;
        this.medicineStockAmount = medicineStockAmount;
    }

    private Inventory(Builder builder)
    {
        this.inventoryID = inventoryID;
        this.medicationID = medicationID;
        this.tableStockAmount = tableStockAmount;
        this.medicineStockAmount = medicineStockAmount;

    }

    public String getInventoryID() {
        return inventoryID;
    }

    public String getMedicationID() {
        return medicationID;
    }

    public int getTableStockAmount() {
        return tableStockAmount;
    }

    public int getMedicineStockAmount() {
        return medicineStockAmount;
    }


    public static class Builder {

        private int  tableStockAmount, medicineStockAmount;
        private String inventoryID, medicationID;


        public Builder setInventoryID(String inventoryID) {
            this.inventoryID = inventoryID;
            return this;
        }

        public Builder setMedicationID(String MedicationID) {
            this.medicationID = medicationID;
            return this;
        }

        public Builder setTableStockAmount(int tableStockAmount) {
            this.tableStockAmount = tableStockAmount;
            return this;
        }

        public Builder setMedicineStockAmount(int MedicineStockAmount) {
            this.medicineStockAmount = medicineStockAmount;
            return this;
        }

        public Inventory build(){

            return new Inventory(this);
        }

        public Builder copy(Inventory I){
            this.inventoryID = I.inventoryID;
            this.medicationID = I.medicationID;
            this.tableStockAmount = I.tableStockAmount;
            this.medicineStockAmount = I.medicineStockAmount;
            return this;
        }


        @Override
        public String toString() {
            return "Builder{" +
                    "inventoryID='" + inventoryID + '\'' +
                    ", medicationID='" + medicationID + '\'' +
                    ", tableStockAmount='" + tableStockAmount + '\'' +
                    ", medicineStockAmount='" + medicineStockAmount + '\'' +
                    '}';
        }
    }

}
