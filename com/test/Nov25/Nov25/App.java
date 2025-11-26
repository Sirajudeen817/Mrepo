package com.test.Nov25.Nov25;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        DBConnection conn1=DBConnection.getInstance();
//        System.out.println(conn1.hashCode());
//        DBConnection conn2=DBConnection.getInstance();
//        System.out.println(conn2.hashCode());
    	//Factory pattern 
//    	Shape sf=ShapesFactory.getShape("circle");
//    	sf.draw();
    	
//    	GUIFactory gui=new WinFactory();
//    	Button b=gui.createButton();
//    	CheckBox c=gui.createCheckBox();
//    	b.click();
//    	c.check();
//    	
//    	GUIFactory gui1=new MacFactory();
//    	Button b1=gui1.createButton();
//    	CheckBox c1=gui1.createCheckBox();
//    	b1.click();
//    	c1.check();
//    	
//    	Pizza p=new Pizza.Builder("small").cheese(false).olives(false).build();
//    	System.out.println(p);
    	
    	DrinkMaker tea=new TeaMaker();
    	tea.prepareDrink();
    	
    	DrinkMaker coffee=new CoffeeMaker();
    	coffee
    	.prepareDrink();
    }
}
