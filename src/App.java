import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =new Scanner(System.in);
        
        ElectronicProduct electronicProduct=new ElectronicProduct(1, "smartphone", 599.99f, "Samsung", 1);
        ClothingProduct clothingProduct=new ClothingProduct(2, "T-Shirt", 19.99f, "Medium", "Cotton");
        BookProduct bookProduct=new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X Publications");

        System.out.print("Enter your name: ");
        String name=input.nextLine();
        System.out.print("Enter your ID:");
        int id=input.nextInt();
        input.nextLine();
        System.out.print("Enter your address:");
        String address=input.nextLine();
        Customer customer=new Customer(id, name, address);

        System.out.print("How many products do you wish to add to your cart?:");
        int nProducts=input.nextInt();
        Cart cart=new Cart(customer, nProducts);
        for (int i = 0; i < cart.get_nProducts(); ) {
            
            System.out.print("Enter 1 for smartphone, 2 for T-Shirt, or 3 for OOP: ");
            int choice=Math.abs(input.nextInt());
            switch (choice) {
                case 1:
                    cart.addProduct(electronicProduct);
                    i++;
                    break;
                case 2:
                    cart.addProduct(clothingProduct);
                    i++;
                    break;
                case 3:
                    cart.addProduct(bookProduct);
                    i++;
                    break;
                default:
                    System.out.println("Please Enter a Correct value");
                    
                    
            }


        }
        System.out.print("Your total is "+cart.calculate_price()+", Press 1 to confirm Order or 2 to cancel:");
        int choice=input.nextInt();
        if(choice==1){
            Order order=cart.placeOrder(1);
            order.printOrderInfo();
        }
        else{
            System.out.println("Order Cancelled!!");
        }
        
        
    }
}
