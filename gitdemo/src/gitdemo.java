import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Dat Van
 *
 */
public class gitdemo extends JFrame {
	public  gitdemo (){
		setLayout(new  FlowLayout());
		for  (int i=0;  i<=20;   i++){
		add  (new  JButton(String.valueOf(i)));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gitdemo  j  =  new gitdemo();
		j.setDefaultCloseOperation(EXIT_ON_CLOSE);
		j.setVisible(true);
		j.setPreferredSize(new Dimension(500,500));
		j.pack();
		j.setLayout(null);
	}

}
