package com.example.RIntegrations;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class PlotGraphDemo {
	
	private static RConnection getLocalRconnection() {
	     try {
	         return new RConnection();
	     } catch (Exception e) {
	         //If we get this kind of error, it may be because Rserve is not running
	         if (e.getMessage().equals("Cannot connect: Connection refused")) {
	             try {
	            	 String[] rserveStartCommand =new String[]{"R", "-e library(Rserve)", "-e Rserve()" };
	            	 Runtime runTime = Runtime.getRuntime();
	            	 Process process = runTime.exec(rserveStartCommand);
	     			
           		    int exitValue = process.waitFor(); 
	                 //int exitValue = Runtime.getRuntime().exec(rserveStartCommand).waitFor();
	                 //if it returned success, try connecting again
	                 if (exitValue == 0)
	                     return new RConnection();
	                 //otherwise, Rserve is probably not installed
	                 else
	                     System.err.println("Could not start Rserve - is it installed properly? Shell command \""+"??"+"\" exited with exit value "+exitValue+".");
	             } catch (Exception e1) {
	                 e1.printStackTrace();
	             }
	         }
	         else
	             e.printStackTrace();
	     }
	     return null;
	 }

	public static void main(String[] args) throws RserveException,
			REXPMismatchException {
		long startTime = System.currentTimeMillis();
		RConnection c = null;
		JSONArray jaValues = new JSONArray();
		JSONObject joValue = null;
		try {
			c = new RConnection();
			//c=getLocalRconnection();
			c.eval("library(ggplot2)");
			c.eval("library(dplyr)");
			String strcsvFilePath="/mnt/appedo/resource/summaryreport/percentile/801/lt_reportdata_365.csv";
					//.eval("NRT <- read.csv(\"/home/prakash/Downloads/R_percentile_Csv/CMBN_RUNU_Jun15_250Usr_20mins_Run1.csv\")");
		
			REXP rExp = c.eval("NRT <- read.csv(\""+strcsvFilePath+"\")");
			c.eval("NRT <- mutate(NRT, stime = starttime,etime = endtime)");

			c.eval("NRT <- mutate(NRT, rdiff = round((etime-stime)*1000))");

			c.eval("scui <- arrange(NRT, script_id, container_name, userid, iteration_id)");

			c.eval("scui <- group_by(scui, script_id, container_name, userid, iteration_id)");

			c.eval("scui_mmdiff <- summarize(scui, count = n(), avgdiff = mean(diff), mst = min(stime), met = max(etime), mmdiff = round((met-mst)*1000))");

			REXP container_names = c.eval("script_containers <- distinct(select(arrange(NRT, script_id, container_id), script_id, container_name))");

			RList rlst=container_names.asList();
			String script_id=rlst.at("script_id").asString();
			
			/*String[] script_ids = new String[rlst.at("script_id").asStrings().length];
			script_ids=rlst.at("script_id").asStrings();
			for(int i=0;i<script_ids.length;i++){
				System.out.println("container_names at "+i+" :"+script_ids[i]);
			}
			
			String[] container_name = new String[rlst.at("container_name").asStrings().length];
			container_name=rlst.at("container_name").asStrings();
			for(int i=0;i<container_name.length;i++){
				System.out.println("container_names at "+i+" :"+container_name[i]);
			}*/
				
		System.out.println("<===================================================================>");	
		
			String[] allContainer_names = new String[rlst.at("container_name").asStrings().length];
			allContainer_names=rlst.at("container_name").asStrings();
			for(int i=0;i<allContainer_names.length;i++){

			c.eval("scuimm_sc <- filter(scui_mmdiff, script_id == "+script_id+", container_name == \""+allContainer_names[i]+"\")");
			
			c.eval("p = ggplot(data=scuimm_sc, aes(scuimm_sc$mmdiff)) +geom_histogram(binwidth=round(quantile(scuimm_sc$mmdiff, .99)/100),"
					+ "col=\"steel blue\", fill=\"dark blue\") + xlim(quantile(scuimm_sc$mmdiff, .25),"
					+ "quantile(scuimm_sc$mmdiff, .99))");
			
			REXP median50InMs = c.eval("ab <- round(median(scuimm_sc$mmdiff),2)");
			
			REXP max95InMs  = c.eval("cd <- round(quantile(scuimm_sc$mmdiff, .95),2)");
			REXP max98InMs  = c.eval("ef <- round(quantile(scuimm_sc$mmdiff, .98),2)");
			REXP maxInMs = c.eval("gh <- max(round(max(scuimm_sc$mmdiff),2))");
			
			joValue = new JSONObject();
			joValue.put("containerName", allContainer_names[i]);
			joValue.put("median50InMs", median50InMs.asDouble());
			joValue.put("max95InMs", max95InMs.asDouble());
			joValue.put("max98InMs", max98InMs.asDouble());
			joValue.put("maxInMs", maxInMs.asDouble());
			
			jaValues.add(joValue);
		}
		System.out.println("jaValues "+jaValues);
		System.out.println("<===================================================================>");
		
			/*System.out.println(rExp.asNativeJavaObject());
			System.out.println(rExp.asDouble());
			System.out.println(rExp.asString());
			System.out.println(rExp.isComplex());
			System.out.println(rExp.isEnvironment());
			System.out.println(rExp.isExpression());
			System.out.println(rExp.isFactor());
			System.out.println(rExp.isInteger());
			System.out.println(rExp.isLanguage());
			System.out.println(rExp.isList());
			System.out.println(rExp.isLogical());
			System.out.println(rExp.isNull());
			System.out.println(rExp.isNumeric());
			System.out.println(rExp.isPairList());
			System.out.println(rExp.isReference());*/
			
/*			
			c.eval("plabel <- paste(\"In msec - \","
					+ "\", Median50%:\", round(median(scuimm_sc$mmdiff),2),"
					+ "\", 95%:\", round(quantile(scuimm_sc$mmdiff, .95),2),"
					+ "\", 98%:\",round(quantile(scuimm_sc$mmdiff, .98),2),"
					+ "\", Max:\", max(round(max(scuimm_sc$mmdiff),2)))");

			c.eval("p = p + labs(x = plabel) +labs(y = \"Count\") + labs(title = \"Scenario 3 - Property Page_RU\")");

			c.eval("p = p + geom_vline(xintercept = quantile(scuimm_sc$mmdiff, .5), col=\"dark green\")");
			c.eval("p = p + geom_vline(xintercept = quantile(scuimm_sc$mmdiff, .95), col=\"dark orange\")");
			c.eval("p = p + geom_vline(xintercept = quantile(scuimm_sc$mmdiff, .98), col=\"dark red\")");

			c.eval("png(\"/home/prakash/Rserve/myplot001.png\")");
			c.eval("print(p)");
			c.voidEval("dev.off()");
*/
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (c != null) {
				try {
					c.close();
				} finally {
				}
			}
		}

		System.out.println((System.currentTimeMillis() - startTime) + "ms");
	}
}