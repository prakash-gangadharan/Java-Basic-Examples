import java.io.IOException;
import java.util.concurrent.TimeoutException;


public class StartWptdriverDemo {

	public static void main(String[] args){
		WptChecker start = new WptChecker();
		try{
			start.startWptdriver();
		}catch(IOException ioex){System.out.println(ioex+"IOException Occured");}
		
		WptChecker kill = new WptChecker();
		try{
		kill.killWptdriver();
		}catch(Throwable e){
			System.out.println(e+"Exception has Occured");
		}

	}
}