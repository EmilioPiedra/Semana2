public class Persona {
    private String cedula;
    private String nombre;

    public Persona (String cedula , String nombre){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}
