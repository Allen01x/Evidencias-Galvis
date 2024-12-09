
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class AppEmpresaEstructurada {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> cargos = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empelados:"));

        for(int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del empleado:");
            String cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado:");
            Double salario = Double.parseDouble(JOptionPane.showInputDialog (null, "Ingrese el salario del empleado:"));
            
            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);
            
           

            

        }

        System.out.println("Los nombre y los salarios de los empleados son: ");
        for(int emp = 0; emp < cantidad; emp++)
        {
            System.out.println("Nombre: " + nombres.get(emp) + " Salario: " + salarios.get(emp));
        }
        

        double total = 0;

        for(int emp = 0; emp < cantidad; emp++) {
         total = total + salarios.get(emp);
        }

      System.out.println("El total de salarios pagados a los empleados es: " + total);  

      System.out.println("El empleado que mas dinero gana es: " );
      double mayorSalario = salarios.get(0);
      int posicion = 0;
      for(int emp = 1; emp < cantidad; emp++) {
        if(salarios.get(emp) > mayorSalario) {
            mayorSalario = salarios.get(emp);
            posicion = emp;   
        }
      }
      System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) + " Salario:" + salarios.get(posicion));

      System.out.println("El empleado que menos dinero gana es: " );
      double menorSalario = salarios.get(0);
      posicion = 0;
      for(int emp = 1; emp < cantidad; emp++) {
        if(salarios.get(emp) < menorSalario) {
            menorSalario = salarios.get(emp);
            posicion = emp;   
        }
      }
      System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) + " Salario:" + salarios.get(posicion));

      

    }
}


