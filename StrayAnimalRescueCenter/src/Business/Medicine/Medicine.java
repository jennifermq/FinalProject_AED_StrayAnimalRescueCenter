/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

/**
 *
 * @author user
 */
public abstract class Medicine {
    private String name;
    private int medicineId;
    private String vendor;
    private MedicineType type;

    private static int count;
    
    public Medicine() {
        this.medicineId = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public MedicineType getType() {
        return type;
    }

    public void setType(MedicineType type) {
        this.type = type;
    }
    
    public enum MedicineType {
        Anesthetics("Anesthetics"),
        Antibiotics("Antibiotics"),
        Vaccination("Vaccination"),
        Other("Other");
            
        private String value;

        private MedicineType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    @Override
    public String toString() {
        return type.getValue() + " " + String.valueOf(count) + ": " + name;
    }
    
}
