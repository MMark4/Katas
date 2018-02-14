package Domain.ComidaScope;

public interface IComida {

    public String getNombreComida();

    public void setNombreComida(String nombreComida);

    public IReceta getReceta();

    public void setReceta(IReceta receta);

    public Integer getCosto();

    public void setCosto(Integer costo);


}
