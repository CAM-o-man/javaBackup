package hendricks.oops;

public class Orange implements Fruit {
    final String name;
    final String colour;

    public Orange(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

}

