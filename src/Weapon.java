public class Weapon {
    private String name;
    private String type;
    private int level;
    private int reducesDamage;
    private int damage;
    private int weight;

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

    public int getWeight(){
        return weight; 
    }
    public int getDamage(){
        return damage; 
    }
    public int getReduceDamage(){
        return reducesDamage; 
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
