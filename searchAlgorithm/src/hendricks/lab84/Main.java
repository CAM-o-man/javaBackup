package hendricks.lab84;

public class Main {

    public static void main(String[] args) {
        String[] foods = new String[]{"apple", "pear", "carrot", "orange", "jambalaya", "Item Number 5", "orange", "Blood Orange", "Apple", "Apple, Inc."};
        int counter = 0;
        int nonOrangeCounter = 0;
        String searchTerm = "orange";
        for (String food: foods) {
            if (food.equalsIgnoreCase(searchTerm)) {
                counter++;
            } else {
                nonOrangeCounter++;
            }
        }
    }
}
