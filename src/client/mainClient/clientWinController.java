package client.mainClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class clientWinController implements Runnable{
	Socket socket;
	BufferedReader bufferedReader;
	PrintWriter printWriter;

	clientWin win;

	public clientWinController(Socket socket, BufferedReader bufferedReader, PrintWriter printWriter) {
		this.socket = socket;
		this.bufferedReader = bufferedReader;
		this.printWriter = printWriter;

		win = new clientWin(this);

		Thread t = new Thread(this, "streamHeandler");
		t.start();

		System.out.println("esco");
	}

	public void run() {
		try {
			String msg;
			while (true) {

				if ((msg = bufferedReader.readLine()) != null) {
					win.appendToChat(msg);
					System.out.println("Stampo su pannel");
				}
			}
		} catch (Exception e) {
			System.out.println("Errore run client");
		}
		System.out.println("Esce run client errore");
	}

	class ClientSubmitter implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent actionEvent) {
			String in = win.getChatTextToSubmit();
			printWriter.println(in);
			printWriter.flush();
			System.out.println("Invio messaggio a server " + in);
//			win.appendToChat(in);
			win.setChatTextToSubmit("");
		}
	}
}
