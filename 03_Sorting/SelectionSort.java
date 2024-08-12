
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {80,40,30,50,70,60,10,20,100,90};

        int temp,min;

        for(int i  = 0; i < arr.length-1; i++){
            min = i;
            for(int j  = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
