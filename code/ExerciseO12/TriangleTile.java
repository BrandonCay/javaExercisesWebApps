/*-------------------------------- class TriangleTile -------------------------------------------*/
public class TriangleTile extends Tile // inherits class Tile
{
    private double height;
    private double base;

    public TriangleTile() {
        height = 0.5;
        base = 1.0;
    }

    public TriangleTile(double ht, double bse, double uprice) {
        super(uprice);
        height = ht;
        base = bse;
    }

    @Override
    public double computeArea() {
        return (height * base / 2.0); // return the area of a triangular tile
    }

    @Override
    public void print() {
        System.out.println("The height is:\t" + height);
        System.out.println("The base is:\t" + base);
        System.out.println("The price of the tile is:\t" + computePrice());
    }
}
