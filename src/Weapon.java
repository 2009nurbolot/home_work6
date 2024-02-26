public class Weapon {
    private WeaponType weaponType;
    private String nameOfWeapon;

    public Weapon(WeaponType weaponType, String nameOfWeapon) {
        this.weaponType = weaponType;
        this.nameOfWeapon = nameOfWeapon;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}
