public class Main {
    public static void main(String[] args) {
        
    // example
    Character player = new Character("KOKO", "Male");
    //player.displayInfo();
    Weapon fuckSword = new Weapon("Sword","fuckSword",1, 60, 100);
    Weapon fuckShield = new Weapon("Shield","fuckShield",1, 60, 150);
    //fuckSword.getWeaponInfo();
    //player.displayEquipmentInfo(args, null);

    player.equipWeapon(fuckSword,fuckShield);
    player.displayInfo();
    }


}