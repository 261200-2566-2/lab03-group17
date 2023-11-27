public class Shield {
    String name;
    int level;
    int reducesDamage;
    int weight;

    public Shield(String name, int level, int reducesDamage, int weight) {
        this.name = name;
        this.level = level;
        this.reducesDamage = reducesDamage;
        this.weight = weight;
    }

    public String toString() {
        return "Name: " + name + "\tLevel: " + level + "\tReduces Damage: " + reducesDamage + "\tWeight: " + weight;
    }

    // void chooseShield(){

    //     int shieldChoice;
    //     do {
    //         displayEquipmentInfo(shields, "Shields");
    //         shieldChoice = scanner.nextInt();
    //         if (shieldChoice < 1 || shieldChoice > shields.length) {
    //             System.out.println("Invalid choice. Please choose again.");
    //         }
    //     } while (shieldChoice < 1 || shieldChoice > shields.length);

    //     Shield selectedShield = shields[shieldChoice - 1];
    //     System.out.println("===================");
    //     System.out.println("You chose: " + selectedShield.name);

    // }
}