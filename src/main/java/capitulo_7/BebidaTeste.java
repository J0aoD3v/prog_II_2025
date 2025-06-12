package capitulo_7;

public class BebidaTeste {

    public static void main(String[] args) {
        BebidaAlcoolica cerveja = new BebidaAlcoolica("Skol", "Cerveja", 4.7);
        Refrigerante refrigerante = new Refrigerante("Coca-Cola", "Refrigerante", "Cola");
        Suco suco = new Suco("Del Valle", "Suco Natural", "Abacaxi");

        System.out.println(cerveja.descricao());
        System.out.println(refrigerante.descricao());
        System.out.println(suco.descricao());
    }
}
