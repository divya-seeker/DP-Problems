import java.util.*;

class dyn1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        // System.out.println("Enter the size of weight and cost array : ");
        int n=4;
        int wt[]=new int[]{1,3,4,6};
        int val[]=new int[]{20,30,10,50};
        // for(int i=0;i<n;i++){
        //     System.out.println("Enter the "+i+" weight");
        //     wt[i]=sc.nextInt();
        //     System.out.println("Enter the "+i+" value");
        //     val[i]=sc.nextInt();
        // }
        // // System.out.println("Enter the capacity of knapsack");
        int w=10;
        int res=knapsack(w,n,wt,val);
        System.out.println(res);
    }
    
    static int knapsack(int w,int n,int wt[],int val[]){
        int t[][]=new int[n+1][w+1];
        //Choice Diagram
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
                else if(wt[i-1]<=j){
                     t[i][j]=Math.max(t[i-1][j],t[i-1][j-wt[i-1]]+val[i-1]);
                }
                else{
                     t[i][j]=t[i-1][j];
                }
                System.out.print(t[i][j]+" ");
            } System.out.println();
        }
        

        return t[n][w];
    }
}
