import java.util.Date;
public class Empleado {
 private Persona empleado;
 private Cargo cargo;
 private  Date fechaIngreso;
 private EmailInstitucional email;
 private ExtensionTelf extensionTelf;

 public Empleado (Persona empleado , Cargo cargo, String email, String telefono){
  this.cargo =  cargo;
  this.empleado = empleado;
  this.email = new EmailInstitucional( email);
  this.extensionTelf = new ExtensionTelf(telefono);
 }

 public String getNombre (){
 return empleado.getNombre() ;
 }

 public String getRole (){
 return cargo.getRol();
 }

 public double getSalario (){

 return cargo.getSalario();}

 public String getEmail (){
  return email.getEmail();
 }

 public String getExtencion (){
 return extensionTelf.getNumero() ;
 }
}
