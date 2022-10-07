import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("How many objects you want to create?");
        int n = scanner.nextInt();
        ArrayList<Customer> array = new ArrayList<Customer>(n); //arraylist is a generic class with a type parameter. Append class name in angle brackets  

        for(int i=0;i<n;i++){
            System.out.println("Enter value for name " +  (i+1) +"");
            String name = scanner.next();
            System.out.println("Enter value for password " +  (i+1) +"");
            String password = scanner.next();

            try {
               if( ContainNumberException.containsNum(password)==true){
                Customer<String,String> cust = new Customer<String,String>(name,password);
                array.add(cust);
               }
                
            } catch (ContainNumberException e) {
                System.out.println(e.getMessage());
                

                
            }
        }
    }

 
  
}
