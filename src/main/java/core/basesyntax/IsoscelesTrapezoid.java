package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final String name = FigureName.TRAPEZOID.name().toLowerCase();
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(double sideB, double sideC, double height, String color) {
        super(color);
        this.sideA = sideB;
        this.sideB = sideC;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + " area: " + getArea()
                + " sq. units, side A: " + sideA + ", side B: " + sideB
                + " height: " + height + " units, color: " + getColor());
    }
}
