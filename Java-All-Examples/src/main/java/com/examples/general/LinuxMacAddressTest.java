package com.examples.general;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class LinuxMacAddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String mac =  getLinuxMacAddress();
			System.out.println(mac);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getLinuxMacAddress() throws Throwable {
		  String strMacAddress = null ;
		  try {
		   String firstInterface = null ;        
		      Map<String, String> addressByNetwork = new HashMap<String, String>();
		      Enumeration<NetworkInterface> networkInterfaces ;
		      
		   try {
		    networkInterfaces = NetworkInterface.getNetworkInterfaces();
		    
		       while(networkInterfaces.hasMoreElements()){
		           NetworkInterface network = networkInterfaces.nextElement();
		  
		           byte[] bmac = network.getHardwareAddress();
		           if(bmac != null){
		               StringBuilder sb = new StringBuilder();
		               for (int i = 0; i < bmac.length; i++){
		                   sb.append(String.format("%02X%s", bmac[i], (i < bmac.length - 1) ? "-" : ""));        
		               }
		  
		               if(sb.toString().isEmpty()==false){
		                   addressByNetwork.put(network.getName(), sb.toString());
		                   //System.out.println("Address = "+sb.toString()+" @ ["+network.getName()+"] "+network.getDisplayName());
		               }
		  
		               if(sb.toString().isEmpty()==false && firstInterface == null){
		                   firstInterface = network.getName();
		               }
		           }
		       }
		   } catch (Throwable t) {
		    System.out.println("Exception in getLinuxMacAddress()" +  t.getMessage());
		    t.printStackTrace();
		    throw t;
		   }
		   
		      if(firstInterface != null){
		          //System.out.println("MAC: "+addressByNetwork.get(firstInterface));
		          strMacAddress = addressByNetwork.get(firstInterface);
		      }

		  }catch(Throwable t) {
		   System.out.println("Exception in getLinuxMacAddress() " + t.getMessage());
		   t.printStackTrace();
		   //throw t;
		  }finally {
		   
		  }
		  return strMacAddress.trim();
		  
		 }
	
}
