
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String meow = JOptionPane.showInputDialog("how many cats do u have?");
		// 2. Convert their answer into an int
		int meowAsInt = Integer.parseInt(meow);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (meowAsInt>3) {
			
			JOptionPane.showMessageDialog(null, "you are a CRaZY Cat Lady");
			
			
			
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
if (meowAsInt<=3 && meowAsInt>0) {
			
	playVideo("https://www.youtube.com/watch?v=Iy6U-Y7A5p8&themeRefresh=1");
		
			
			
		}
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		if (meowAsInt==0) {
			
			
		playVideo("https://www.youtube.com/watch?v=VLVdjLbXdm4");
		}
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

