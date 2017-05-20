
/**
 * Created by cristian on 20/05/17.
 */
public class Persona {

    private int tenedor;
    private int cuchillo;
    private int cuchara;
    private int plato;
    private int vaso;

    public Persona(int tenedor, int cuchillo, int cuchara, int plato, int vaso) {
        this.tenedor = tenedor;
        this.cuchillo = cuchillo;
        this.cuchara = cuchara;
        this.plato = plato;
        this.vaso = vaso;
    }

    public int getTenedor() {
        return tenedor;
    }

    public void setTenedor(int tenedor) {
        this.tenedor = tenedor;
    }

    public int getCuchillo() {
        return cuchillo;
    }

    public void setCuchillo(int cuchillo) {
        this.cuchillo = cuchillo;
    }

    public int getCuchara() {
        return cuchara;
    }

    public void setCuchara(int cuchara) {
        this.cuchara = cuchara;
    }

    public int getPlato() {
        return plato;
    }

    public void setPlato(int plato) {
        this.plato = plato;
    }

    public int getVaso() {
        return vaso;
    }

    public void setVaso(int vaso) {
        this.vaso = vaso;
    }

    public void ponerLaMesa(){
        System.out.println("Usted preparo la mesa para cenar : " + this.getPlato()+" plato "+ this.getVaso()+" vaso "+this.getTenedor()+" tenedor "+this.getCuchillo()+" cuchillo");
    }
    public void levantarLaMesa(){
        System.out.println("usted levanto la mesa, esperemos haya cenado rico ");
    }

}
