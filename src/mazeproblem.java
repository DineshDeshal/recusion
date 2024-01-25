public class mazeproblem {
    public static void main(String[] args) {
        int ans = check(0,0,3,3);
        System.out.println(ans);

    }

    public static int check(int i,int j,int m,int n) {
        if(i==m || j==n){
            return 0;
        }
        if(i == m-1 || j==n-1){
            return 1;
        }
        int right = check(i,j+1,m,n);
        int down = check(i+1,j,m,n);
        return right+down;
    }
}
