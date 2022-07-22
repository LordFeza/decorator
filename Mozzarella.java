package dp220721.decorator;

public class Mozzarella extends DecoratorPizza {
    public Mozzarella(Pizza p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return this.p.getDescription()+"+Mozza";
    }

    @Override
    public double getCost() {
        return this.p.getCost()+0.75;
    }
}
