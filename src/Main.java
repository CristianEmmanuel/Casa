import Cena.Cena;


public class Main {

    public static void main(String[] args) {

        Lavaplato unaCena = new Lavaplato(1,1,1,1,1);
        unaCena.ponerLaMesa();
        Heladera unaCena1 = new Heladera("carne","cerveza","","vegetales salteados");
        unaCena1.servirLaMesa();
        unaCena.levantarLaMesa();

    }
}
