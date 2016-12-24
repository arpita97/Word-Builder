/**
 * Word Builder Game
 * Team - Apeksha Gothawal, Sunaina Punyani, Arpita Karkera, Kiranmayi Gandikota
 * Sem III S.Y. Btech. Computer Engineering VJTI
 * @author Apeksha Gothawal
 * @date 2 November, 2016.
 * */
package view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Devs extends JFrame{

	public Devs()
	{
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrTheDevelopers = new JTextArea();
		txtrTheDevelopers.setOpaque(false);
		txtrTheDevelopers.setEditable(false);
		txtrTheDevelopers.setText("Developed by Arpita Karkera, Kiranmayi Gandikota, Sunaina Punyani, Apeksha Gothawal");
		txtrTheDevelopers.setBounds(0, 0, 980, 462);
		frame.getContentPane().add(txtrTheDevelopers);
	}
}
