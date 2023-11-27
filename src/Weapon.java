public class Weapon {
    String name;
    String type;
    int level;
    int reducesDamage;
    int damage;
    int weight;

    public Weapon(String type, String name, int level, int dmgOrRdmg, int weight) {
        this.name = name;
        this.level = level;
        if(type.toLowerCase() == "sword"){
            this.damage = dmgOrRdmg;
        }else if(type.toLowerCase() == "shield"){
            this.reducesDamage = dmgOrRdmg;
        }
        this.weight = weight;
    }

    public String toString() {
        return "Name: " + name + "\tLevel: " + level + "\tReduces Damage: " 
        + reducesDamage + "\tWeight: " + weight;
    }
}
