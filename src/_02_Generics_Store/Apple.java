package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Apple extends Food{
	
	public Apple() {
		if(new Random().nextBoolean()) {
			this.item = "apple1.jpg";
		}
		else {
			this.item = "apple2.jpg";
		}
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}


}
