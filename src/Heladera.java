/**
 * Created by cristian on 20/05/17.
 */
public class Heladera {

    private String Carne;
    private String Bebida;
    private String pollo;
    private String vegetal;

    public Heladera(String carne, String bebida, String pollo, String vegetal) {
        Carne = carne;
        Bebida = bebida;
        this.pollo = pollo;
        this.vegetal = vegetal;
    }

    public String getCarne() {
        return Carne;
    }

    public void setCarne(String carne) {
        Carne = carne;
    }

    public String getBebida() {
        return Bebida;
    }

    public void setBebida(String bebida) {
        Bebida = bebida;
    }

    public String getPollo() {
        return pollo;
    }

    public void setPollo(String pollo) {
        this.pollo = pollo;
    }

    public String getVegetal() {
        return vegetal;
    }

    public void setVegetal(String vegetal) {
        this.vegetal = vegetal;
    }
    public void servirLaMesa(){
        System.out.println("Usted sirvio la mesa con : " + this.getCarne()+" "+ this.getBebida()+" "+this.getVegetal());
    }
}
