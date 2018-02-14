package Domain.CocinaScope;

import java.util.ArrayList;

public interface ICocina {

    public ArrayList<? extends ISeccion> getSecciones();

    public void setSecciones(ArrayList<? extends ISeccion> secciones);
}