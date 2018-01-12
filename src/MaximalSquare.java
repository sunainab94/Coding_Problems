public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)
            return 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] count = new int[n+1][m+1];
        int max = 0;

        for(int i=0;i<m+1;i++){
            count[0][i]=0;
        }
        for(int i=0;i<n+1;i++){
            count[i][0]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //System.out.println(i + "  " + j);
                if(matrix[i-1][j-1]=='0')
                    count[i][j]=0;
                else{
                    int firstmin = Math.min(count[i][j-1], count[i-1][j-1]);

                    int min = Math.min(firstmin, count[i-1][j]);
                    System.out.println(firstmin+" "+min);
                    count[i][j]=min+1;
                    if(max<count[i][j]){
                        max=count[i][j];
                        System.out.println(max+"..");
                    }
                }
            }
        }

        return max*max;
    }
}
