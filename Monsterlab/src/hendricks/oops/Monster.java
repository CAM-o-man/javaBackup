package hendricks.oops;


/**
 * @author Connor McDermid
 * @lab OOPS Monster
 * @date 2019.06.05
 * @extra Final variables (finally a chance to use them)
 */
public class Monster {
    final int size;
    final String name;


    Monster(int size, String name) {
        this.size = size;
        this.name = name;
    }

    String getName() {
        return this.name;
    }
    int getSize() {
        return this.size;
    }
    public boolean compareNames(Monster other) {
        return this.getName().equals(other.getName());
    }
    boolean isLarger(Monster other) {
        return this.getSize() > other.getSize();
    }
    public boolean isSmaller(Monster other) {
        return !this.isLarger(other);
    }
    @Override
    public String toString() {
        return "Class: Monster. Name: " + this.name + ". Size: " + this.size + ".";
    }
}
