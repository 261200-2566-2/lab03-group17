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
        this.type = type.toLowerCase();
        if(this.type.equals("sword")){
            this.damage = dmgOrRdmg;
        }else if(this.type.equals(type)){
            this.reducesDamage = dmgOrRdmg;
        }
        this.weight = weight;
    }

    public void getWeaponInfo() {
        if("sword".equals(type)){
            System.out.println("Name: " + name + "\tLevel: " + level + "\tDamage: " 
            + damage + "\tWeight: " + weight);
        }else if("shield".equals(type)){
            System.out.println("Name: " + name + "\tLevel: " + level + "\tReduces Damage: " 
            + reducesDamage + "\tWeight: " + weight);
        }

    }
}
