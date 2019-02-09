package client.serverConnection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class khjhjk extends JFrame {


	JPanel contentPane;
	JTextField serverField;
	JLabel lblNomeUtente;
	JTextField utenteField;
	JLabel lblPassword;
	JTextField passwordField;
	JButton btnLogin;
	JButton btnSignUp;
	JFrame win;
	JLabel lblIndirizzoServer;
	serverWinController controller;
	JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					khjhjk frame = new khjhjk();
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
	public khjhjk() {
		win=new JFrame();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setBounds(100, 100, 450, 353);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 255));
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		win.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		serverField = new JTextField();
		serverField.setBackground(Color.CYAN);
		serverField.setForeground(new Color(0, 255, 255));
		serverField.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		serverField.setBounds(178, 61, 246, 36);
		contentPane.add(serverField);
		serverField.setColumns(10);
		
		
		serverField.setFocusable(true);;
	
		
		lblIndirizzoServer = new JLabel("Indirizzo server");
		lblIndirizzoServer.setForeground(Color.DARK_GRAY);
		lblIndirizzoServer.setFont(new Font("Javanese Text", Font.PLAIN, 21));
		lblIndirizzoServer.setBounds(10, 64, 170, 32);
		contentPane.add(lblIndirizzoServer);
		
		lblNomeUtente = new JLabel("Nome utente");
		lblNomeUtente.setForeground(Color.DARK_GRAY);
		lblNomeUtente.setFont(new Font("Javanese Text", Font.PLAIN, 21));
		lblNomeUtente.setBounds(10, 123, 170, 32);
		contentPane.add(lblNomeUtente);
		
		utenteField = new JTextField();
		utenteField.setEnabled(true);
		utenteField.setForeground(Color.CYAN);
		utenteField.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		utenteField.setFocusable(true);
		utenteField.setColumns(10);
		utenteField.setBackground(Color.CYAN);
		utenteField.setBounds(178, 120, 246, 36);
		contentPane.add(utenteField);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("Javanese Text", Font.PLAIN, 21));
		lblPassword.setBounds(10, 182, 170, 32);
		contentPane.add(lblPassword);
		
		passwordField = new JTextField();
		passwordField.setEnabled(false);
		passwordField.setForeground(Color.CYAN);
		passwordField.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		passwordField.setFocusable(true);
		passwordField.setColumns(10);
		passwordField.setBackground(Color.CYAN);
		passwordField.setBounds(178, 179, 246, 36);
		contentPane.add(passwordField);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setEnabled(false);
		btnLogin.setRolloverEnabled(true);
		btnLogin.setForeground(Color.DARK_GRAY);
		btnLogin.setFont(new Font("Javanese Text", Font.BOLD, 27));
		btnLogin.setFocusPainted(false);
		btnLogin.setContentAreaFilled(true);
		btnLogin.setBorderPainted(true);
		btnLogin.setBackground(Color.CYAN);
		btnLogin.setBounds(9, 229, 195, 36);
		contentPane.add(btnLogin);
		
		
		textPane = new JTextPane();
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
		
		btnSignUp = new JButton("SIGN UP");
		btnSignUp.setEnabled(false);
		btnSignUp.setRolloverEnabled(true);
		btnSignUp.setForeground(Color.DARK_GRAY);
		btnSignUp.setFont(new Font("Javanese Text", Font.BOLD, 27));
		btnSignUp.setFocusPainted(false);
		btnSignUp.setContentAreaFilled(true);
		btnSignUp.setBorderPainted(true);
		btnSignUp.setBackground(Color.CYAN);
		btnSignUp.setBounds(229, 229, 195, 36);
		contentPane.add(btnSignUp);	
		
		JSlider slider = new JSlider();
		slider.setPaintTrack(false);
		slider.setBounds(10, 277, 415, 26);
		contentPane.add(slider);
		
		if(lblIndirizzoServer.getText()!=null) { 
			utenteField.setEnabled(true); 
			slider.setValue(33);
		}
		
		else if(lblIndirizzoServer.getText()!=null && utenteField.getText()!=null) { 
			passwordField.setEnabled(true); slider.setValue(66);
		}
		
		else if(lblIndirizzoServer.getText()!=null && utenteField.getText()!=null && passwordField.getText()!=null) {
			slider.setValue(100);
			btnLogin.setEnabled(true);
		}
	}

}
