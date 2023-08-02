import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String input = JOptionPane.showInputDialog( "ingresa un entero");
        int suma = Integer.parseInt(input)+2;
        JOptionPane.showMessageDialog(null, suma);
        
    }
}
