package pentagon.assignments;
import java.util.Scanner;

public class Freshmart1 
{

    static final int MAX_PRODUCTS = 10;
    static int[] productIds = new int[MAX_PRODUCTS];
    static String[] productNames = new String[MAX_PRODUCTS];
    static int[] productQuantities = new int[MAX_PRODUCTS];
    static double[] productPrices = new double[MAX_PRODUCTS];
    static int productCount = 0;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("*****FRESH MENU*****");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Edit/Modify Product");
            System.out.println("4. Buy Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    viewProducts();
                    break;
                case 3:
                    editProduct(scanner);
                    break;
                case 4:
                    buyProduct(scanner);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice!.");
            }
        } while (choice != 5);

        
    }

    public static void addProduct(Scanner scanner) 
    {
        if (productCount >= MAX_PRODUCTS) 
        {
            System.out.println("Cannot add more products");
            return;
        }

        System.out.print("Enter product ID: ");
        productIds[productCount] = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter product name: ");
        productNames[productCount] = scanner.nextLine();
        
        System.out.print("Enter available quantity: ");
        productQuantities[productCount] = scanner.nextInt();
        
        System.out.print("Enter product price: ");
        productPrices[productCount] = scanner.nextDouble();

        productCount++;
        System.out.println("Product added successfully!");
    }

    public static void viewProducts() {
        System.out.println("\nID\tName\t\tQuantity\tPrice");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < productCount; i++) {
            System.out.printf("%d\t%s\t\t%d\t\t%.2f\n", productIds[i], productNames[i], productQuantities[i], productPrices[i]);
        }
    }

    public static void editProduct(Scanner scanner)
    {
        System.out.print("Enter product ID to modify: ");
        int productId = scanner.nextInt();
        int index = findProductIndexById(productId);

        if (index == -1) 
        {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter new product name: ");
        scanner.nextLine(); 
        productNames[index] = scanner.nextLine();
        
        System.out.print("Enter new available quantity: ");
        productQuantities[index] = scanner.nextInt();
        
        System.out.print("Enter new product price: ");
        productPrices[index] = scanner.nextDouble();

        System.out.println("Product updated successfully!");
    }

    public static void buyProduct(Scanner scanner) {
        System.out.print("Enter product ID to buy: ");
        int productId = scanner.nextInt();
        int index = findProductIndexById(productId);

        if (index == -1)
        {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter quantity to buy: ");
        int quantityToBuy = scanner.nextInt();

        if (productQuantities[index] < quantityToBuy)
        {
            System.out.println("Not enough stock available!");
        } else
        {
            productQuantities[index] -= quantityToBuy;
            double totalCost = quantityToBuy * productPrices[index];
            System.out.printf("Purchased successful Total cost: Rs " + totalCost);
        }
    }

    public static int findProductIndexById(int productId) 
    {
        for (int i = 0; i < productCount; i++)
        {
            if (productIds[i] == productId) 
            {
                return i;
            }
        }
        return -1;
    }
}
