package Assignment5;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1 – New Membership");
            System.out.println("2 – Add Material");
            System.out.println("3 – Issue Item");
            System.out.println("4 – Return Item");
            System.out.println("5 – Report Inventory");
            System.out.println("6 – Report Loans");
            System.out.println("7 – Lookup Membership");
            System.out.println("8 – Exit");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    handleNewMembership(librarySystem, scanner);
                    break;
                case 2:
                    handleAddMaterial(librarySystem, scanner);
                    break;
                case 3:
                    handleIssueItem(librarySystem, scanner);
                    break;
                case 4:
                    handleReturnItem(librarySystem, scanner);
                    break;
                case 5:
                    handleReportInventory(librarySystem);
                    break;
                case 6:
                    handleReportLoans(librarySystem);
                    break;
                case 7:
                    handleLookupMembership(librarySystem, scanner);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }

    private static void handleNewMembership(LibrarySystem librarySystem, Scanner scanner) {
    }

    private static void handleAddMaterial(LibrarySystem librarySystem, Scanner scanner) {
    }

    private static void handleIssueItem(LibrarySystem librarySystem, Scanner scanner) {
    }

    private static void handleReturnItem(LibrarySystem librarySystem, Scanner scanner) {
    }

    private static void handleReportInventory(LibrarySystem librarySystem) {
    }

    private static void handleReportLoans(LibrarySystem librarySystem) {
    }

    private static void handleLookupMembership(LibrarySystem librarySystem, Scanner scanner) {
    }
}
