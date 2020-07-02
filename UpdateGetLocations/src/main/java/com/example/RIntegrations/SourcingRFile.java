package com.example.RIntegrations;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;
import org.rosuda.REngine.Rserve.RSession;
 
public class SourcingRFile {
 
    public static void main(String[] args) throws RserveException,
            REXPMismatchException {
        RConnection c = new RConnection();
        

REXP a=c.eval("png(\"Hello.png\")");
c.voidEval("plot(2,3)");
c.voidEval("dev.off()");

    }
}