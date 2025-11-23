package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Water  extends Food{


		public Water() {
			if(new Random().nextBoolean()) {
				this.item = "water1.jpeg";
			}
			else {
				this.item = "water2.jpeg";
			}
		}

		@Override
		public JLabel getFood() {
			// TODO Auto-generated method stub
			return new JLabel(loadImage(this.item));
		}
	

}
