public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,1,5,1},
                {6,7,8,4,2},
                {8,1,2,2,3},
                {8,5,5,8,4}
        };
        linearSearchIn2D(arr,8);
    }
    public static void linearSearchIn2D(int[][] arr,int target)
    {
        int lastRowPos = -1,lastColPos = -1;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                if(arr[i][j] == target)
                {
                    lastRowPos = i;
                    lastColPos = j;
                }
            }
        }
        if(lastRowPos == -1 && lastColPos == -1)
            System.out.println(lastRowPos +","+ lastColPos);
        else
            System.out.println(lastRowPos+","+lastColPos);
    }
}
