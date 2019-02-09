package client.serverConnection;

public class serverWinModel {
	serverWinController controller;

	public serverWinModel(serverWinController controller) {
		this.controller = controller;
	}

	public String[] translateStringToIp(String serverString){
		String[] indirizzoServerDiviso = serverString.split(":");
		return indirizzoServerDiviso;
	}
}
