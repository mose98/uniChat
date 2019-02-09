package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Server {
	ArrayList<ClientHandler> clientHandlers = new ArrayList<>();

	public Server() {
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			Socket s;
			while (true) {
				s = serverSocket.accept();
				System.out.println("Accetto client");
				ClientHandler clientHandler = new ClientHandler(s);
				clientHandlers.add(clientHandler);
				Thread t = new Thread(clientHandler);
				t.start();
			}
		} catch (Exception e) {
			System.out.println("Errore creazione server");
		}
	}

	public void tellEveryOne(String msg) {
		System.out.println("Stampo messaggio ricevuto");
		for (ClientHandler clientHandler : clientHandlers) {
			clientHandler.inviaMessaggioAlClient(msg);
		}
	}

	/*
	 * Per ogni client viene creata una classe ClientHandler che controlla quando il client scrive qualcosa e lo inoltra
	 * a tutti gli altri client connessi a questo server
	 * */
	class ClientHandler implements Runnable {
		BufferedReader bufferedReader;
		PrintWriter printWriter;
		Socket socket;
		String username;

		public ClientHandler(Socket socket) {
			this.socket = socket;
			try {
				bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				printWriter = new PrintWriter(socket.getOutputStream());
			} catch (Exception e) {
			}
		}

		@Override
		public void run() {

			if (!loginClient())
				return; //Credenziali client non corrette

			String msg;
			try {
				while ((msg = bufferedReader.readLine()) != null) {
					String toSend;
					DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					Date date = new Date();
					toSend = String.format("[%s] %s : %s",dateFormat.format(date),username,msg);
					tellEveryOne(toSend);
				}
			} catch (Exception e) {
			}
		}

		public boolean loginClient() {
			try {
				username = bufferedReader.readLine();
				String password = bufferedReader.readLine();
				if (true) {
					printWriter.println("ok");
					printWriter.flush();
					tellEveryOne("L'utente " + username + " si e` unito alla chat");
					return true;
				}
			} catch (Exception e) {
			}
			return false;
		}

		public void inviaMessaggioAlClient(String msg) {
			printWriter.println(msg);
			printWriter.flush();
		}
	}
}

