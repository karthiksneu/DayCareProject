package ood.finalproject.daycare;

import ood.finalproject.daycare.userinterface.LoginJFrame;

/**
 * @author karthik
 *
 */
public class App {
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				LoginJFrame login = new LoginJFrame();
				login.setPreferredSize(new java.awt.Dimension(1240, 830));
				login.pack();
				login.setVisible(true);
			}
		});
	}
}
