package pentagon.assignments;

import java.util.Scanner;

class CoffeeShop
{
    int Cappuccino = 200;
    int Espresso = 250;
    int Americano = 300;
    int Ginger_Tea = 180;
    int Cardamon_Tea = 250;
    int Masala_Tea = 100;
    int Puneri_Elaichi_Tea = 280;
    int Sandwich_Combo = 380;
    int Burger_Combo = 299;
    int Bread_Toast_Combo = 199;
    int Samosa_Combo = 159;
    
    public void displayCoffeeDetails() 
    {
        System.out.println("1. Espresso - " + Espresso);
        System.out.println("2. Cappuccino - " + Cappuccino);
        System.out.println("3. Americano - " + Americano);
    }
    
    public void displayTeaDetails() 
    {
        System.out.println("1. Ginger Tea - " + Ginger_Tea);
        System.out.println("2. Cardamon Tea - " + Cardamon_Tea);
        System.out.println("3. Masala Tea - " + Masala_Tea);
        System.out.println("4. Puneri Elaichi Tea - " + Puneri_Elaichi_Tea);
    }
    
    public void displayBrunchComboDetails()
    {
        System.out.println("1. Sandwich Combo - " + Sandwich_Combo);
        System.out.println("2. Burger Combo - " + Burger_Combo);
        System.out.println("3. Bread Toast Combo - " + Bread_Toast_Combo);
        System.out.println("4. Samosa Combo - " + Samosa_Combo);        
    }
}

public class MenuOfCoffeeShop
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        CoffeeShop cs = new CoffeeShop();
        int total = 0;
        
        while (true)
        {
            System.out.println("***WELCOME TO STORIES***");
            System.out.println("1. Order Coffee");
            System.out.println("2. Order Tea");
            System.out.println("3. Order Brunch Combo");
            System.out.println("4. Make Payment");
            System.out.println("5. Exit");
            
            int choice = scan.nextInt();
            
            if (choice == 1) 
            {
                cs.displayCoffeeDetails();
                System.out.println("Enter the number of coffee to get order (1, 2 or 3) :");
                int coffeeChoice = scan.nextInt();
                System.out.println("Enter Quantity:");
                int quantity = scan.nextInt();
                
                switch (coffeeChoice) 
                {
                    case 1:
                        total += cs.Espresso * quantity;
                        break;
                    case 2:
                        total += cs.Cappuccino * quantity;
                        break;
                    case 3:
                        total += cs.Americano * quantity;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
            else if (choice == 2) 
            {
                cs.displayTeaDetails();
                System.out.println("Enter tea number to order (1, 2, 3, or 4):");
                int teaChoice = scan.nextInt();
                System.out.println("Enter Quantity:");
                int quantity = scan.nextInt();
                
                switch (teaChoice) 
                {
                    case 1:
                        total += cs.Ginger_Tea * quantity;
                        break;
                    case 2:
                        total += cs.Cardamon_Tea * quantity;
                        break;
                    case 3:
                        total += cs.Masala_Tea * quantity;
                        break;
                    case 4:
                        total += cs.Puneri_Elaichi_Tea * quantity;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
            else if (choice == 3) 
            {
                cs.displayBrunchComboDetails();
                System.out.println("Enter combo number to order (1, 2, 3, or 4):");
                int comboChoice = scan.nextInt();
                System.out.println("Enter Quantity:");
                int quantity = scan.nextInt();
                
                switch (comboChoice) 
                {
                    case 1:
                        total += cs.Sandwich_Combo * quantity;
                        break;
                    case 2:
                        total += cs.Burger_Combo * quantity;
                        break;
                    case 3:
                        total += cs.Bread_Toast_Combo * quantity;
                        break;
                    case 4:
                        total += cs.Samosa_Combo * quantity;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
            else if (choice == 4) 
            {
                System.out.println("Total Price: " + total);
                System.out.println("Payment successful. Thank you for your order!");
                total = 0; // Reset total after payment
            }
            else if (choice == 5) 
            {
                System.out.println("Exiting. Have a great day!");
                break;
            }
            else 
            {
                System.out.println("Invalid choice.");
            }
        }
        
        scan.close();
    }
}
