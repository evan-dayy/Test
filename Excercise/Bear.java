public class Bear {
	public int num = 0;
	public int myNum;
	public String name;

	public Bear (int n, String str) {
		num += 1;
		myNum = n;
		name = str;
	}

	public void printNum() {
		System.out.println(myNum);
	}

	public void printInfo(String str) {
		System.out.println("Function Overlapping" + str);
	}

	public void printInfo(int d){
		System.out.println("here is the number" + d);
	}

// also can adding here;

		//Bear bear1 = new Bear(4, "Oski");
		//Bear bear2 = new Bear(2, "Clark");
	// cannot be outside, because non-static cannot be referenced from a static context.


	public static void Track(){

		Bear bear1 = new Bear(4, "Oski");
		Bear bear2 = new Bear(2, "Clark");
		System.out.println(bear2.num);
		System.out.println(bear2.myNum);
		bear2.num -= 1;
		System.out.println(bear2.num);
		System.out.println(bear2.myNum);
		bear1.num -= 1;
		System.out.println(bear1.num);
		System.out.println(bear1.myNum);	
		bear1.printInfo(2);
		bear2.printInfo("apple"); 
	}
	public static void main(String[] args){

		Track();
	}
}



/* Error: Main method is not static in class Bear, please define the main method as:
   public static void main(String[] args) */