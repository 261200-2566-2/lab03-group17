public class Character {
    private String name;
    private String gender;
    private String job;
    private int level;
    private int hp;
    private int mana;
    private int runSpeed;

    public Character(String name, String gender, String job ) {
        this.name = name;
        if(gender == "Male" || gender == "male"){
            this.gender = "Male";
        }else if(gender == "Female" || gender == "female"){
            this.gender = "Female";
        }else{
            System.out.println("Incorrect gender");
        }
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

    void attack(Character player1,Character player2){

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