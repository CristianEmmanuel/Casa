public class Main {

    public static void main(String[] args) {

        Persona prepararCena = new Persona(1,1,1,1,1);
        prepararCena.ponerLaMesa();
        Heladera obtener = new Heladera("carne","cerveza","","vegetales salteados");
        obtener.servirLaMesa();
        prepararCena.levantarLaMesa();

    }
}
