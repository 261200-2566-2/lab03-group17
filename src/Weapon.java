public class Weapon {
    private String name;
    private String type;
    private int level;
    private double reducesDamage;
    private double damage;
    private int weight;

    public Weapon(String type, String name, int level, int dmgOrRdmg, int weight) {
        this.name = name;
        this.level = level;
        this.type = type.toLowerCase();
        if(this.type.equals("sword")){
            this.damage = dmgOrRdmg * (1 + 0.1*level);
        }else if(this.type.equals(type)){
            this.reducesDamage = dmgOrRdmg * (1 + 0.05*level);
        }
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public String  getType(){
        return type;
    }

    public int getWeight(){
        return weight; 
    }
    public double getDamage(){
        return damage; 
    }
    public double getReduceDamage(){
        return reducesDamage; 
    }


    public void getWeaponInfo(){
        if("sword".equals(type)){
            System.out.println("Name: " + name + "\tLevel: " + level + "\tDamage: " 
            + damage + "\tWeight: " + weight);
        }else if("shield".equals(type)){
            System.out.println("Name: " + name + "\tLevel: " + level + "\tReduces Damage: " 
            + reducesDamage + "\tWeight: " + weight);
        }

    }
}
