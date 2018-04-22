import java.util.*;
import java.io.*;
import javax.swing.*;
public class DisplayFile{
	public static void main(String[] args){
		JFrame frame = new JFrame("Keith Softwares");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea ta = new JTextArea(20, 30);
		JFileChooser chooser = new JFileChooser();
		
		int status = chooser.showOpenDialog(null);
		
		if(status != JFileChooser.APPROVE_OPTION)
			ta.setText("No file chosen");
		else{
			File file = chooser.getSelectedFile();
			Scanner scan = new Scanner(System.in);
			String info = " ";
			while(scan.hasNext())
				info += scan.nextLine() + "\n";
			ta.setText(info);
		}
		frame.getContentPane().add(ta);
		frame.pack();
		frame.setVisible(true);
			
		//Foundation of program design
		// john lewis and william loftus
		//corinthian colleges, inch
	} 
}