import javax.swing.JOptionPane;

public class ClassAge {
	public static void main(String[] args) {
		int input = Integer.parseInt(JOptionPane.showInputDialog("What is your height in feet"));
		if (input < 4)
			JOptionPane.showMessageDialog(null, "Your height of " + input + " feet means your too short to ride little bro");
		else
			JOptionPane.showMessageDialog(null, "Your height of " + input + " feet means your able to ride. Have fun and enjoy your ride.");
	}

}
