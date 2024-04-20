public class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;

    public ElectronicProduct(
        int productId,
        String name,
        float price,
        String brand,
        int warrantyPeriod){
            super(productId,name,price);
            this.brand=brand;
            this.warrantyPeriod=Math.abs(warrantyPeriod);
    }
    public String get_brand(){
        return brand;
    }
    public int get_warranty_period(){
        return warrantyPeriod;
    }
    public void set_brand(String brand){
        this.brand=brand;
    }
    public void set_warranty_period(int warrantyPeriod){
        this.warrantyPeriod=Math.abs(warrantyPeriod);
    }
}
