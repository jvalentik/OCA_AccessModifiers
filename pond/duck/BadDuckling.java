//access modifiers practice
package pond.duck;

public class BadDuckling {
	public static void main(String[] args) {
		System.out.println("BadDuckling");
		FatherDuck duck = new FatherDuck();
		duck.makeNoise(); //private acces does not compile
	}
	
}