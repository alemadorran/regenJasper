package regenjasper;

import java.util.Scanner;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class RegenJasper {

	public static void main(String[] args) {
		
		regenerJasper();

	}
	
	private static void regenerJasper() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique le path .jrxml");
		String jrxmlPath = sc.nextLine();
		
		System.out.println("Indique le path .jasper souhaitee");
		String jasperPath = sc.nextLine();
		
		
        try {
  
            // Compilation du fichier JRXML dans JASPER
            JasperCompileManager.compileReportToFile(jrxmlPath, jasperPath);

            System.out.println("Compilation réussie: " + jasperPath);

        } catch (JRException e) {
            e.printStackTrace();
        }finally {
        	sc.close();
        }
    }

}
