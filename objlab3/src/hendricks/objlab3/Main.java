package hendricks.objlab3;

public class Main {

    public static void main(String[] args) {

    }
}

interface Template {
    int a = 0, b = 0, c = 0;

    double rootOne = 0;

    double rootTwo = 0;

    public void setEquation(int quadA, int quadB, int quadC);

    public void calcRoots();

    @Override
    public String toString();
}

class Quadratic implements Template {
    int a = 0;
    int b = 0;
    int c = 0;

    double rootOne = 0;
    double rootTwo = 0;

    Quadratic() {}

    Quadratic(int quadA, int quadB, int quadC) {
        this.a = quadA;
        this.b = quadB;
        this.c = quadC;
    }
    public void setEquation(int quadA, int quadB, int quadC) {
        this.a = quadA;
        this.b = quadB;
        this.c = quadC;
    }
    public void calcRoots() {

    }
    @Override
    public String toString() {

    }
}