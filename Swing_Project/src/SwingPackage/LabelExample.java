package SwingPackage;

import javax.swing.*;

public class LabelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Button Example");
		JLabel l=new JLabel("First Name :");
		JLabel l2=new JLabel("Last Name :");
	    l.setBounds(100, 50, 400, 150);
	    l2.setBounds(100, 80, 400, 200);
	    f.add(l);
	    f.add(l2);
	    f.setSize(500, 500);
	    f.setLayout(null);
	    f.setVisible(true);
	}

}
