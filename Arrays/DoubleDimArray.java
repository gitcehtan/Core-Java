public class DoubleDimArray {
    public static void main(String[] args) {
        int [][] nums1 = {{10,20,30},{40,50,60}};

        for (int[] i : nums1) {
            for ( int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println(nums1);
        System.out.println(nums1[0]);
        System.out.println(nums1[0][0]);
        System.out.println("nums1 length Row "+nums1.length);
        System.out.println("nums1[0] length Column "+nums1[0].length);
    }
}

/******************** Output ***************************/
/*

                    10 20 30 
                    40 50 60
                    [[I@5e4c8041
                    [I@71c8becc
                    10
                    nums1 length Row 2
                    nums1[0] length Column 3

*/ 