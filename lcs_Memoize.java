import java.util.*;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;


public class lcs_Memoize {

static int findlcs(String x,String y,int n,int m,int[][] t){
    // Base condition 
    if(n==0 || m==0)return 0;
    if(t[n][m]!=-1)return t[n][m];

    if(x.charAt(n-1)==y.charAt(m-1)){
        return t[n][m] =1+findlcs(x, y, n-1, m-1, t);
    }
    else{
        return Math.max(findlcs(x, y, n, m-1, t), findlcs(x, y, n-1, m, t));
    }
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Strings:-");
        String x=sc.nextLine();
        String y=sc.nextLine();
        int n=x.length();
        int m=y.length();
        int[][] t=new int[n+1][m+1];
        for(int[] row : t){
            Arrays.fill(row,-1);
        }
        int ans= findlcs(x,y,n,m,t);
        System.out.println(ans);
    }
}
