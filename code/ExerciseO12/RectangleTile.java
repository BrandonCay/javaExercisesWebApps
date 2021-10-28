/*-------------------------------- class RectangleTile -------------------------------------------*/
public class RectangleTile extends Tile // inherits class Tile
{
    private double length;
    private double width;

    public RectangleTile() {
        length = 0.5;
        width = 1.0;
    }

    public RectangleTile(double len, double wth, double uprice) {
        super(uprice);
        length = len;
        width = wth;
    }

    @Override
    public double computeArea() {
        return (length * width); // return the area of a rectangular tile
    }

    @Override
    public void print() {
        System.out.println("The length is:\t" + length);
        System.out.println("The width is:\t" + width);
        System.out.println("The price of the tile is:\t" + computePrice());
    }
}