package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.UserController;
import model.User;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MainWindows extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField passwordField;
	
	public MainWindows() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(52, 199, 117, 25);
		contentPane.add(btnLoad);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(261, 203, 117, 25);
		contentPane.add(btnSave);
		
		usernameField = new JTextField();
		usernameField.setBounds(153, 30, 114, 19);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setBounds(158, 86, 114, 19);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(58, 32, 111, 15);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(68, 78, 70, 15);
		contentPane.add(lblPassword);
		setVisible(true);
		
		/* ACCIONES */
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamada al controlador
				ArrayList<User> users = new UserController().getUsers();
				System.out.println(users);
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = passwordField.getText();
				User user = new User(username, password);
				new UserController().createUser(user);
			}
		});
	}
}
