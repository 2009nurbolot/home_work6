public class Skeleton extends Boss {
    private int arrowCount;

    public Skeleton(int health, int damage, Weapon weapon, int arrowCount) {
        super(health, damage, weapon);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public String printInfo() {
        return super.printInfo() + "skeleton arrow count  " + arrowCount;
    }
}
