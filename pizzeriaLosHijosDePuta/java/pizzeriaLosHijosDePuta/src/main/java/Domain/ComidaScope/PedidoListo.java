package Domain.ComidaScope;

import java.util.ArrayList;

public class PedidoListo {

    private ArrayList<ComidaRechazada> comidasRechazadas;
    private ArrayList<IComida> comidasHechas;
    private String nombreCliente;

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setComidasHechas(ArrayList<IComida> comidasHechas) {
        this.comidasHechas = comidasHechas;
    }

    public void setComidasRechazadas(ArrayList<ComidaRechazada> comidasRechazadas) {
        this.comidasRechazadas = comidasRechazadas;
    }
}
