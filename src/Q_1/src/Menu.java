package Q_1.src;

import java.time.LocalTime;
import java.util.ArrayList;

public class Menu {
    static ArrayList<Dish> menuList;

    //     Using static block
    static {
//       Adding some dishes by using Dish class
        Dish Shahi_Paneer= new Dish(1, "Shahi Paneer", LocalTime.now());
        Dish Dal_Makhni= new Dish(2, "Dal Makhni", LocalTime.now());
        Dish Malai_Kofta= new Dish(3, "Malai Kofta", LocalTime.now());
        Dish Dum_Aloo= new Dish(4, "Dum Aloo", LocalTime.now());
        Dish Cutlet= new Dish(5, "Cutlet", LocalTime.now());

//        Adding all created dishes to arraylist
        menuList = new ArrayList<Dish>();
        menuList.add(Shahi_Paneer);
        menuList.add(Dal_Makhni);
        menuList.add(Malai_Kofta);
        menuList.add(Dum_Aloo);
        menuList.add(Cutlet);
    }
}


