public class Dice {

    private Integer Faces;

    private Boolean IsLoaded;

    public Dice(Integer faces, Boolean isLoaded)
    {
        Faces = faces;
        IsLoaded = isLoaded;
    }

    public Integer getFaces() {
        return Faces;
    }

    public void setFaces(Integer faces) {
        Faces = faces;
    }

    public Boolean getIsLoaded() {
        return IsLoaded;
    }

    public void setisLoaded(Boolean isLoaded) {
        IsLoaded = isLoaded;
    }
}
