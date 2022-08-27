import java.util.List;

public class Titulo {
    //Variables
    public String titulo;
    public String edicion;
    public String isbn;
    List<Autor> autor;
    List<Categoria> categorias;
    public Titulo(){
        System.out.println("El objeto titulo se creo");
    }
    public Titulo(String titulo, String edicion){
        this.titulo = titulo;
        this.edicion = edicion;

    }
}
