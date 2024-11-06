
import java.util.Scanner;
public class Customer {


    public static void main(String[] args){

        Scanner myScan = new Scanner(System.in);

        String[] customer = new String[4];

        customer[0] = "customerId";
        customer[1] = "name";
        customer[2] = "email";
        customer[3] = "phoneNumber";

        for (int i = 0; i < customer.length; i++){
            System.out.println("Enter the customer Details customerId, Name, email, phonenumber" + (i+1) + "i");
            customer[i] = Scanner.next();
        }

        for (int i = 0; i < customer.length; i++){
            System.out.println("Entered for each field " + (i+1) + "i");
            customer[i]
        }



    }
}
