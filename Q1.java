//*******************************************************************
// Dear CompileJava users,
//
// CompileJava has been operating since 2013 completely free. If you
// find this site useful, or would otherwise like to contribute, then
// please consider a donation (link in 'More Info' tab) to support
// development of the new CompileJava website (stay tuned!).
//
// Most sincerely, Z.
//*******************************************************************

import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        int a[] = {2,9,1,5,3,-2};
        int b[] = {9,1,2,3,-4,5};
        System.out.println(sumOfTwo(a,b,5));
    }
    
    public static boolean sumOfTwo(int a[],int b[],int c){
        if(a == null || b == null) return false;
        if(a.length == 0 || b.length == 0) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        int j= b.length-1;
        int remine = 0;
        for(int i = 0;i<a.length;i++){
            remine = c - a[i];
            while(b[j]>=remine && j >= 0){
                if(b[j] == remine) return true;
                j--;
            }
        }
        return false;
    }
}