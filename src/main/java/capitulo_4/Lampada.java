package capitulo_4;

/**
 * @author José
 */
public class Lampada {
    // o que a classe tem (atributos)
    boolean acesa;
    String marca;

    // construtor 
    Lampada() {
        acesa = false;
        marca = "";
    }

    void acender() {
        acesa = true;
    }

    void apagar() {
        acesa = false;
    }

    String mostrarEstado() {
        if (acesa == true) {
            return "acesa";
        }
        return "apagada";
    }

}
