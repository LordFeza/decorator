package dp220721.decorator;

public class Thon extends DecoratorPizza {

    public Thon(Pizza p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return this.p.getDescription()+"+Thon";
    }

    @Override
    public double getCost() {
        return this.p.getCost()+1.5;
    }
}
