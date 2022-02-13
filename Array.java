public class Array {
   
        private int arr[];
        private int count[];
  
  public Array(int length) {
   arr = new int[length]; 
  }
       public void printArray() {
            
            for (int i = 0; i < arr.length; i++) { //start of for loop
              System.out.println("Caleb in the printArray Method");
              arr[i] = i + 1;
                System.out.println(arr[i]);
            }
       }
}
