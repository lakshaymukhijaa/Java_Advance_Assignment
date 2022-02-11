package Q_1.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        ArrayList<Dish> dishes = Menu.menuList;

        do {
            System.out.println("===================== Restaurant =====================" +
                    "\n Press 1 To Display Dishes."+
                    "\n Press 2 To Search For Dish"+
                    "\n Press 0 to Quit");
            choice = scanner.nextInt();
            if (choice == 1) {
                dishes.forEach((Dish dish)->System.out.println(dish));
            }else if(choice == 2){
                int id = scanner.nextInt();
                if(id < 1 || id > dishes.size()){
                    System.out.println("Dish not available");
                }
                else {
                    for (int i=0; i<dishes.size();i++){
                        if (dishes.get(i).dishID == id){
                            System.out.println("Dish found successfully...");
                            System.out.println(dishes.get(i));
                        }
                    }
                }
            }
        }
        while (choice != 0);
    }
}


