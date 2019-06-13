package hendricks.oops;

public class Apple implements Fruit {
    final String name;
    final String colour;

    Apple(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return this.name;
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public String toString() {
        return "Class: Apple. Name: " + this.name + ". Colour: " + this.colour + ".";
    }
}

