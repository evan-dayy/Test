public class DogLaucher {
	public static void main(String[] args){
		// Dog smalldog;
		// new Dog(5); /* totalljy useless, garbage */
		// smalldog = new Dog(5);
		// Dog Bigdog = new Dog(51);
		Dog d1 = new Dog(100);
		Dog d2 = new Dog(5);
		Dog bigger = d1.maxDog(d2);
		bigger.makenoise();
		// Dog bigger = Dog.maxDog(d2);
		// bigger.makenoise non-static way 

		// smalldog.makenoise();
		// Bigdog.makenoise();
	}
}