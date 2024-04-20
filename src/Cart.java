public class Cart {
    private int customerId;
    private int nProducts;
    private Product[] products;
    private int current_index;
    public Cart(Customer customer,int nProducts){
        this.customerId=customer.get_customerId();
        this.nProducts=Math.abs(nProducts);
        products=new Product[this.nProducts];
        current_index=0;
    }
    public int get_customerId(){
        return customerId;
    }
    public int get_nProducts(){
        return nProducts;
    }
    public Product[] get_products(){
        return products;
    }
    public void set_customerId(Customer customer){
        this.customerId=customer.get_customerId();
    }
    
    public void addProduct(Product product){
        if (current_index<nProducts){
            products[current_index]=product;
            current_index++;
        }
        else{
            System.out.println("Cart is Full!!");
        }
    }
    public void remove_product(int index){
        products[index]=null;
    }
    public float calculate_price(){
        float price=0;
        for (Product product : products) {
            price+=product.get_product_price();
        }
        return price;
    }
    public Order placeOrder(int orderId){
        Order order=new Order(this, orderId);
        return order;
    }
}
