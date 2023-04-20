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

public class MainWindows extends JFrame {

	private JPanel contentPane;
	
	public MainWindows() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(159, 130, 117, 25);
		contentPane.add(btnLoad);
		setVisible(true);
		
		/* ACCIONES */
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamada al controlador
				ArrayList<User> users = new UserController().getUsers();
				System.out.println(users);
			}
		});
	}
}
