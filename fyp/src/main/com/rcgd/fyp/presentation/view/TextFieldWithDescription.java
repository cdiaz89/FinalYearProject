package main.com.rcgd.fyp.presentation.view;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

/**
 * Adapted from 
 * http://stackoverflow.com/questions/1738966/java-jtextfield-with-input-hint
 * @author rcgd
 *
 */
public class TextFieldWithDescription extends JTextField implements FocusListener {
	
	private String description;
	private boolean descriptionShown;
	
	public TextFieldWithDescription(String description) {
		super(description);
		this.description = description;
		this.descriptionShown = true;
		super.addFocusListener(this);
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		if(this.getText().isEmpty()) {
			this.descriptionShown = false;
			super.setText("");
		}		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(this.getText().isEmpty()) {
			this.descriptionShown = true;
			super.setText(this.description);
		}
	}

	@Override
	public String getText() {
		return descriptionShown ? "" : super.getText();
	}
	
}
