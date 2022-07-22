package dp220721.decorator;

/**La problématique avec ce dp : éviter l'héritage. Pour y pallier un fonctionnement en poupées russes/de combinaison.
 * Le Décorator offre une plus grande flexibilité que l'héritage statique**/

public class Main {
    public static void main(String[] args) {
        Pizza thonmozza= new Thon(new Mozzarella(new SimplePizza()));
        System.out.println("Votre commande : "+thonmozza.getDescription());
        System.out.println("Total à payer : "+thonmozza.getCost()+" €");
    }
}
