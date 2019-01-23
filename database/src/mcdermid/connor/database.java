package mcdermid.connor;

public class database {
    public database() {
        asterisks(); //TODO: Expand further on database, include more useful functions
    }

    public void asterisks() {
        for (int i = 0; i < 16; i++) {
            System.out.print("*");
        }
    }
    public String toDollars(int cents) {
        int dollars = 0;
        while(true) {
            if (cents > 100) {
                dollars += 1;
                cents -= 100;
            }
            else {
                break;
            }
        }
        String dollarString = Integer.toString(dollars);
        String centsString = Integer.toString(cents);
        return (dollarString + "." + centsString);

    }
}
