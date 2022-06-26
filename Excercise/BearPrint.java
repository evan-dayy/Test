public class BearPrint{



	public static void Track(){

		Bear bear1 = new Bear(4, "Oski");
		Bear bear2 = new Bear(2, "Clark");

		System.out.println(bear2.myNum);
		bear2.num -= 1;
		System.out.println(bear2.myNum);
		bear2.num -= 1;
		System.out.println(bear2.myNum);	
		bear1.printInfo(2);
		bear2.printInfo("apple"); 
	}


	public static void main(String[] args){

		Track();
		

	}
}