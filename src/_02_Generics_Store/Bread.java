package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Bread extends Food{
	
	public Bread() {
		if(new Random().nextBoolean()) {
			this.item = "bread1.jpg";
		}
		else {
			this.item = "bread2.jpg";
		}
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}


}
