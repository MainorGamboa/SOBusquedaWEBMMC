/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser;
import gui.*;

/**
 *
 * @author marcos
 */
public class WebBrowser {

    static MainWindow mainWindow;
    static StatsWindow statsWindow;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mainWindow = new MainWindow();
        mainWindow.setVisible(true);
        statsWindow = new StatsWindow();
        statsWindow.setVisible(true);       
        
        mainWindow.setResultText("GOOGLE", "www.google.com", "Buscador mas popular en el mundo");
        mainWindow.addResultText("FACEBOOK", "www.facebook.com", "Red social mas popular en el mundo");
        
    }
                    
    
}
