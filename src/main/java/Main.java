import za.co.wethinkcode.model.Material;

public class Main {
    public static void main(String[] args){
        Material material = new Material(
                "M001",
                "Cement",
                10,
                120.56
        );

        //Print the object
        System.out.println(material);

        //Print individual values;
        System.out.println("ID: " + material.getMaterialId());
        System.out.println("Name: " + material.getMaterialName());
        System.out.println("Quantity: " + material.getQuantity());
        System.out.println("Price: " + material.getPrice());
        System.out.println("Total Cost : R" + material.getTotalCost());



    }
}
