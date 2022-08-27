import java.util.List;

public class Categoria {
    public String nombre;
    List<Titulo>titulo;
    Categoria supercategoria;

    public Categoria(String nombre, List<Titulo> titulo, Categoria supercategoria) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.supercategoria = supercategoria;
    }
}
