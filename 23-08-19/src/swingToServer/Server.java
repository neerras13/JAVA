package swingToServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

import employee.dao.*;
import employee.service.*;
import employee.EModel;

public class Server {
	public static void main(String [] args) throws SQLException {
        
        ServerSocket server = null;
        Socket client;
        DaoImpl dao = new DaoImpl();
        
        // Default port number we are going to use
        int portnumber = 1234;
       
        
        // Create Server side socket
        try {
            server = new ServerSocket(portnumber);
        } catch (IOException ie) {
            System.out.println("Cannot open socket." + ie);
            System.exit(1);
        }
        while(true) {
            
            try {
                System.out.println("Waiting for connect request...");
                client = server.accept();
                
                System.out.println("Connect request is accepted...");
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
                String msgFromClient = br.readLine();
                int msg = br.read();
                System.out.println("Message received from client = " + msgFromClient);
                
                
                if (msgFromClient != null && !msgFromClient.equalsIgnoreCase("bye")) {
                    OutputStream clientOut = client.getOutputStream();
                    PrintWriter pw = new PrintWriter(clientOut, true);
                    String[] arr = new String[4];
                    arr=msgFromClient.split(" ");
                    dao.createEmployee(new EModel(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),arr[3]));
                    pw.println(msgFromClient);
                }
                
                // Close sockets
                if (msgFromClient != null && msgFromClient.equalsIgnoreCase("bye")) {
                    server.close();
                    client.close();
                    break;
                }
                
            } catch (IOException ie) {
            }
        }
    }

}
