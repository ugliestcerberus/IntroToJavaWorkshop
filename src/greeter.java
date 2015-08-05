import javax.swing.JOptionPane;


public class greeter {
public static void main(String[] args) {
	String  answer=JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hello "+ answer);
}
}
