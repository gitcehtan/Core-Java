/**
 * AnonyArrays
 */
public class AnonyArrays {

    public static void main(String[] args) {
        
        AnonyArrays.sum(new int[]{10,20,30});

    }

    static void sum(int [] no){
        int total = 0;

        for(int i : no){
            total += i;
        }
       
        System.out.println("Sum of Anonymous Array: "+total);
    }
}