import java.util.*;
import java.util.Scanner;

// recursive only give TLE in ques having large input


class LongestCommonSubsequence {

 static int lcs(String x,String y,int n,int m){
        //Base condition
// if length of any string is 0 then length of lcs is 0;
        if(n==0|| m==0)return 0;

        // choice diagram
        if(x.charAt(n-1)==y.charAt(m-1))
        return 1+lcs(x,y,n-1,m-1);
        else{
            return Math.max(lcs(x,y,n,m-1),lcs(x,y,n-1,m));
        }
}



     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Strings");
        String x=sc.nextLine();
        String y=sc.nextLine();
        int n=x.length();
        int m=y.length();
        int ans= lcs(x,y,n,m);
        System.out.println(ans);
    }
}