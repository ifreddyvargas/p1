import java.util.List;

public class Autor {
    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    List<Titulo> titulo;
    public Autor(){
    }
    public Autor(String nombre, String primerApellido){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }
    public Autor(String nombre, String primerApellido, String segundoApellido){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
}
