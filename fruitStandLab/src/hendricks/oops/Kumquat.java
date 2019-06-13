package hendricks.oops;

public class Kumquat implements Fruit {
    final String name;
    final String colour;

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Kumquat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public Kumquat(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
}
