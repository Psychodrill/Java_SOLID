package lsp1;

import lsp1.shape.*;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadrilateral q = new Rectangle(5,8);
        Rectangle rectangle= (Rectangle)q;
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
    }
}
