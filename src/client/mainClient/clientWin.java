package client.mainClient;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class clientWin extends JFrame {
	private JTextField textMsgField;
	private JButton btnSendMsg;
	private JTextArea textArea;
	clientWinController controller;
	
	



	/**
	 * Create the frame.
	 */
	public clientWin(clientWinController controller) {
		this.controller=controller;
		getContentPane().setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 440);
		getContentPane().setLayout(null);
		
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Javanese Text", Font.PLAIN, 9));
		textArea.setBounds(10, 41, 414, 305);
		getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Javanese Text", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(10, 11, 414, 33);
		getContentPane().add(lblNewLabel);
		
		textMsgField = new JTextField();
		textMsgField.setFont(new Font("Javanese Text", Font.PLAIN, 9));
		textMsgField.setBounds(10, 355, 361, 33);
		getContentPane().add(textMsgField);
		textMsgField.setColumns(10);   
		
		ImageIcon icon = new ImageIcon("logo.png");
		btnSendMsg = new JButton(icon);
		btnSendMsg.setFont(new Font("Javanese Text", Font.PLAIN, 9));
		btnSendMsg.setBounds(378, 355, 46, 33);
		getContentPane().add(btnSendMsg);
		
	}
	
	public String getChatTextToSubmit() {
		return textMsgField.getText().trim();
	}

	public void setChatTextToSubmit(String msg) {
		textMsgField.setText(msg);
	}

	public void appendToChat(String msg){textArea.append(msg + "\n");}
}
