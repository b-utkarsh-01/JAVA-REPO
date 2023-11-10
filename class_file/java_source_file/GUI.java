import javax.swing.JOptionPane;

public class GUI{
    public static void main(String arr[]){
        String name = JOptionPane.showInputDialog("Enter Your name");
        while (name.isBlank()){
            name = JOptionPane.showInputDialog("Enter Your name");
        }
        JOptionPane.showMessageDialog(null,"Hello "+name);
    }
}