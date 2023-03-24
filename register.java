package com.data;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

//import com.mysql.jdbc.Connection;

public class register implements ActionListener {
	
	JFrame main;
	JButton signup,login;
	
	public register() {
		
		main = new JFrame();
		
		login = new JButton("LOGIN");
		signup = new JButton("SIGNUP");
		
		login.addActionListener(this);
		signup.addActionListener(this);
		
		main.add(login);
		main.add(signup);
		main.setSize(500,500);
		main.setVisible(true);
		main.setLayout(new FlowLayout());
		
		
	}
	
	public static void main(String[] args) {
		new register();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		operations o = new operations();
		if(e.getSource()==login) {
			
			o.login();
			
		}
		if(e.getSource()==signup) {
			
			o.signup();
			
		}
		
		
	}

}
class operations{
	JFrame login1 , signup1;
	JButton logins,signin;
	JTextArea fname,uname,email,lu,idid;
	JPasswordField pass,lpass;
	JLabel f,u,e,p,user,pass1,idid1;
	
	public void signup() {
		
		signup1 = new JFrame();
		
		f = new JLabel("firstname : ");
		f.setBounds(44, 25, 70, 20);
		
		u = new JLabel("Username : ");
		u.setBounds(44, 75, 70, 20);
		
		e = new JLabel("email : ");
		e.setBounds(44, 125, 70, 20);
		
		p = new JLabel("passord: ");
		p.setBounds(44, 180, 70, 20);
		
		
		
		fname = new JTextArea();
		fname.setBounds(150, 25, 100,20);
		
		uname = new JTextArea();
		uname.setBounds(150, 75, 100,20);
		
		email = new JTextArea();
		email.setBounds(150, 125, 100,20);
		
		pass = new JPasswordField();
		pass.setBounds(150, 180, 100,20);
		
		signin = new JButton("SIGN UP");
		signin.setBounds(180, 350, 200, 23);
		
		signin.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				 String host ="jdbc:mysql://localhost:3306/";
				 String db= "signup";
				 String url=host+db;
				 
				 String fn = fname.getText().toString();
				 String un = uname.getText().toString();
				 String em = email.getText().toString();
				 String ps = pass.getText().toString();
				 
				 try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql = "insert into logins values(null,'"+fn+"','"+un+"','"+ps+"','"+em+"')";
					
					Statement stmt = con.createStatement();
					 int status =stmt.executeUpdate(sql);
						
					  if(status > 0) {
						signup1.setVisible(false);
					  }else {
						System.out.println("ERROR!");
					  }
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		signup1.add(fname);
		signup1.add(uname);
		signup1.add(email);
		signup1.add(pass);
		signup1.add(f);
		signup1.add(u);
		signup1.add(e);
		signup1.add(p);
		
		signup1.add(signin);
		signup1.setSize(450,450);
		signup1.setLayout(null);
		signup1.setVisible(true);
		
	}
	
	public void login() {
		login1 = new JFrame();
		
		idid1 = new JLabel("ID : ");
		idid1.setBounds(225,100, 150,20);
		
		idid = new JTextArea();
		idid.setBounds(150,150,170, 20);
		
		
		user = new JLabel("USERNAME : ");
		user.setBounds(200,200, 150,20);
		
		lu = new JTextArea();
		lu.setBounds(150, 250, 170, 20);
		
		
		pass1 = new JLabel("PASSWORD : ");
		pass1.setBounds(200, 300,150, 20);
		
		lpass = new JPasswordField();
		lpass.setBounds(150, 350, 170, 20);
		
		logins = new JButton("LOGIN");
		logins.setBounds(180,400,120, 20);
		
		logins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String host ="jdbc:mysql://localhost:3306/";
				String db= "signup";
				String url=host+db;
				
				String unm = lu.getText().toString();
				String psps = lpass.getText().toString();
				
				String sql = "";

				
			}
		});
		login1.add(idid);
		login1.add(idid1);
		login1.add(user);
		login1.add(lu);
		login1.add(pass1);
		login1.add(lpass);
		login1.add(logins);
		login1.setSize(500,500);
		login1.setLayout(null);
		login1.setVisible(true);
		
	}
	
}
