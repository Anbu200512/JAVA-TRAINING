import java.util.*;

public class PlatrFoodDelivery {

    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, String> users = new HashMap<>();
    private static Map<String, Map<String, Double>> restaurants = new LinkedHashMap<>();
    private static Map<String, Integer> cart = new LinkedHashMap<>();

    public static void main(String[] args) {
        setupRestaurants();
        while (true) {
            showWelcomeMenu();
            int choice = getIntInput("Choose an option: ");
            if (choice == 1) {
                if (login()) {
                    orderFlow();
                }
            } else if (choice == 2) {
                signup();
            } else if (choice == 3) {
                System.out.println("Goodbye! 👋");
                break;
            } else {
                System.out.println("Invalid option, try again.");
            }
        }
        scanner.close();
    }

    private static void setupRestaurants() {
        Map<String, Double> pizzaHutMenu = new LinkedHashMap<>();
        pizzaHutMenu.put("Margherita", 8.0);
        pizzaHutMenu.put("Farmhouse", 10.0);
        pizzaHutMenu.put("Paneer Pizza", 9.0);

        Map<String, Double> burgerKingMenu = new LinkedHashMap<>();
        burgerKingMenu.put("Whopper", 12.0);
        burgerKingMenu.put("Chicken Fries", 6.0);
        burgerKingMenu.put("Veggie Burger", 8.0);

        Map<String, Double> subwayMenu = new LinkedHashMap<>();
        subwayMenu.put("Veg Sub", 7.0);
        subwayMenu.put("Chicken Sub", 9.0);
        subwayMenu.put("Paneer Sub", 8.0);

        restaurants.put("Pizza Hut", pizzaHutMenu);
        restaurants.put("Burger King", burgerKingMenu);
        restaurants.put("Subway", subwayMenu);
    }

    private static void showWelcomeMenu() {
        System.out.println("=============================");
        System.out.println("      Welcome to Platr 🍔");
        System.out.println("=============================");
        System.out.println("1. Login");
        System.out.println("2. Signup");
        System.out.println("3. Exit");
    }

    private static boolean login() {
        System.out.println("\n--- Login ---");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful! ✅\n");
            return true;
        } else {
            System.out.println("Invalid credentials ❌\n");
            return false;
        }
    }

    private static void signup() {
        System.out.println("\n--- Signup ---");
        System.out.print("Enter new username: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Try a different one.");
            return;
        }
        System.out.print("Enter new password: ");
        String password = scanner.nextLine();
        users.put(username, password);
        System.out.println("Signup successful! ✅\n");
    }

    private static void orderFlow() {
        System.out.println("Available Restaurants:");
        int idx = 1;
        List<String> restaurantNames = new ArrayList<>(restaurants.keySet());
        for (String r : restaurantNames) {
            System.out.println(idx + ". " + r);
            idx++;
        }
        int restaurantChoice = getIntInput("Choose Restaurant: ");
        if (restaurantChoice < 1 || restaurantChoice > restaurantNames.size()) {
            System.out.println("Invalid restaurant choice.\n");
            return;
        }
        String selectedRestaurant = restaurantNames.get(restaurantChoice - 1);
        showMenu(selectedRestaurant);
        takeOrder(selectedRestaurant);
        checkout(selectedRestaurant);
    }

    private static void showMenu(String restaurantName) {
        System.out.println("\n--- " + restaurantName + " Menu ---");
        Map<String, Double> menu = restaurants.get(restaurantName);
        int idx = 1;
        for (String item : menu.keySet()) {
            System.out.println(idx + ". " + item + " - $" + menu.get(item));
            idx++;
        }
        System.out.println(idx + ". Go Back");
    }

    private static void takeOrder(String restaurantName) {
        cart.clear();
        Map<String, Double> menu = restaurants.get(restaurantName);
        List<String> menuItems = new ArrayList<>(menu.keySet());

        while (true) {
            int itemNumber = getIntInput("Add item to cart (enter 0 to finish): ");
            if (itemNumber == 0) {
                break;
            }
            if (itemNumber < 1 || itemNumber > menuItems.size()) {
                System.out.println("Invalid item number, try again.");
                continue;
            }
            String itemName = menuItems.get(itemNumber - 1);
            int quantity = getIntInput("Enter quantity: ");
            if (quantity < 1) {
                System.out.println("Quantity must be at least 1.");
                continue;
            }
            int existing = cart.getOrDefault(itemName, 0);
            cart.put(itemName, existing + quantity);
            System.out.println("Item added: " + itemName + " x" + quantity);
        }
    }

    private static void checkout(String restaurantName) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Nothing to checkout.\n");
            return;
        }
        System.out.println("\n--- Your Cart ---");
        double subtotal = 0;
        Map<String, Double> menu = restaurants.get(restaurantName);
        for (String item : cart.keySet()) {
            int quantity = cart.get(item);
            double price = menu.get(item);
            double cost = price * quantity;
            System.out.printf("%s x%d - $%.2f\n", item, quantity, cost);
            subtotal += cost;
        }
        double tax = subtotal * 0.05;
        double total = subtotal + tax;

        System.out.println("-----------------------");
        System.out.printf("Subtotal = $%.2f\n", subtotal);
        System.out.printf("Tax (5%%)  = $%.2f\n", tax);
        System.out.println("-----------------------");
        System.out.printf("Total = $%.2f\n", total);

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Credit/Debit Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash on Delivery");
        int payChoice = getIntInput("Enter choice: ");
        switch (payChoice) {
            case 1:
                System.out.println("Processing Card Payment... ✅");
                break;
            case 2:
                System.out.println("Processing UPI Payment... ✅");
                break;
            case 3:
                System.out.println("Cash on Delivery Selected ✅");
                break;
            default:
                System.out.println("Invalid payment method, defaulting to Cash on Delivery.");
        }

        printBill(restaurantName, subtotal, tax, total);
        trackOrder();
    }

    private static void printBill(String restaurantName, double subtotal, double tax, double total) {
        System.out.println("\n--- Bill ---");
        System.out.println(restaurantName);
        System.out.println("-------------------------------");
        Map<String, Double> menu = restaurants.get(restaurantName);
        for (String item : cart.keySet()) {
            int qty = cart.get(item);
            double price = menu.get(item);
            System.out.printf("%s x%d - $%.2f\n", item, qty, price * qty);
        }
        System.out.printf("Subtotal          $%.2f\n", subtotal);
        System.out.printf("Tax (5%%)          $%.2f\n", tax);
        System.out.printf("Total             $%.2f\n", total);
        System.out.println("-------------------------------");
        System.out.println("Order Status: Preparing...");
    }

    private static void trackOrder() {
        String[] steps = {
            "Preparing...",
            "Out for Delivery...",
            "Delivered! Enjoy your meal 🍔"
        };
        for (String step : steps) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                // ignore
            }
            System.out.println(step);
        }
        System.out.println();
    }

    private static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                int n = Integer.parseInt(line.trim());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}

