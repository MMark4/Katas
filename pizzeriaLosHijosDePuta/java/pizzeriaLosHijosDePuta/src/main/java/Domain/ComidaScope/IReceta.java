package Domain.ComidaScope;

import java.util.ArrayList;

public interface IReceta {

    public Integer getId();

    public void setId(Integer id);

    // ArrayList<Cualquier clase extienda de IIngrendientes>
    public ArrayList<? extends IIngrediente> getIngredientes();

    public void setIngredientes(ArrayList<? extends IIngrediente> ingredientes);

    public ArrayList<Integer> getRecetasBase();

    public void setRecetasBase(ArrayList<Integer> id);

    public Integer getTiempoCoccion();

    public void setTiempoCoccion(Integer id);

    public Complejidad getComplejidad();

    public void setComplejidad(Complejidad id);

    public ModoPreparacion getModoPreparacion();

    public void setModoPreparacion(ModoPreparacion modoPreparacion);

    public TipoReceta getTipoReceta();

    public void setTipoReceta(TipoReceta tipoReceta);
}
