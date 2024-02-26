//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponType.COULD, "knife");
        Boss boss = new Boss(200, 30, weapon);
        System.out.println("Boss health " + boss.getHealth());
        System.out.println("Boss damage " + boss.getDamage());
        System.out.println("Boss weapon type "+ weapon.getWeaponType()) ;
        System.out.println("Boss weapon name  " + weapon.getNameOfWeapon());
        System.out.println(boss.printInfo());

        Skeleton stich = new Skeleton(200, 10,weapon,19);
        Skeleton archy = new Skeleton(150,20,weapon,15);
        System.out.println("stich " + stich.printInfo());
        System.out.println("athcy  " + archy.printInfo());
    }
}