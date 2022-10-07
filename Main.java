import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("How many objects you want to create?");
        int n = scanner.nextInt();
        ArrayList<Customer> array = new ArrayList<Customer>(n); //arraylist is a generic class with a type parameter. Append class name in angle brackets  

        for(int i=0;i<n;i++){
            System.out.println("Input name"+i+1+":");
            String name = scanner.nextLine();
            System.out.println("Input password"+i+1+":");
            String password = scanner.nextLine();
            Customer<String,String> cust = new Customer<String,String>(name,password);
            System.out.println(cust.getName());
            System.out.println(cust.getPassword());
            array.add(cust);
        }

       
       

    }
}
