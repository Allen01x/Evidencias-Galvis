import clasesNotas.*;
import javax.swing.JOptionPane;


public class NotasObjetos {
    public static void main(String[] args) throws Exception {
        for (int est = 1; est <= 2; est++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
            float notaParcial1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 1 del estudiante"));
            float notaParcial2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 2 del estudiante"));
            Estudiante estudiante = new Estudiante(nombre);
            estudiante.asignarNotaParcial1(notaParcial1);
            estudiante.asignarNotaParcial2(notaParcial2);
            estudiante.calcularNotaFinal();
            JOptionPane.showMessageDialog(null, "El estudiante " + estudiante.obtenerNombre() + " obtuvo una nota final de " + estudiante.obtenerNotaFinal() + " por consiguiente el estudiante " + estudiante.obtenerMensaje());
        }
    }
}
