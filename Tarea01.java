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
        
        JOptionPane.showMessageDialog(null, "Su nombre es: "+nombre);
        JOptionPane.showMessageDialog(null, "Su salario semanal es: "+salario);
        JOptionPane.showMessageDialog(null, "Su salario mensual es: "+salMes);
        JOptionPane.showMessageDialog(null, "Monto de las deducciones: "+deduc);
        JOptionPane.showMessageDialog(null, "Salario neto: "+salNeto);

    }
}
