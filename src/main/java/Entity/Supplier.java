package Entity;
/*Supplier.java
Entity for the Supplier
Author : Ilyaas Davids (219466424)
Date : 7 August 2022*/
public class Supplier {
    private String suppId;
    private String suppName;
    private String Contact;
    public String getSuppId() {
        return suppId;
    }
    public String getSuppName() {
        return suppName;
    }
    public String getContact() {
        return Contact;
    }

    public void setSuppId(String suppId) {
        this.suppId = suppId;
    }
    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }
    public void setContact(String Contact) {
        this.Contact = Contact;
    }




    private Supplier(Builder builder){
        this.suppId = builder.suppId;
        this.suppName = builder.suppName;
        this.Contact = builder.Contact;
    }

    public static class Builder{
        private String suppId;
        private String suppName;
        private String Contact;


        public Builder suppId(String suppId){
            this.suppId = suppId;
            return this;
        }

        public Builder suppName(String suppName){
            this.suppName = suppName;
            return this;
        }

        public Builder Contact(String Contact){
            this.Contact = Contact;
            return this;
        }

        public Supplier build(){
            return new Supplier(this);
        }

        public Builder copy(Supplier supplier) {
            this.suppId(supplier.getSuppId());
            return this;
        }
    }


//    public static void main(String[] args){
//        Supplier supplier = new Builder().suppName("AlphaPharm").build();
//        System.out.print(supplier.getSuppName());
//    }

}
