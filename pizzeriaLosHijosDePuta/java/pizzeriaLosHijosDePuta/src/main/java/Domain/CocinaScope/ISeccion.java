package Domain.CocinaScope;

        import Domain.ComidaScope.IIngrediente;

        import java.util.ArrayList;

public interface ISeccion {

    public Especialidad getSpecialty();

    public void setSpeciality(Especialidad especialidad);

    public ArrayList<? extends IIngrediente> getStock();

    public void setStock(ArrayList<? extends IIngrediente> stock);
}
