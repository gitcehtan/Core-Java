public class BubbleSort {
        public static void main(String[] args) {
            int [] arr = {80,40,30,50,70,60,10,20,100,90};

            // Bubble Sort Alogrithm

            for(int i  = 0; i < arr.length; i++ ){
                int temp;
                // i number of elements already reached to last position so leave i elements

                int flag = 0; // If array i sorted and rounds are still going on

                for(int j = 0; j < arr.length - 1 - i; j++ ){

                    if(arr[j] > arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flag = 1;
                    }
                }
                
                if(flag == 0){
                    break;
                }
                System.out.println("Array After The Round Number: "+(int)(i+1));
                PrintRound(arr);

            }
        }
    
        public static void PrintRound(int [] arr){
            
            for(int i =0; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }

            System.out.println("\n");
            // System.out.println("\n");
        }
}
