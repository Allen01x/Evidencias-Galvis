package clasesempresa;

public class Empleado {

    private String nombre;
    private String cargo;
    private Double salario;

    public Empleado(String nombre, String cargo, Double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

   
    
    
}
