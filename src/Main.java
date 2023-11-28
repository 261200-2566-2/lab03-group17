import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter character name: ");
        String name = scanner.nextLine();

        System.out.print("Choose gender (1. Male, 2. Female): ");
        int genderChoice = scanner.nextInt();
        String gender;
        if (genderChoice == 1) {
            gender = "Male";
        } else if (genderChoice == 2) {
            gender = "Female";
        } else {
            System.out.println("Incorrect choice. Defaulting to Male.");
            gender = "Male";
        }

        Character player = new Character(name, gender);

        player.displayInfo();

        System.out.println("\nChoose a starting weapon:");
        Weapon startingSword = new Weapon("Sword", "Starting Sword", 1, 10, 20);
        Weapon startingAxe = new Weapon("Axe", "Starting Axe", 1, 15, 25);
        System.out.println("1. " + startingSword.getName());
        System.out.println("2. " + startingAxe.getName());
        System.out.print("Enter weapon choice (1 or 2): ");
        int weaponChoice = scanner.nextInt();

        if (weaponChoice == 1) {
            player.equipWeapon(startingSword);
        } else if (weaponChoice == 2) {
            player.equipWeapon(startingAxe);
        } else {
            System.out.println("Incorrect choice. Defaulting to Starting Sword.");
            player.equipWeapon(startingSword);
        }

        System.out.println("\nChoose a starting shield:");
        Weapon woodenShield = new Weapon("Shield", "Wooden Shield", 1, 5, 15);
        Weapon ironShield = new Weapon("Shield", "Iron Shield", 1, 10, 20);
        System.out.println("1. " + woodenShield.getName());
        System.out.println("2. " + ironShield.getName());
        System.out.print("Enter shield choice (1 or 2): ");
        int shieldChoice = scanner.nextInt();

        if (shieldChoice == 1) {
            player.equipWeapon(woodenShield);
        } else if (shieldChoice == 2) {
            player.equipWeapon(ironShield);
        } else {
            System.out.println("Incorrect choice. Defaulting to Wooden Shield.");
            player.equipWeapon(woodenShield);
        }
        System.out.println(" ");
        player.displayInfo();
        scanner.close();
    }
}