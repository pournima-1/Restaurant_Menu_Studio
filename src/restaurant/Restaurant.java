package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Restaurant {
    public static ArrayList<Menu> arrMenu = new ArrayList<>();
    public static ArrayList<String> arrStringMenu = new ArrayList<>();

    public static void main(String[] args){
        String strAddDecision = "";
        String strRemoveDecision;

        String str1;

        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter menu name: ");
            String strMenuName = input.nextLine();
            if(arrStringMenu.contains(strMenuName)) {
                System.out.println("This menu alredy exists. Enter new menu");
            }
            else {
                do {
                    System.out.println("Enter price in numbers: ");
                    str1 = input.nextLine();
                }while(!str1.matches("^[0.0-9]+$"));
                double dPrice = Double.parseDouble(str1);
                System.out.println("Enter category: ");
                Scanner input1 = new Scanner(System.in);
                String strCategory = input1.nextLine();
                System.out.println("Enter description: ");
                Scanner input7 = new Scanner(System.in);
                String strDescription = input7.nextLine();
                System.out.println("Enter menu date(YYYY-MM-DD): ");
                Scanner input5 = new Scanner(System.in);
                String strDate = input5.nextLine();
                addMenu(strMenuName, dPrice, strCategory, strDate, strDescription);
                System.out.println("Do you want to add another menu?(Y/N): ");
                Scanner input2 = new Scanner(System.in);
                strAddDecision = input2.nextLine();
            }
        }
        while(strAddDecision.equals("Y"));
        displayMenu();
        do{
            System.out.println("Do you want to remove any menu?(Y/N): ");
            Scanner input3 = new Scanner(System.in);
            strRemoveDecision = input3.nextLine();
            if(strRemoveDecision.equals("Y")) {
                System.out.println("Which menu you want to remove?: ");
                Scanner input4 = new Scanner(System.in);
                String strMenuToRemove = input4.nextLine();

                removeMenu(strMenuToRemove);
              //  System.out.println("what" + strMenuToRemove);
            }
        }while(strRemoveDecision.equals(("Y")));


        displayMenu();
    }

    public static void addMenu(String menuName, double price, String category, String menuDate, String desc)
    {
        Menu objMenu = new Menu(menuName);
        objMenu.setPrice(price);
        objMenu.setCategory(category);
        objMenu.setLastUpdated(menuDate);
        objMenu.setDescription(desc);
        arrMenu.add(objMenu);
        arrStringMenu.add(menuName);
    }

    public static void removeMenu(String menuName)
    {
        int iIndex = arrStringMenu.indexOf(menuName);
        //System.out.println(arrMenu);
        //System.out.println(arrMenu.size());
       // System.out.println(iIndex);
        arrMenu.remove(iIndex);
    }

    public static void displayMenu()
    {
        for(int i=0;i<arrMenu.size();i++)
        {
            System.out.println("Menu " + (i+1) + " Name: " + arrMenu.get(i).getMenu());
            System.out.println("Menu " + (i+1) + " Price: " + arrMenu.get(i).getPrice());
            System.out.println("Menu " + (i+1) + " Category: " + arrMenu.get(i).getCategory());
            System.out.println("Menu " + (i+1) + " Description: " + arrMenu.get(i).getDescription());
            System.out.println("Menu " + (i+1) + " LastUpdated: " + arrMenu.get(i).getLastUpdated());
            LocalDate dDate = LocalDate.parse(arrMenu.get(i).getLastUpdated());
           // System.out.println(dDate);
            //System.out.println(LocalDate.now());
           if(dDate.equals(LocalDate.now()))
            {
                System.out.println("Menu " + (i+1) + "New Menu");
            }
            else {
                System.out.println("Menu " + (i+1) + "Old Menu");
            }
        }

    }
}
