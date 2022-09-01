package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() 
            {
            	Student cristian = new Student(137383,"Silva","Cristian","sivacristian29@gmail.com","https://github.com/CrisD39", "/images/foto2.jpg");
            	SimplePresentationScreen miVentana = new SimplePresentationScreen(cristian);
            	miVentana.setVisible(true);
            }
        });
    }
}