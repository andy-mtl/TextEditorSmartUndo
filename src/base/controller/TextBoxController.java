package base.controller;

import java.util.ArrayList;
import java.util.Random;

import base.model.*;
import base.view.*;

/**
 * 
 * @author andy nguyen
 */

public class TextBoxController implements ControllerInterface {
	
	private TextBoxView textBoxView;
    private GroupContainer groupContainer;
    
    public TextBoxController(TextBoxView tbv, GroupContainer gc) {
    	textBoxView = tbv;
    	groupContainer = gc;
    }
    
	@Override
	public void addNewEdit(int groupIndex) {
		String groupName = String.valueOf(groupIndex);
		
		// generate a random integer, there isn't a counter in editgroup?
        Random rand = new Random();
        int randomEditNumber = rand.nextInt(9999999);
        groupContainer.add(groupName, randomEditNumber);
        
        groupContainer.update();
		
	}
	@Override
	public void addNewGroup() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}
	@Override
	public void undoEdit(int groupIndex, int editIndex) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void undoGroupEdits(int groupIndex) {
		throw new UnsupportedOperationException("Not supported yet."); 
	}
	@Override
	public void deleteRandomEdits(int groupIndex) {
		throw new UnsupportedOperationException("Not supported yet."); 
	}
	@Override
	public void deleteGroup(int groupIndex) {
		throw new UnsupportedOperationException("Not supported yet."); 
	}
	@Override
	public void deleteAllGroups() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}
	@Override
	public void updateView() {
		String text = EditContainer.asText();
		textBoxView.setText(text);
	}

}