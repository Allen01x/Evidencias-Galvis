package clasesempresa;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Empleado> empleados;
    
    public Empresa() {
        empleados = new ArrayList<>();
    }

    // metodo que agrega  empleados a la enterprise

    public void contratarEmpleados(Empleado e){
        empleados.add(e);
    }

    //Metodo que obtiene el total de empleados

    public int getTotalEmpleados() {
        return empleados.size();
    }



    public void nombreSalario() {

        for(Empleado e:empleados) {

            System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
        }

        
    }
    
    

    //Metodo que muestra el nombre y el salario de todos los empleados
    public double getTotalSalarios(){
        double total = 0;
        for(Empleado e:empleados) {
            total += e.getSalario();
        }
        
        return total;
    }
    
    public void empleadoMayorSalario() {


    Empleado empMayorSalario = empleados.get(0);

    double maxSalario = empleados.get(0).getSalario();

    for (Empleado e:empleados) {
        
        if(e.getSalario() > maxSalario)
        {
        
            maxSalario = e.getSalario();
            empMayorSalario = e;
        }

    }

    


    System.out.println("El empleado que mas dinero ganas es: ");
    System.out.println("Nombre: " + empMayorSalario.getNombre());
    System.out.println("Cargo: " + empMayorSalario.getCargo());
    System.out.println("Salario: " + empMayorSalario.getSalario());

}

    public void empleadoMenorSalario() {
        Empleado empMenorSalario = empleados.get(0);
        double menSalario = empleados.get(0).getSalario();
        for(Empleado e:empleados) {
            if(e.getSalario() < menSalario ) {
                menSalario = e.getSalario();
                empMenorSalario = e;
            }

   


        }

        System.out.println("El empleado que menos plata gana es: ");
        System.out.println("Nombre: " + empMenorSalario.getNombre());
        System.out.println("Cargo: " + empMenorSalario.getCargo());
        System.out.println("Salario: " + empMenorSalario.getSalario());
    }

}




