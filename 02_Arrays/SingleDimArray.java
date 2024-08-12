
class SingleDimArray{
    public static void main(String[] args) {
        int [] a = new int[3];
        a[0] = 10;
        a[1] = 10;
        
        for(int i : a){
            System.out.println("A[i]: "+i);
        }
        
        int [] nums2 = new int[]{10,20,30,40};
        
        System.out.println("Value of 2nd Array Elements are as Follows: ");
        for(int i : nums2){
            System.out.println("A[i]: "+i);
        }

 
    }
}