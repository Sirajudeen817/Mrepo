package com.test.Nov25.Nov25;

public class MacFactory implements GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public CheckBox createCheckBox() {
		// TODO Auto-generated method stub
		return new MacCheckBox();
	}

}
