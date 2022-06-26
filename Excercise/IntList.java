public class IntList {
   
   private int value;
   private IntList next;
   
   public IntList(int val, IntList next) {
      this.value = val;
      this.next = next;      
   }
   
   public static void main(String[] args) {
      IntList l = new IntList(1, new IntList(
         2, new IntList (3, null)));

      for(int i = 1; )
         
      
   }
}