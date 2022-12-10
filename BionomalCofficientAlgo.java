public class BionomalCofficientAlgo
{
    /* function that consider last element as pivot,  
place the pivot at its exact position, and place  
smaller elements to left of pivot and greater  
elements to right of pivot.  */
    static int BionomalCofficientAlgo(int n, int k)
    {
        int [] Coefficients = new int [k+1];
        Coefficients[0]=1;
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(i,k) ; j >= 1; j--) {
                Coefficients[j]+=Coefficients[j-1];
            }
        }

        return Coefficients[k];
    }

    /* function to implement quick sort */


    /* function to print an array */

    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println("Value of C(" + n +", " + k +") is " + BionomalCofficientAlgo(n, k));

    }
}