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
}
