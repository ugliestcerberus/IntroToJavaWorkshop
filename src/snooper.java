import javax.swing.JOptionPane;


public class snooper {
	public static void main(String[] args) {
	String phoneNumber=JOptionPane.showInputDialog("What is your phone number?");
	String Live=JOptionPane.showInputDialog("Where do you live?");
	String School=JOptionPane.showInputDialog("What school do you go to?");
	String Electronic=JOptionPane.showInputDialog("What kind of electronic do you have?");
	JOptionPane.showMessageDialog(null, "I know your phone number is "+ phoneNumber+" And I know you live at "+ Live+" I also know what school you go to "+ School+ " Lastly I know what electronic you have "+ Electronic);
	}

}
