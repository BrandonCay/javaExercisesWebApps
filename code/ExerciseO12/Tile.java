
public abstract class Tile {
    private double unitPrice;

    public Tile() {
        unitPrice = 2.0;
    }

    public Tile(double uprice) {
        unitPrice = uprice;
    }

    public double getUprice() {
        return unitPrice;
    }

    public abstract double computeArea(); // abstract method

    public double computePrice() {
        double area;
        area = computeArea(); // calling the abstract method
        return (unitPrice * area);
    }

    public void print() {
        System.out.println("The price of the tile is:\t" + computePrice());
    }
}