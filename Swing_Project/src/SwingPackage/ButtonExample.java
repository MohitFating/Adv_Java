package SwingPackage;

import javax.swing.*;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton("Click Me");
	    b.setBounds(50, 100, 200, 75);
	    f.add(b);
	    f.setSize(500, 500);
	    f.setVisible(true);
		

	}

}
