/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adb.wifi.connector;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author omar
 */
public class AdbWifiConnector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
      String x=  JOptionPane.showInputDialog("the ip:");
     File excuter = new File("connectadb.bat");
        PrintWriter out = new PrintWriter(excuter);
        out.append("adb connect "+x);
        out.flush();
        out.close();
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + excuter.getAbsolutePath());
        System.out.println(excuter.getAbsoluteFile());
    }
    
}
