public class Action {
    private Character character;
    private Weapon weapon;

    public Action(Character character) {
        this.character = character;
    }

    public void attack() {
        if(character.getWeapon() != null){
            weapon.getDamage();
        }
    }

    public void defend() {
        weapon.getReduceDamage();
    }
 
}
