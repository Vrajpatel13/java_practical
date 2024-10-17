public class pra11 {
    public static void main(String[] args) {
        
        String a="CHARUSAT UNIVERSITY";
        System.out.println("The length="+a.length());
        StringBuffer obj=new StringBuffer(a);
        obj.setCharAt( 1, 'D' );
        System.out.println(obj.toString());
        System.out.println(a.toLowerCase());
    }
}
