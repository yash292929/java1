package com.database;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * User Registration using Swing
 * @author javaguides.net
 *
 */
public class form extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JRadioButton rb,rb1;
    private JCheckBox ch1,ch2,ch3;
    private JComboBox cb;
    String city[] = {"Rajkot","Baroda","Surat"};
    String gender ="";
    
    
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	form frame = new form();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public form() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 900);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 243, 110, 29);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblgender.setBounds(58, 415, 99, 43);
        contentPane.add(lblgender);
        
        
        JLabel lblcity = new JLabel("City");
        lblcity.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblcity.setBounds(58, 475, 99, 43);
        contentPane.add(lblcity);
        
        

        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        firstname.setBounds(214, 151, 228, 50);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        lastname.setBounds(214, 235, 228, 50);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();

        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 320, 228, 50);
        contentPane.add(email);
        email.setColumns(10);
        
        rb = new JRadioButton("Male");
        rb.setBounds(214, 415, 228, 20);
        contentPane.add(rb);
        //rb.setColumns(10);
        
        rb1 = new JRadioButton("Female");
        rb1.setBounds(214, 435, 228, 20);
        contentPane.add(rb1);
        //email.setColumns(10);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb1);
        
        cb =new JComboBox<>(city);
		cb.setBounds(214, 485, 128, 30);
		cb.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(cb);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(707, 151, 228, 50);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 245, 99, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Mobile number");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMobileNumber.setBounds(542, 329, 139, 26);
        contentPane.add(lblMobileNumber);
        
        JLabel lblhobby = new JLabel("Hobbies");
        lblhobby.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblhobby.setBounds(542, 415, 129, 26);
        contentPane.add(lblhobby);
        
        

        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mob.setBounds(707, 320, 228, 50);
        contentPane.add(mob);
        mob.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(707, 235, 228, 50);
        contentPane.add(passwordField);
        
        ch1 = new JCheckBox("sports");
        ch1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        ch1.setBounds(707, 415, 228, 30);
        contentPane.add(ch1);
        
        ch2 = new JCheckBox("Video games");
        ch2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        ch2.setBounds(707, 445, 228, 30);
        contentPane.add(ch2);
        
        ch3 = new JCheckBox("Reading");
        ch3.setFont(new Font("Tahoma", Font.PLAIN, 22));
        ch3.setBounds(707, 475, 228, 30);
        contentPane.add(ch3);
        
        

        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	
			    StringBuilder builder = new StringBuilder("");

            	
            	if(ch1.isSelected()) {
  			    	builder.append("sports \n");
  			    	
  			    }
  			    if(ch2.isSelected()) {
			    	builder.append("video games \n");
			    	
			    }
  			    if(ch3.isSelected()) {
			    	builder.append("reading \n");
			    	
			    }

                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
                String password = passwordField.getText();
                if(rb.isSelected()) {
                	 gender = rb.getText().toString();
                }else {
                	 gender = rb1.getText().toString();
                }
                 
               
                String b = builder.toString();
                
                
                
               
                
                
                
                String city = cb.getSelectedItem().toString();

                String msg = "" + firstName;
                msg += " \n";
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }
                String host ="jdbc:mysql://localhost:3306/";
  			    String db= "registration";
  			    String url=host+db;
  			    

                try {
                	
                	Class.forName("com.mysql.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url,"root", "");

                    String query = "INSERT INTO account values(null,'" + firstName + "','" + lastName + "','" + emailId + "','" +
                        userName + "','" + mobileNumber + "','" + password + "','"+gender+"','"+city+"','"+b+"')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 560, 259, 74);
        contentPane.add(btnNewButton);
    }
}