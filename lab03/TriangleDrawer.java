public class TriangleDrawer{
	public static void drawTriangle(){
		int row = 1;
		int size = 10; // args
		int col = 1;
		while(row <= size){
			while(row > col){
				System.out.print("*");
				col = col+1;
			}
			System.out.println("*");
			row = row +1;
			col = 1;
		}
	}

	public static void main(String[] args){
		drawTriangle();
	}
}
