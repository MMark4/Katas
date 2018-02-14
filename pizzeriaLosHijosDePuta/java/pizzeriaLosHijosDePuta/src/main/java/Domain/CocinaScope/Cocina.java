package Domain.CocinaScope;

import Domain.ComidaScope.*;

import java.util.ArrayList;

public class Cocina implements ICocina {

    private ArrayList<? extends ISeccion> Secciones;

    public ArrayList<? extends ISeccion> getSecciones()
    {
        return Secciones;
    }

    public void setSecciones(ArrayList<? extends ISeccion> secciones)
    {
        Secciones = secciones;
    }

    public PedidoListo prepararPedido(IPedido pedido)
    {
        PedidoListo pedidoListo = new PedidoListo();
        pedidoListo.setNombreCliente(pedido.getNombreCliente());
        pedidoListo.setComidasHechas(new ArrayList<>());
        pedidoListo.setComidasRechazadas(new ArrayList<>());


        pedido.getComidas().forEach(comida -> {
            comida.

        });



        return pedidoListo;
    }

}