package assign9.FitBit;

import java.io.*;

import javax.swing.JFrame;
import studio4.PrintStreamPanel;

public class ViewInputStream extends FilterInputStream {

    final private PrintStreamPanel psp;
    final private PrintStream ps;

    public ViewInputStream(InputStream in) {
        super(in);
        JFrame f = new JFrame("ViewInputStream");
		f.setBounds(100,100,225,300);
        psp = new PrintStreamPanel();
		f.getContentPane().add(psp);
		f.setVisible(true);
        ps = psp.getPrintStream(); 
    }

    public int read() {
        // TODO
        // use super.read() to access the next byte from the InputStream
        // also, you can use ps like System.out to print to the new window
    	int inputRead = 0;
    	try{
    		inputRead = super.read();
    		String Hex = Integer.toHexString(inputRead);
    		ps.println(" " +Hex);
    	}
    	catch(Exception e){
    		
    	}
    	return inputRead;
    }
}
