package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private double getRandomNumber() {
        return random.nextInt(1, 20);
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        if (figureType == 0) {
            return new Square(getRandomNumber(), color);
        }
        if (figureType == 1) {
            return new Circle(getRandomNumber(), color);
        }
        if (figureType == 2) {
            return new IsoscelesTrapezoid(getRandomNumber(), getRandomNumber(), getRandomNumber(),
                    color);
        }
        if (figureType == 3) {
            return new Rectangle(getRandomNumber(), getRandomNumber(), color);
        }
        if (figureType == 4) {
            return new RightTriangle(getRandomNumber(), getRandomNumber(), color);
        }

        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.toString().toLowerCase());
    }
}
