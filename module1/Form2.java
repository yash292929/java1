package com.gui2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Form2 extends WindowAdapter implements ActionListener 
{
	
	JFrame frame;
	JLabel label1 , label2 , label3;
	JButton btn1 , btn2;
	JCheckBox ch;
	JTextField tf1;
	JPasswordField pass;
	
	public Form2(){
		
		frame = new JFrame("ORDER LOGIN");
		
		
		label1 = new JLabel("LOGIN OR SIGN UP TO ORDER");
		label1.setBounds(380,200,300,50);
		label1.setForeground(Color.magenta);
		label1.setFont(new Font("Arial",Font.PLAIN,15));
		
		label2 = new JLabel("Username : ");
		label2.setBounds(300,300, 100, 20);
		
		tf1 = new JTextField();
		tf1.setBounds(400,300,250, 20);
		tf1.setColumns(3);
		
		label3 = new JLabel("Password : ");
		label3.setBounds(300,400,100,20);
		
		pass = new JPasswordField();
		pass.setBounds(400, 400, 250, 20);
		pass.setColumns(3);
		
		ch = new JCheckBox("Show password");
		ch.setBounds(400, 440, 250, 20);
		
		btn1 = new JButton("LOGIN");
		btn1.setBounds(200, 500,200,30);
		
		btn2 = new JButton("SIGN UP");
		btn2.setBounds(550, 500,200,30);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		ch.addActionListener(this);
		
		frame.addWindowListener(this);
		
		
		
		
		frame.add(label1);
		frame.add(label2);
		frame.add(tf1);
		frame.add(label3);
		frame.add(pass);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(ch);
		frame.setSize(900,900);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
	}

	

	
	public static void main(String[] args) 
	{
		new Form2();
		
	}
		

	
	



	@Override
	public void actionPerformed(ActionEvent e) {
		String a = tf1.getText().toString();
		String b = pass.getText().toString();
		
		String s = "abc";
		String t = "123";
		
		if(e.getSource()==btn1) {
			if(a==s && b==t) {
				
				JOptionPane.showMessageDialog(frame, "LOGIN SUCCESSFUL");
				
			}
			JOptionPane.showMessageDialog(frame, "LOGIN CREDENTIALS INVALID");
		
		}
		
		if(e.getSource()==ch) {
			if(ch.isSelected()) {
				pass.setEchoChar((char) 0);
			}else {
				pass.setEchoChar('*');
			}
		}
		
		
	}
	


}
