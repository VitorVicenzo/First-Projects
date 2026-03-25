package stock.Entities.Product;

public class Product_Id {

    /* Encapsulation */
    private String name;
    private double price;
    private int quantity;

    /* Constructors */
    public Product_Id(){
    }

    public Product_Id(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product_Id(String name, double price){
        this.name = name;
        this.price = price;
    }

    /* Getters and Setters */
   public String getName(){
    return name;
   }

   public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    /* Data treatment */
    public double totalValueInStock(){
        
        return quantity * price;
         
    }

    public void addProducts(int quantity){
        
        this.quantity += quantity;

    }

    public void removeProducts(int quantity){

        this.quantity -= quantity;

    }

    public String toString(){

        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueInStock());

    }

    
}
