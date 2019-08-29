import java.util.*;
public class PalindromeLab_BB {
   public static void main (String [] args){
      String s1=null;
      System.out.println (reverse(s1));//null
      System.out.println (reverse(""));// empty string
      System.out.println (reverse("a"));//a
      System.out.println (reverse("abc"));//cba
      System.out.println (reverse("atoyota"));// atoyota
      System.out.println (reverse("atOyotA"));//AtoyOta
      System.out.println (reverse("dad"));//dad
      System.out.println (reverse("Dad"));// daD
      System.out.println (reverse("DaD"));// DaD
      //
      System.out.println ("\n");
      //
      System.out.println (isPalindrome(s1));//f
      System.out.println (isPalindrome(""));//f
      System.out.println (isPalindrome("a"));//true
      System.out.println (isPalindrome("abc"));//f
      System.out.println (isPalindrome("atoyota"));//true
      System.out.println (isPalindrome("atOyotA"));// true   
      System.out.println (isPalindrome("dad"));//true
      System.out.println (isPalindrome("Dad"));// true
      System.out.println (isPalindrome("DaD"));// true
      System.out.println (isPalindrome("Daddy"));//f
      System.out.println (isPalindrome("Ma am"));//true
   //
      System.out.println ("\n");
      // null
      System.out.println (null +" -> "+changeToPalindrome(null));
   // blank string
      System.out.println ("  -> "+changeToPalindrome(""));
      //
      System.out.println ("balk -> "+changeToPalindrome("balk"));// balk -> baab
      System.out.println ("street -> "+changeToPalindrome("street"));//street -> strrts
   
      System.out.println ("oh -> "+changeToPalindrome("oh"));//  oh -> oo
   
      System.out.println ("gall -> "+changeToPalindrome("gall"));//gall -> gaag
      System.out.println ("pa -> "+changeToPalindrome("pa"));// pa -> pp
      // 
      System.out.println ("pit -> "+changeToPalindrome("pit"));// pit -> pip
      System.out.println ("a -> "+changeToPalindrome("a"));//a -> a
      System.out.println ("oh my -> "+changeToPalindrome("oh my"));// oh my -> oh ho
      System.out.println ("break -> "+changeToPalindrome("break"));//break -> brerb
      System.out.println ("oha -> "+changeToPalindrome("oha"));// oha -> oho
      //
      System.out.println ("\n");
      //
      String [] array={"street", null, "break", "oha", "", "pit", null,"atOyotA"};// changeArrayToPalindrome(String [] arr);
      //here you will need to test changeArrayToPalindrome(array) method
      // output:
      //[street, null, break, oha, , pit, null, atOyotA]
      //[strrts, null, brerb, oho, , pip, null, atOyOta]  
           
   }
   public static String reverse (String str){
       if(str==null) return null;
       if(str.length()<=1) return str;
       String out="";
       for(int i=str.length()-1;i>=0;i--)
           out+=str.charAt(i);
       return str;

   }
   public static boolean isPalindrome (String str){
       return false;
   }
   
   public static String changeToPalindrome (String str){
       return "";
   }
   public static String [] changeArrayToPalindrome(String [] arr){
       return new String[] {""};
   }
}
