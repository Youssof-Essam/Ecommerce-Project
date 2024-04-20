public class Product {
    private int productId;
    private String name;
    private float price;
    
    public Product(int productId,String name,float price){
        this.productId=Math.abs(productId);
        this.price=Math.abs(price);
        this.name=name;
    }

    public int get_product_id(){
        return productId;
    }
    public float get_product_price(){
        return price;
    }
    public String get_product_name(){
        return name;
    }
    public void set_product_name(String name){
        this.name=name;
    }
    public void set_product_id(int productId){
        this.productId=Math.abs(productId);
    }
    public void set_price(float price){
        this.price=Math.abs(price);
    }
}
