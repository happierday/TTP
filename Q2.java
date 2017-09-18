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
public class Q2 {
    public static void main(String args[]) {
        String s = "";
        System.out.println(stringReformatting(s,5));
    }
    
    public static String stringReformatting(String s, int k){
      	if(s == null) return "";
      	if(s.length() == 0) return s;
        String temp = s.replace("-","");
       	if(s.length() < k || k <=0) return temp;
      	int length = temp.length();
      	String result = temp.substring(length-k,length);
      	for(int i = length-k;i>=0;i = i-k){
          	if(i-k <= 0){
            	result = temp.substring(0,i) + "-" + result;
              	return result;
            }else{
            	result = temp.substring(i-k,i) + "-" + result;
            }
        }
      	return result;
    }
}