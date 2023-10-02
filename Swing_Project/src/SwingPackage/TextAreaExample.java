package SwingPackage;

import javax.swing.*;

public class TextAreaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f=new JFrame("Text Field Example");
		JTextArea f1=new JTextArea("First Name :");
		JTextArea f2=new JTextArea("Last Name :");
	    f1.setBounds(40, 80, 200, 50);
	    f2.setBounds(40, 160, 200, 50);
	    f.add(f1);
	    f.add(f2);
	    f.setSize(500, 500);
	    f.setLayout(null);
	    f.setVisible(true);
	    
	}

}
