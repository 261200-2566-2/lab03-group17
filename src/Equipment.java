public class Equipment {
        // void equipment(Sword weapon){
    //     int totalWeight = weapon.weight;
    //     if (totalWeight > 150 && totalWeight <= 200) {
    //         runSpeed *= 0.75; // วิ่งช้าลง 25%
    //     } else if (totalWeight > 200 && totalWeight <= 250) {
    //         runSpeed *= 0.7; // วิ่งช้าลง 30%
    //     } else if (totalWeight > 250) {
    //         runSpeed *= 0.5; // วิ่งช้าลง 50%
    //     }
    // }
    // void equipment(Shield weapon){
    //     int totalWeight = weapon.weight;
    //     if (totalWeight > 150 && totalWeight <= 200) {
    //         runSpeed *= 0.75; // วิ่งช้าลง 25%
    //     } else if (totalWeight > 200 && totalWeight <= 250) {
    //         runSpeed *= 0.7; // วิ่งช้าลง 30%
    //     } else if (totalWeight > 250) {
    //         runSpeed *= 0.5; // วิ่งช้าลง 50%
    //     }
    // }

    // void equipment(Sword weapon1 , Shield weapon2){
    //     int totalWeight = weapon1.weight + weapon2.weight;
    //     if (totalWeight > 150 && totalWeight <= 200) {
    //         runSpeed *= 0.75; // วิ่งช้าลง 25%
    //     } else if (totalWeight > 200 && totalWeight <= 250) {
    //         runSpeed *= 0.7; // วิ่งช้าลง 30%
    //     } else if (totalWeight > 250) {
    //         runSpeed *= 0.5; // วิ่งช้าลง 50%
    //     }
    // }

    void displayEquipmentInfo(Object[] equipment, String category) {
        System.out.println(category + ":");
        for (int i = 0; i < equipment.length; i++) {
            System.out.println((i + 1) + ". " + equipment[i].toString());
        }
        System.out.print("Choose " + category + " (1-" + equipment.length + "): ");
    }
}
