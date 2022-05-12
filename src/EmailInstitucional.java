public class EmailInstitucional {
    private String usuario;
    private boolean isPublico;
    private  int capacidadMax;

    public EmailInstitucional (String usuario){
    this.usuario = usuario;
    }
    public String getEmail(){
    return usuario;
    }
}
