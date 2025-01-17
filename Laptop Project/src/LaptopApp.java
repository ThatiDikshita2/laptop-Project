import java.util.*;
import java.util.stream.Collectors;

public class LaptopApp {

    // A list to hold laptop objects
    private static List<Laptop> laptops = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Main menu loop
        do {
            System.out.println("\n1. Add Laptop Details");
            System.out.println("2. Display All Laptop Details");
            System.out.println("3. Update Laptop Details");
            System.out.println("4. Delete Laptop Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addLaptopDetails(scanner);
                    break;
                case 2:
                    displayAllLaptops();
                    break;
                case 3:
                    updateLaptopDetails(scanner);
                    break;
                case 4:
                    deleteLaptopDetails(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Method to add laptop details
    private static void addLaptopDetails(Scanner scanner) {
        System.out.print("Enter laptop ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter laptop brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter laptop model: ");
        String model = scanner.nextLine();
        System.out.print("Enter laptop price: ");
        double price = scanner.nextDouble();

        Laptop newLaptop = new Laptop(id, brand, model, price);
        laptops.add(newLaptop);
        System.out.println("Laptop details added successfully.");
    }

    // Method to display all laptop details
    private static void displayAllLaptops() {
        if (laptops.isEmpty()) {
            System.out.println("No laptops found.");
        } else {
            System.out.println("\nLaptop Details:");
            laptops.forEach(System.out::println);
        }
    }

    // Method to update laptop details
    private static void updateLaptopDetails(Scanner scanner) {
        System.out.print("Enter the ID of the laptop to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Laptop laptopToUpdate = laptops.stream()
                                       .filter(l -> l.getId() == id)
                                       .findFirst()
                                       .orElse(null);

        if (laptopToUpdate != null) {
            System.out.print("Enter new brand (current: " + laptopToUpdate.getBrand() + "): ");
            String brand = scanner.nextLine();
            System.out.print("Enter new model (current: " + laptopToUpdate.getModel() + "): ");
            String model = scanner.nextLine();
            System.out.print("Enter new price (current: " + laptopToUpdate.getPrice() + "): ");
            double price = scanner.nextDouble();

            laptopToUpdate.setBrand(brand);
            laptopToUpdate.setModel(model);
            laptopToUpdate.setPrice(price);

            System.out.println("Laptop details updated successfully.");
        } else {
            System.out.println("Laptop with ID " + id + " not found.");
        }
    }

    // Method to delete laptop details
    private static void deleteLaptopDetails(Scanner scanner) {
        System.out.print("Enter the ID of the laptop to delete: ");
        int id = scanner.nextInt();

        boolean removed = laptops.removeIf(l -> l.getId() == id);
        if (removed) {
            System.out.println("Laptop details deleted successfully.");
        } else {
            System.out.println("Laptop with ID " + id + " not found.");
        }
    }
}