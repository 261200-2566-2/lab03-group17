public class Weapon {
    String name;
    int level;
    int attack;
    int weight;

    public Weapon(String name, int level, int attack, int weight) {
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.weight = weight;
    }

    public String toString() {
        return "Name: " + name + "\tLevel: " + level + "\tAttack: " + attack + "\tWeight: " + weight;
    }
}
