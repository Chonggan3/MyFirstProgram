package MyFirstProgram;

import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name =  JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null,"Hello /t" + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age")); 
		JOptionPane.showMessageDialog(null,"You are /t " + age + "years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
		JOptionPane.showMessageDialog(null,"You are /t " + height );
	}

}
