package Domain.ComidaScope;

import java.util.ArrayList;

public interface IPedido {

    public ArrayList<? extends IComida> getComidas();

    public void setComidas(ArrayList<? extends IComida> comidas);

    public String getNombreCliente();

    public void setNombreCliente(String nombreCliente);

    public String getDireccionCliente();

    public void setDireccionCliente(String direccionCliente);
}
