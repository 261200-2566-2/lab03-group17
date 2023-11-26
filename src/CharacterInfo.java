public class CharacterInfo {
    String name;
    String gender;
    String job;
    int level;
    int hp;
    int mana;
    int runSpeed;

    public CharacterInfo(String name, String gender, String job) {
        this.name = name;
        this.gender = gender;
        this.job = job;
        this.level = 1;
        this.hp = 40;
        this.mana = 20;
        this.runSpeed = 34;
    }

    void levelUp() {
        if (level <= 99) { //เลเวลเต็มที่ 99 
            level++;
            hp += 5;
            mana += 5;
        }
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Job: " + job);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Mana: " + mana);
        System.out.println("Run Speed: " + runSpeed);
    }
}
