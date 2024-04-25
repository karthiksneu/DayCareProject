package ood.finalproject.daycare.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import ood.finalproject.daycare.controller.ClassRoomController;
import ood.finalproject.daycare.userinterface.MainJFrame;

/**
 * @author karthik
 *
 */
public class MainController {

	private MainJFrame mainjframe;
	private ClassRoomController classController;

	/**
	 * @param mainjframe
	 */
	public MainController(MainJFrame mainjframe) {
		// TODO Auto-generated constructor stub
        this.mainjframe = mainjframe;
        initialize();
	}

	/**
	 * 
	 */
	private void initialize() {
		// TODO Auto-generated method stub
		this.mainjframe.getAdminBtn().addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	        	mainjframe.classRoomJPanel();
	           classController = ClassRoomController.getInstance(mainjframe.getClassRoomJPanel());
	           ClassRoomController.getInstance(mainjframe.getClassRoomJPanel()).setTableRecords();
	           
	           
	      }});
	}

}
