
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.JLabel;
import java.awt.BorderLayout;

public class FORM implements ActionListener {

	//private JPanel contentPane;
	JFrame frame;
	JLabel label,label1,label2,label3,label4;
	JTextField tf1,tf2,tf3,tf4;
	JButton btn;
	

	
	public FORM() {
		
		frame = new JFrame("Register form");
		label = new JLabel("Register here");
		label.setBounds(400, 10, 90, 90);
		
		label1 = new JLabel("Name : ");
		label1.setBounds(100,70,90,20);
		tf1 = new JTextField();
		tf1.setBounds(180, 70, 200, 20);
		
		label2 = new JLabel("Email Id : ");
		label2.setBounds(100,120,90,20);
		tf2 = new JTextField();
		tf2.setBounds(180, 120, 200, 20);
		
		label3 = new JLabel("Password : ");
		label3.setBounds(100,170,90,20);
		tf3 = new JTextField();
		tf3.setBounds(180,170, 200, 20);
		
		label4 = new JLabel("Confirm Password : ");
		label4.setBounds(100,220,150,20);
		tf4 = new JTextField();
		tf4.setBounds(250, 220, 200, 20);
		
		btn = new JButton("REGISTER");
		btn.setBounds(400, 450, 100, 20);
		
		
		btn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				

				
				System.out.println("success");

				
			}
		});
		
		
		frame.add(label);
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(btn);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.setSize(950,950);
		
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FORM();
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
		String c = tf3.getText().toString();
		
		if(e.getSource()== btn) {
			FileOutputStream fout = null;
			try {
				fout = new FileOutputStream("D://new.txt");
				fout.write(a.getBytes());
				fout.write(b.getBytes());
				fout.write(c.getBytes());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			System.out.println("success");
		}
		
	}



	
	
}