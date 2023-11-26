import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // สร้างตัวละคร
        System.out.println("==== Create Your Character ====");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        String gender = ""; // กำหนดค่าเริ่มต้นเป็น empty string
        int genderChoice;
        do {
            System.out.print("Select Gender (1. Male, 2. Female): ");
            genderChoice = scanner.nextInt();
            if (genderChoice == 1) {
                gender = "Male";
            } else if (genderChoice == 2) {
                gender = "Female";
            } else {
                System.out.println("Invalid choice. Please choose 1 for Male or 2 for Female.");
            }
        } while (genderChoice != 1 && genderChoice != 2);

        String job = "Novice";  // คลาส Novice ที่คุณกำหนด

        CharacterInfo player = new CharacterInfo(name, gender, job);
        // เลือกอาวุธ
        System.out.println("==== Choose Your Weapon ====");
        Weapon[] weapons = {
                new Weapon("Blade      ", 1, 15, 50),
                new Weapon("Falchion   ", 2, 20, 80),
                new Weapon("Sword      ", 3, 75, 100),
                new Weapon("Byeollungum", 4, 130, 120)
        };

        int weaponChoice;
        do {
            displayEquipmentInfo(weapons, "Weapons");
            weaponChoice = scanner.nextInt();
            if (weaponChoice < 1 || weaponChoice > weapons.length) {
                System.out.println("Invalid choice. Please choose again.");
            }
        } while (weaponChoice < 1 || weaponChoice > weapons.length);

        Weapon selectedWeapon = weapons[weaponChoice - 1];
        System.out.println("===================");
        System.out.println("You chose: " + selectedWeapon.name);
        System.out.println("Total Weight: " + selectedWeapon.weight);
        System.out.println("===================");

        // เลือกโล่
        System.out.println("Choose Your Shield:");
        Shield[] shields = {
                new Shield("Advanced Angelic Guard", 1, 20, 80),
                new Shield("Angelic Guard         ", 2, 30, 100),
                new Shield("Thorny Buckler        ", 3, 50, 140),
                new Shield("OOP Guard             ", 4, 100, 200)
        };

        int shieldChoice;
        do {
            displayEquipmentInfo(shields, "Shields");
            shieldChoice = scanner.nextInt();
            if (shieldChoice < 1 || shieldChoice > shields.length) {
                System.out.println("Invalid choice. Please choose again.");
            }
        } while (shieldChoice < 1 || shieldChoice > shields.length);

        Shield selectedShield = shields[shieldChoice - 1];
        System.out.println("===================");
        System.out.println("You chose: " + selectedShield.name);

        // คำนวณน้ำหนักและแสดงผล
        int totalWeight = selectedWeapon.weight + selectedShield.weight;
        System.out.println("Total Weight: " + totalWeight);
        System.out.println("===================");

        if (totalWeight > 150 && totalWeight <= 200) {
            player.runSpeed *= 0.75; // วิ่งช้าลง 25%
        } else if (totalWeight > 200 && totalWeight <= 250) {
            player.runSpeed *= 0.7; // วิ่งช้าลง 30%
        } else if (totalWeight > 250) {
            player.runSpeed *= 0.5; // วิ่งช้าลง 50%
        }

        System.out.println("==== Character Information ====");
        player.displayInfo();
        System.out.println("===================");

    }

    private static void displayEquipmentInfo(Object[] equipment, String category) {
        System.out.println(category + ":");
        for (int i = 0; i < equipment.length; i++) {
            System.out.println((i + 1) + ". " + equipment[i].toString());
        }
        System.out.print("Choose " + category + " (1-" + equipment.length + "): ");
    }
}
