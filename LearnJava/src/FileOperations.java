import java.io.File;
import java.net.InetAddress;
import java.nio.file.*;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
	/*for(i=j=0;i<=5&&j<=5;i++,j++)
	{*/
		try {
			String vcIP = "sc-rdops-vm12-dhcp-113-194.eng.vmware.com";
		InetAddress address = InetAddress.getByName("10.161.113.194");
		System.out.println(address.getHostAddress());
		String FQDN = vcIP.concat(".");
		String hostName = FQDN.substring(0, FQDN.indexOf("."));
		System.out.println(hostName+" "+vcIP);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	//}
		
	}

}
