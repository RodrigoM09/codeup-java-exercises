import java.util.Comparator;

public class Monster implements Comparator<Monster> {

    private String name;
    private int armorClass;
    private int hitPoints;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

//  TURNS NAME INTO A STRING...WITHOUT WOULD DISPLAY HASHCODE
    public String toString(){
        return name;
    }

//  TO CREATE A CUSTOM COMPARISON METHOD, WE IMPLEMENT COMPARABLE<OBJECTCLASSNAME>
//  IN THE OBJECT CLASS... USE THIS SYNTAX
    public int compare(Monster m1, Monster m2){
        return Integer.compare(m2.getHitPoints(), m1.getHitPoints());
        }

    public Monster(){}

    public Monster(int armorClass, int hitPoints, int damage, String name) {
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.name = name;
    }
}
