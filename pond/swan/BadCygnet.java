//default access
package pond.swan;

import pond.duck.MotherDuck;

public class BadCygnet {
	public static void main(String[] params) {
		MotherDuck duck = new MotherDuck();
		duck.makeNoise(); // does not compile - default access		
	}
}