public class stack {
   private int maxSize;
   private long[] stackArray;
   private int top;
   
   public stack(int s) {
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
   public void push(long j) {
      stackArray[++top] = j;
   }
   public long pop() {
      return stackArray[top--];
   }
   public long stackTp() {
      return stackArray[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean stackFull() {
      return (top == maxSize - 1);
   }
   public static void main(String[] args) {
      stack theStack = new stack(10); 
      theStack.push(10);
      theStack.push(15);
      theStack.push(20);
      theStack.push(25);
      theStack.push(5);
      
      while (!theStack.isEmpty()) {
         long value = theStack.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}