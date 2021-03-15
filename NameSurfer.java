import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class NameSurfer extends ConsoleProgram {

	 private static final double BOX_WIDTH = 120;
	 private static final double BOX_HEIGHT = 50;
	
	

	public void init() {
	// label is for writing the name inside the box or the board
	 nameLabel = new JLabel("Name:");
		add(nameLabel,NORTH);
		
	
		nameField = new JTextField(30);
	    add(nameField, NORTH);
//	nameField.addActionListener(this);
	
	        addButton = new JButton("add");
	         add(addButton, NORTH);
	         
	      removeButton = new JButton("Remove");
	      add(removeButton, NORTH);
	        
	        
	         clearButton = new JButton("Clear")	;
	          add(clearButton, NORTH);
	     //  	addActionListeners();
		addActionListeners();
}

	
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addButton) {
			
			println("Add: "+ nameField.getText() );
		}
	
		else if(e.getSource() == nameField) {
			println("Add: "+ nameField.getText());
			
	
		}
		
		else if(e.getSource() == clearButton){
			println("clear:" + nameField.getText());
		}
	
	}

	
	
	
	

	    private JLabel nameLabel;
		private JTextField nameField;
		private JButton addButton;
		private JButton clearButton;
		
		private JButton removeButton;

	
	
	
	
}

