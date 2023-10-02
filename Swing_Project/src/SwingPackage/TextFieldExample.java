package SwingPackage;

import javax.swing.*;

public class TextFieldExample {
	 
//	public TextFieldExample()
//	{
//	
//		JFrame f=new JFrame("Button Example");
//		JTextField f1=new JTextField("First Name :");
//		JTextField f2=new JTextField("Last Name :");
//	    f1.setBounds(100, 50, 400, 150);
//	    f2.setBounds(100, 80, 400, 200);
//	    f.add(f1);
//	    f.add(f2);
//	    f.setSize(500, 500);
//	    f.setLayout(null);
//	    f.setVisible(true);
//	    
//	}
	

	public static void main(String[] args) {
		
		
	      // TextFieldExample();
		
		
		JFrame f=new JFrame("Text Field Example");
		JTextField f1=new JTextField("First Name :");
		JTextField f2=new JTextField("Last Name :");
	    f1.setBounds(40, 80, 200, 50);
	    f2.setBounds(40, 160, 200, 50);
	    f.add(f1);
	    f.add(f2);
	    f.setSize(500, 500);
	    f.setLayout(null);
	    f.setVisible(true);
		
 
	}

}
