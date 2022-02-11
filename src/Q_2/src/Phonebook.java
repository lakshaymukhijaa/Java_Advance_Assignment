package Q_2.src;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<String, String>();
//        Getting choice of user
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("==================== Phone Book ====================\n"+
                    "Press 1 to Add new entry in the phonebook\n" +
                    "Press 2 to Search a Phone Number\n" +
                    "Press 3 to Exit");
            choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("Enter contact's name");
                String name = scanner.next();
                System.out.println("Enter contact's number");
                String phone = scanner.next();
                phoneBook.put(name, phone);
            }
            else if (choice == 2){
                System.out.println("Enter a name to find contact");
                String name = scanner.next();

                if(phoneBook.containsKey(name)){
                    String phone =phoneBook.get(name);
                    System.out.println("Contact Name: "+name+"" +
                            "\nContact Number: "+phoneBook.get(name));
                }
            }

        }while (choice != 3);
    }
}


