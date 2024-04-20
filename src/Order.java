public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;
    private int nProducts;

    public Order(Cart cart,int orderId){
        this.customerId=cart.get_customerId();
        this.orderId=orderId;
        this.nProducts=cart.get_nProducts();
        products=cart.get_products();
        totalPrice=cart.calculate_price();
    }
    public void printOrderInfo(){
        System.out.println("Here's your order's summary:");
        System.out.println("Order ID: "+ orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");

        for(int i=0;i<nProducts;i++){
            System.out.println(products[i].get_product_name() + " - " + products[i].get_product_price()+"$");
        }
        System.out.println("Total Price: "+totalPrice+"$");

    }
}
