package Q_14.src;

import javax.lang.model.element.Name;
import java.util.Scanner;
import java.util.Vector;

public class NameApplication {
    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Name> vector= new Vector<>();
        int option;
        do {
            System.out.println("========= Enter your choice =========" +
                    "\n Press 1: to Enter First name and last Name" +
                    "\n Press 2: to print the number of Total names" +
                    "\n Press 3: for exit application");
            option = scanner.nextInt();
            if(option == 1){
                System.out.println("Enter First Name");
                scanner.next();
                System.out.println("Enter Last Name");
                scanner.next();

                vector.add(null);
            }else if(option == 2){
                System.out.println("Total Names in Vector: "+vector.size());
            }
        }while (option != 3);
        System.out.println("Application Closed");
    }
}