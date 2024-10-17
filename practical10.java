import java.util.*;
class pra10{
   public static void main(String[] args) {
      String s="HelloWorld";
      int n=s.length();
      StringBuffer obj=new StringBuffer(s);
      System.out.println("The length of the string: "+n);
      System.out.println(s.toLowerCase());
      System.out.println(s.toUpperCase());
      System.out.println(obj.reverse());
      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      String sortarr = new String(arr);
      System.out.println(sortarr);

   }  
}
