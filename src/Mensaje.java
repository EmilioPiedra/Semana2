import java.util.List;

public class Mensaje {
    private Empleado emisor;
    private List<Empleado> receptores;
    private String mensaje;

    public Mensaje (Empleado emisor,List<Empleado> receptores, String mensaje ){
        this.emisor = emisor;
        this.receptores = receptores;
        this.mensaje = mensaje;
    }
    public String enviar (MedioComunicacion medio){
        return mensaje;
    }
}
