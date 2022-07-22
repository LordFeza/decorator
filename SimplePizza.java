package dp220721.decorator;

public class SimplePizza implements Pizza{
    @Override
    public String getDescription() {
        return "Fromage/Tomate";
    }

    @Override
    public double getCost() {
        return 2;
    }
}
