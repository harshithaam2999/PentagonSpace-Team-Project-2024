package pentagon.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Freshmart {
    static ArrayList<Product> products = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        while (true) {
            System.out.println("\nFreshmart Menu:");
            System.out.println("1. Add product");
            System.out.println("2. View products");
            System.out.println("3. Edit/Modify product");
            System.out.println("4. Buy product");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // this line is used to consume the newline character

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    viewProducts();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    buyProduct();
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void addProduct() {
        System.out.print("Enter product ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter available quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        products.add(new Product(id, name, quantity, price));
        System.out.println("Product added successfully");
    }

    static void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available:");
            return;
        }
        System.out.println(String.format("%-10s %-20s %-10s %-10s", "Product ID", "Product Name", "Quantity", "Price"));
        System.out.println("--------------------------------------------------------");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    static void editProduct() {
        System.out.print("Enter the product ID to modify: ");
        String id = scanner.nextLine();
        for (Product product : products) {
            if (product.p_id.equals(id)) {
                System.out.print("Enter new product name (leave blank to keep current): ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) {
                    product.p_name = name;
                }

                System.out.print("Enter new available quantity (leave blank to keep current): ");
                String quantityStr = scanner.nextLine();
                if (!quantityStr.isEmpty()) {
                    int quantity = Integer.parseInt(quantityStr);
                    product.quantity = quantity;
                }

                System.out.print("Enter new price (leave blank to keep current): ");
                String priceStr = scanner.nextLine();
                if (!priceStr.isEmpty()) {
                    double price = Double.parseDouble(priceStr);
                    product.price = price;
                }
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    static void buyProduct() {
        System.out.print("Enter the product ID to buy: ");
        String id = scanner.nextLine();
        for (Product product : products) {
            if (product.p_id.equals(id)) {
                System.out.print("Enter quantity to buy: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                if (quantity <= product.quantity) {
                    product.quantity -= quantity;
                    double totalPrice = quantity * product.price;
                    System.out.println("Purchased successfully! Total price is: " + totalPrice);
                } else {
                    System.out.println("Insufficient quantity available");
                }
                return;
            }
        }
        System.out.println("Product not found!");
    }
}


