package hendricks.oops;

public class Banana implements Fruit {
    final String name;
    final String colour;

    public Banana(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

