public class Sword {
    String swordName;
    int level;
    int attack;
    int weight;

    public Sword(String swordName, int level, int attack, int weight) {
        this.swordName = swordName;
        this.level = level;
        this.attack = attack;
        this.weight = weight;
    }

    public String toString() {
        return "Name: " + swordName + "\tLevel: " + level + "\tAttack: " + attack + "\tWeight: " + weight;
    }

    // void  chooseSword(){
        
    //     System.out.println("==== Choose Your Weapon ====");
    //     Sword[] weapons = {
    //             new Sword("Blade      ", 1, 15, 50),
    //             new Sword("Falchion   ", 2, 20, 80),
    //             new Sword("Sword      ", 3, 75, 100),
    //             new Sword("Byeollungum", 4, 130, 120)
    //     };

    //     int weaponChoice;
    //     do {
    //         displayEquipmentInfo(weapons, "Weapons");
    //         weaponChoice = scanner.nextInt();
    //         if (weaponChoice < 1 || weaponChoice > weapons.length) {
    //             System.out.println("Invalid choice. Please choose again.");
    //         }
    //     } while (weaponChoice < 1 || weaponChoice > weapons.length);

    //     Sword selectedWeapon = weapons[weaponChoice - 1];
    //     System.out.println("===================");
    //     System.out.println("You chose: " + selectedWeapon.name);
    //     System.out.println("Total Weight: " + selectedWeapon.weight);
    //     System.out.println("===================");
    // }

}