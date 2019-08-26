package multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ChatServer {

	public static void main(String[] args) throws IOException {

		int port=1234;
		MulticastSocket servermulti = new MulticastSocket(port);
		InetAddress group = InetAddress.getByName("225.0.0.1");

        // getByName- returns IP address of given host
        servermulti.joinGroup(group);
        System.out.println("joinGroup method is called...");
        boolean infinite = true;
        
        // Continually receives data and prints them 
        while(infinite) {
            byte buf[] = new byte[1024];
            DatagramPacket data =
                    new DatagramPacket(buf, buf.length);
            servermulti.receive(data);
            String msg =
                    new String(data.getData()).trim();
            System.out.println("Message received from client = " + msg);
        }
        servermulti.close();
    }
	}


