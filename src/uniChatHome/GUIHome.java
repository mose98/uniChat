package uniChatHome;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JDesktopPane;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.DropMode;

public class GUIHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public GUIHome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mose9\\Downloads\\chap-master\\chap-master\\src\\ogo.png"));
		setTitle("UNICHAT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 287);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton start = new JButton("START");
		start.setBackground(new Color(0, 255, 255));
		start.setFont(new Font("Microsoft Himalaya", Font.BOLD, 53));
		start.setForeground(Color.DARK_GRAY);
		start.setBounds(10, 198, 415, 57);
		contentPane.add(start);
		
		start.setFocusPainted(false);
		start.setRolloverEnabled(true);
		start.setBorderPainted(false);
		start.setContentAreaFilled(true);
		start.setFocusPainted(false);
		
		JTextPane descrizione = new JTextPane();
		StyledDocument doc = descrizione.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		descrizione.setForeground(new Color(240, 255, 240));
		descrizione.setEditable(false);
		descrizione.setFont(new Font("Impact", Font.PLAIN, 16));
		descrizione.setBackground(new Color(0, 255, 255));
		descrizione.setText("Realizzato da \t\r\nBettinzana Alessandro\r\nGueye Moussa Kare\r\nMartani Matteo\r\nSartorelli Marco");
		descrizione.setBounds(10, 76, 415, 111);
		contentPane.add(descrizione);
		
		JTextPane titolo = new JTextPane();
		StyledDocument doctitle = titolo.getStyledDocument();
		SimpleAttributeSet centertitle = new SimpleAttributeSet();
		StyleConstants.setAlignment(centertitle, StyleConstants.ALIGN_CENTER);
		doctitle.setParagraphAttributes(0, doctitle.getLength(), centertitle, false);
		titolo.setText(" U  N  I  C  H  A  T ");
		titolo.setForeground(new Color(240, 255, 240));
		titolo.setFont(new Font("Impact", Font.BOLD, 53));
		titolo.setEditable(false);
		titolo.setBackground(new Color(0, 255, 255));
		titolo.setBounds(10, 0, 415, 65);
		contentPane.add(titolo);
	}
}
