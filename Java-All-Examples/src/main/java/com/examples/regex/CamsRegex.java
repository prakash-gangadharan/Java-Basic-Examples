package com.examples.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// URL that generated this code:
// http://txt2re.com/index-java.php3?s=Client%20IP%20Address%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20:192.168.34.171%20Function%20Name%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20:Account_Statement_WS%20Function%20Accessed%20Time%20%20%20%20%20%20%20%20%20%20%20%20:7/8/2016%2012:00:21%20AM%20%20%20%20%20%20%20%20%20%20%20Input%20Parameters%20%20%20%20%20%20%20%20%20%20%20ApplicationID:%20CAMSWS,%20Password:%20KpU9gsjZPXReiHIsGPR/3Q==,%20FolioNo:%201016584721,%20pin:%20,%20From_Date:%2001-Jan-1994,%20To_Date:%2008-Jul-2016,%20Broker_Code:%20%20******************************************************&-50&125&109&126&-458&-459 


public class CamsRegex
{
  public static void main(String[] args)
  {
    String txt="Client IP Address                 :192.168.34.171 Function Name                     :Account_Statement_WS Function Accessed Time            :7/8/2016 12:00:21 AM           Input Parameters           ApplicationID: CAMSWS, Password: KpU9gsjZPXReiHIsGPR/3Q==, FolioNo: 1016584721, pin: , From_Date: 01-Jan-1994, To_Date: 08-Jul-2016, Broker_Code:  ******************************************************";

    String re1="(Client)";	// Variable Name 1
    String re2="(\\s+)";	// White Space 1
    String re3="((?:[a-z][a-z0-9_]*))";	// Variable Name 2
    String re4="(\\s+)";	// White Space 2
    String re5=".*?";	// Non-greedy match on filler
    String re6="(\\*)";	// Any Single Character 1
    String re7="(\\*)";	// Any Single Character 2

    Pattern p = Pattern.compile(re1+re2+re3+re4+re5+re6+re7,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    Matcher m = p.matcher(txt);
    if (m.find())
    {
        String var1=m.group(1);
        String ws1=m.group(2);
        String var2=m.group(3);
        String ws2=m.group(4);
        String c1=m.group(5);
        String c2=m.group(6);
        System.out.print("("+var1.toString()+")"+"("+ws1.toString()+")"+"("+var2.toString()+")"+"("+ws2.toString()+")"+"("+c1.toString()+")"+"("+c2.toString()+")"+"\n");
    }
  }
}

//-----
// This code is for use with Sun's Java VM - see http://java.sun.com/ for downloads. 
//
// Paste the code into a new java application or a file called 'Main.java'
//
// Compile and run in Unix using:
// # javac Main.java 
// # java Main 
//