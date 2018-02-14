package Domain.ComidaScope;

public class ComidaRechazada {

    private String Razon;

    private IComida Comida;

    public void setRazon(String razon)
    {
        Razon = razon;
    }

    public String getRazon()
    {
        return Razon;
    }

    public void setComida(IComida comida)
    {
        Comida = comida;
    }

    public IComida getComida()
    {
        return Comida;
    }


}
