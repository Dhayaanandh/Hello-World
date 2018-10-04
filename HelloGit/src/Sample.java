
/*public class Sample {

	public static void main(String[] args) {
		// Adding TODO Auto-generated method stub -By Madhan SAnkar
		System.out.println("Hello Git new Brach testing futher");
	}

}*/

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
public class Sample{


	public static void  modify() {
		Test t;
		System.out.println("No ACtion");
	}
     public static void main(String []args){
         try{
        //System.out.println(InetAddress.getByName("SC-RDOPS-vm13-dhcp-148-119.eng.vmware.com").getHostAddress());
        	/*Properties prop = System.getProperties();
        	Set<Object> props = prop.keySet();
        	for(Object obj : props)
        	{
        		System.out.println(obj +"--->"+System.getProperty(obj.toString()));
        	}*/
        	//modify();
        	 URL url = new URL("https://www.google.com");
        	 HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
        	 SSLSocket socket = (SSLSocket) con.getSSLSocketFactory().createSocket();
        	 String[] test = socket.getSSLParameters().getProtocols();
        	 for(int i=0;i<test.length;i++)
        	 System.out.println(con.getCipherSuite());
        	System.out.println("Commiting");
        	System.out.println("Hello Testing");
         }
         catch(Exception e)
         {
              e.printStackTrace();
         }
     }
}

