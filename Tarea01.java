import javax.swing.JOptionPane;

public class Tarea01 {
    public static void main(String[] args) {
        String nombre;
        float salario;
        nombre = JOptionPane.showInputDialog("Digite su nombre:");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite su salario semanal"));
        float salMes = salario*4;
        double deduc = (salMes*9.34)/100;
        double salNeto = salMes-deduc;
        
        JOptionPane.showMessageDialog(null, "Su nombre es: "+nombre+
                                      ", su salario semanal es: "+salario+
                                      ", su salario mensual es: "+salMes+
                                      ", el monto de sus deducciones: "+deduc+
                                      " y su salario neto: "+salNeto);
    }
}
