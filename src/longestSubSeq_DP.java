public class longestSubSeq_DP
{

    //DP problem when 2 arrays/strings given n asked to find longest increasing subsequence
//Create a 2D array of size m+1 n+1 store 0 in 0col, row
//if a[i-1]==b[j-1] diagonal element +1 and keep track of length of the selement

    public int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[][] array = new int[m+1][n+1];
        int max =0;
        for(int col=0;col<n+1;col++)
            array[0][col] = 0;
        for(int row=0;row<m+1;row++)
            array[row][0] = 0;

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(A[i-1]==B[j-1]){
                    array[i][j]=array[i-1][j-1]+1;
                    if(max<array[i][j])
                        max = array[i][j];
                }
                else
                    array[i][j]=0;
            }
        }
        return max;
    }
}
