package _02_Chat_Application;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp extends JFrame{
JButton button;
Clientchat client;
Serverchat server;

public ChatApp() {
	int answer = JOptionPane.showConfirmDialog(null, "you tryna connect bro?");
	if (answer == JOptionPane.YES_OPTION) {
		server = new Serverchat(8080);
		JOptionPane.showMessageDialog(null, "server started at"+server.getIPAddress()+" bro");
		server.start();
	}else {
		String ip = JOptionPane.showInputDialog("enter your ip bro");
		String portStr = JOptionPane.showInputDialog("enter the port bro");
		int port = Integer.parseInt(portStr);
		client = new Clientchat(ip,port);
		client.start();
	}
}


public static void main(String[] args) {
	new ChatApp();
}
}
