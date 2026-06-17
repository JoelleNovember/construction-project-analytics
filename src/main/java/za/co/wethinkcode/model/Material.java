package za.co.wethinkcode.model;

public class Material {
    //Attributes of Material
    private String materialId;
    private String materialName;
    private int  quantity;
    private double price;

    //Constructor
    public Material(String materialId, String materialName, int quantity,
                    double price){
        this.materialId = materialId;
        this.materialName = materialName;
        this.quantity = quantity;
        this.price = price;
    }

    //Getters-allow other classes to READ the values
    public String getMaterialId() {return materialId;}
    public String getMaterialName(){return materialName;}
    public int getQuantity(){return quantity;}
    public double getPrice(){return price;}

    //Calculate total cost for this material (quantity X price)
    public double getTotalCost(){
        return quantity * price;
    }

    //This controls how a MAterial prints when you use System,out.println()
    @Override
    public String toString(){
        return materialName + " | Quantity: " + quantity + " | Price: R" + price + " | Total: R" + getTotalCost();
    }
}
