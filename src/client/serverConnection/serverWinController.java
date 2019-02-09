package client.serverConnection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class serverWinController {
	
	serverWin win;
	serverWinModel model;

	public serverWinController() {
		win = new serverWin(this);
		model = new serverWinModel(this);
	}

	class LoginController implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent actionEvent) {
			String indirizzoServer = win.getIndirizzoServerText();
			String nomeUtente = win.getNomeUtenteText();
			String password = win.getPasswordText();
			//Controlla stringa indirizzoServer


			//Dividi in indirizzo ip e porta
			String[] indirizzoServerDiviso = model.translateStringToIp(indirizzoServer);
			String ipServer = indirizzoServerDiviso[0];
			int port = Integer.parseInt(indirizzoServerDiviso[1]);

			try {
				Socket s = new Socket(ipServer, port);
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				PrintWriter pr = new PrintWriter(s.getOutputStream());

				pr.println(nomeUtente);
				pr.println(password);
				pr.flush();

				if (br.readLine().equalsIgnoreCase("ok")) {
					//Creo un client adatto alla chat
					win.close();
					new client.mainClient.clientWinController(s,br,pr);
				}
				else
					JOptionPane.showMessageDialog(null, "Utente non trovato");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Connessione server non riuscita");
			}
		}
	}


	class RegController implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent actionEvent) {
			System.out.println("reg");
		}
	}

}
