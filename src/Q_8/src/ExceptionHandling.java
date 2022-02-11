package Q_8.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("================ Enter Choice ================\n" +
                    "Press 1 for print your name\n" +
                    "Press 2 for divide\n" +
                    "Press 0 for exit");
            choice = sc.nextInt();
            if(choice == 2){
                try {
                    System.out.println("Enter numbers for divide");
                    int a = Integer.parseInt(sc.next());
                    int b = Integer.parseInt(sc.next());
                    System.out.println(a/b);
                }
                catch (ArithmeticException ex){
                    System.out.println("Invalid arguments, you can't divide by zero");
                }catch (NumberFormatException ex){
                    System.out.println("Invalid Input, please enter numbers");
                }catch (InputMismatchException ex){
                    ex.printStackTrace();
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }else if(choice == 1){
                try {
                    System.out.println("Enter your name");
                    String name = sc.next();
                    System.out.println("Hello Mr."+name);
                }catch (NumberFormatException ex){
                    System.out.println("Invalid arguments, you can't divide by zero");
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        }while (choice != 0);
    }
}


