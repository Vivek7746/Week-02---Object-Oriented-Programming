import java.util.*;
class MobilePhone{
    
    // Attributes
    private String Brand;
    private String Model;
    private int Price;

    // Constructor to assign values
    MobilePhone(String Brand, String Model, int Price){
        this.Brand = Brand;
        this.Model = Model;
        this.Price = Price;
    }

    // Method to get Mobile details
    void display(){

        // Displaying all the details
        System.out.println("Phone's Brand : " + Brand);
        System.out.println("Phone's Model : " + Model);
        System.out.println("Phone's Price : " + Price);
    }
}
class PhoneDetail {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Taking inputs from the user
        System.out.print("Enter the Brand's name : ");
        String Brand = input.next();
        System.out.print("Enter the Model number : ");
        String Model = input.next();
        System.out.print("Enter the Price : ");
        int Price = input.nextInt();

        MobilePhone Phone = new MobilePhone(Brand, Model, Price);

        // Displaying the output
        Phone.display();

        input.close();
    }
}