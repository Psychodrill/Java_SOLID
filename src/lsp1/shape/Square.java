package lsp1.shape;

public class Square implements Quadrilateral {

    int side;
    public Square(int side) {
        this.side=side;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(side, 2);
    }
}
