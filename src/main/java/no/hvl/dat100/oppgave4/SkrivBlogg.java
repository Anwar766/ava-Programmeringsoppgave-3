package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import no.hvl.dat100.oppgave3.*;
import java.io.File;
public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		PrintWriter writer = null;
		
		try {
			
			File fil = new File(mappe + "/" + filnavn);
			writer = new PrintWriter(fil);
			
			
			writer.print(samling.toString());
			return true;
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}finally {
			
			if(writer !=null) {
				writer.close();
			}
	   }
    }
 }
