package client.serverConnection;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

//import client.serverConnection.serverWinController.LoginController;
//import client.serverConnection.serverWinController.RegController;

import java.awt.*;

public class serverWin {
	JFrame win;
	JLabel unichat;
	JLabel lblIndirizzoServer;
	JLabel lblNomeUtente;
	JLabel logo;
	JLabel lblPassword;
	JPanel contentPane;
	JPanel titlePanel;
	JTextField serverField;
	JTextField utenteField;
	JTextField passwordField;
	JButton btnLogin;
	JButton btnSignUp;
	JSlider slider;
	JPasswordField passowrdField;
	

	serverWinController controller;
	public serverWin(serverWinController controller) {
		this.controller = controller;
		init();
	}

	private void init(){
		win = new JFrame();
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 255));
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		win.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		StyledDocument doc = textPane.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		textPane.setText(" U  N  I  C  H  A  T ");
		textPane.setForeground(Color.WHITE);
		textPane.setFont(new Font("Impact", Font.BOLD, 42));
		textPane.setEditable(false);
		textPane.setBackground(Color.CYAN);
		textPane.setBounds(10, 0, 415, 65);
		contentPane.add(textPane);
		
		serverField = new JTextField();
		serverField.setBackground(Color.CYAN);
		serverField.setForeground(Color.BLACK);
		serverField.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		serverField.setBounds(178, 61, 246, 36);
		contentPane.add(serverField);
		serverField.setColumns(10);
	
		
		lblIndirizzoServer = new JLabel("Indirizzo server");
		lblIndirizzoServer.setForeground(Color.DARK_GRAY);
		lblIndirizzoServer.setFont(new Font("Javanese Text", Font.PLAIN, 21));
		lblIndirizzoServer.setBounds(10, 64, 170, 32);
		lblIndirizzoServer.setVisible(true);
		lblIndirizzoServer.setEnabled(true);
		contentPane.add(lblIndirizzoServer);
		
		
		lblNomeUtente = new JLabel("Nome utente");
		lblNomeUtente.setForeground(Color.DARK_GRAY);
		lblNomeUtente.setFont(new Font("Javanese Text", Font.PLAIN, 21));
		lblNomeUtente.setBounds(10, 123, 170, 32);
		lblNomeUtente.setVisible(true);
		lblNomeUtente.setEnabled(true);
		contentPane.add(lblNomeUtente);
		
		utenteField = new JTextField();
		utenteField.setEnabled(true);
		utenteField.setForeground(Color.BLACK);
		utenteField.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		utenteField.setFocusable(true);
		utenteField.setColumns(10);
		utenteField.setBackground(Color.CYAN);
		utenteField.setBounds(178, 120, 246, 36);
		utenteField.setVisible(true);
		contentPane.add(utenteField);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("Javanese Text", Font.PLAIN, 21));
		lblPassword.setBounds(10, 182, 170, 32);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setEnabled(true);
		passwordField.setForeground(Color.BLACK);
		passwordField.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		passwordField.setFocusable(true);
		passwordField.setColumns(10);
		passwordField.setBackground(Color.CYAN);
		passwordField.setBounds(178, 179, 246, 36);
		contentPane.add(passwordField);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setEnabled(true);
		btnLogin.setEnabled(true);
		btnLogin.setForeground(Color.DARK_GRAY);
		btnLogin.setFont(new Font("Javanese Text", Font.BOLD, 27));
		btnLogin.setFocusPainted(true);
		btnLogin.setContentAreaFilled(true);
		btnLogin.setBorderPainted(true);
		btnLogin.setBackground(Color.CYAN);
		btnLogin.setBounds(9, 229, 195, 36);
		contentPane.add(btnLogin);
		
		btnSignUp = new JButton("SIGN UP");
		btnSignUp.setEnabled(true);
		btnSignUp.setForeground(Color.DARK_GRAY);
		btnSignUp.setFont(new Font("Javanese Text", Font.BOLD, 27));
		btnSignUp.setFocusPainted(true);
		btnSignUp.setContentAreaFilled(true);
		btnSignUp.setBorderPainted(true);
		btnSignUp.setBackground(Color.CYAN);
		btnSignUp.setBounds(229, 229, 195, 36);
		contentPane.add(btnSignUp);	
		
//		slider = new JSlider();
//		slider.setValue(0);
//		slider.setEnabled(false);
//		slider.setPaintTrack(false);
//		slider.setBounds(10, 277, 415, 26);
//		
//		if(lblIndirizzoServer.getText()!=null) { 
//			utenteField.setEnabled(true); 
//			slider.setValue(33);
//		}
//		
//		else if(lblIndirizzoServer.getText()!=null && utenteField.getText()!=null) { 
//			passwordField.setEnabled(true); slider.setValue(66);
//		}
//		
//		else if(lblIndirizzoServer.getText()!=null && utenteField.getText()!=null && passwordField.getText()!=null) {
//			slider.setValue(100);
//			btnLogin.setEnabled(true);
//		}
		
		btnLogin.addActionListener(controller.new LoginController());
		btnSignUp.addActionListener(controller.new RegController());
		
		
	}

	public void close(){
		win.dispose();
	}

	public String getIndirizzoServerText() {
		return serverField.getText();
	}

	public String getNomeUtenteText() {
		return utenteField.getText();
	}

	public String getPasswordText() {
		return passwordField.getText();
	}
}
