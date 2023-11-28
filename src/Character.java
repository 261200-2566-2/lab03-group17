public class Character {
    private String name;
    private String gender;
    private String job;
    private int level;
    private int hp;
    private int mana;
    private int weight;
    private int runSpeed;
    private int damage;
    private Weapon weapon; // สร้างเป็นตัวแปรที่เก็บอาวุธ๙โล่ได้มากสุด2 ชิ้น มือซ้ายขวา

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
        this.damage = 1;
        this.weight = 60;
    }

    void levelUp() {
        if (level <= 99) { //เลเวลเต็มที่ 99 
            level++;
            hp += 5;
            mana += 5;
            damage += 5;
        }
    }

    public void setRunSpeed(){
        int totalWeight = weapon.getWeight() + weight;
        if (totalWeight > 150 && totalWeight <= 200) {
            runSpeed *= 0.75; // วิ่งช้าลง 25%
        } else if (totalWeight > 200 && totalWeight <= 250) {
            runSpeed *= 0.7; // วิ่งช้าลง 30%
        } else if (totalWeight > 250) {
            runSpeed *= 0.5; // วิ่งช้าลง 50%
        }
    }

    public int getRunSpeed(){
        return runSpeed;
    }
    public Weapon getWeapon(){
        return weapon; 
    }


    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Job: " + job);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Mana: " + mana);
        System.out.println("Run Speed: " + runSpeed);
        System.out.println("Attack: " + damage);
    }

}