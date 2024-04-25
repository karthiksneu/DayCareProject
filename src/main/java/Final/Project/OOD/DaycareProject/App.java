package Final.Project.OOD.DaycareProject;

import Final.Project.OOD.DaycareProject.userinterface.LoginJFrame;

/**
 * @author karthik
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //System.out.println( "Hello World!" );
    	java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
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
