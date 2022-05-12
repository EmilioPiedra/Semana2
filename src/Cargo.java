public class Cargo {
    private String rol;
    private double salario;

    public Cargo (String rol, double salario){
        this.rol=rol;
        this.salario= salario;
    }
    public String getRol (){

        return rol;
    }
    public double getSalario (){

        return salario;
    }
}
