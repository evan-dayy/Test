public class Dog{

	public int WeightPounds; 

	public Dog(int w){
		WeightPounds = w;
	} /* constructor, to instanciate a class  */

	public /* static */ void makenoise(){

		if(WeightPounds<10) {
			System.out.println("yif");
		} else if (WeightPounds < 30) {
			System.out.println("bark");
		} else {
			System.out.println("Woof");
		}

	}

	/* public static Dog maxDog(Dog d1, Dog d2) { // this is static method, we use parameter from Dog class
		if (d1.WeightPounds > d2.WeightPounds) {
			return d1;
		} 
		return d2;
	} */

	public Dog maxDog(Dog d2){ // this is non static method
		if (this.WeightPounds > d2.WeightPounds) {
			return this;
		}
		return d2;
	}


} 

/** this is a non-static method (instance method), because that is 
my "instance variable" instead of itself, e.g. here 
my instance variable is WeightPounds. */ 