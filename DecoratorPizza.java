package dp220721.decorator;

public abstract class DecoratorPizza implements Pizza { /**n'importe quelle classe implémentant Pizza peut être à l'intérieur**/
    protected Pizza p;

    public DecoratorPizza(Pizza p) {
        this.p=p;
    }
}
