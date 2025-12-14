package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Orange extends Food{
	


			public Orange() {
				if(new Random().nextBoolean()) {
					this.item = "Orange1.jpg";
				}
				else {
					this.item = "orange2.jpg";
				}
			}

			@Override
			public JLabel getFood() {
				// TODO Auto-generated method stub
				return new JLabel(loadImage(this.item));
			}
		

	}

