public class Boss extends GameEntity{
    public Weapon weapon;

    public Boss(int health, int damage,Weapon weapon) {
        super(health, damage);
        this.weapon=weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "Health  "  + getHealth() + "damage " + getDamage() +"weapon type  " + weapon.getWeaponType()+"weapon name " + weapon.getNameOfWeapon();

    }
}
