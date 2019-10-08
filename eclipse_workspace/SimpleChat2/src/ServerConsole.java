import java.io.*;

import client.ChatClient;
import common.ChatIF;
import server.EchoServer;

public class ServerConsole implements ChatIF {
	/**
	 * The default port to listen on.
	 */
	final public static int DEFAULT_PORT = 5555;
  
  
	EchoServer server;
  
	public ServerConsole(int port) 
	{
		server = new EchoServer(port);
	}	
	  
	@Override
	public void display(String message) {
		System.out.println("> " + message);
	}
	
	private void accept() throws IOException {
		server.listen(); //Start listening for connections
    	BufferedReader fromConsole = new BufferedReader(new InputStreamReader(System.in));
     	String message;
     	while (true) 
     	{
     		message = fromConsole.readLine();
     		server.handleMessageFromServerUI(message);
     	}
	}
	
	 //Class methods ***************************************************
	  
	  /**
	   * This method is responsible for the creation of 
	   * the server instance (there is no UI in this phase).
	   *
	   * @param args[0] The port number to listen on.  Defaults to 5555 
	   *          if no argument is entered.
	   */
	  public static void main(String[] args) 
	  {
	    int port = 0; //Port to listen on

	    try
	    {
	    	port = Integer.parseInt(args[0]); //Get port from command line
	    }
	    catch(Throwable t)
	    {
	    	port = DEFAULT_PORT; //Set port to 5555
	    }
		
	    ServerConsole serverChat = new ServerConsole(port);
	    
	    try {
			serverChat.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }
}
