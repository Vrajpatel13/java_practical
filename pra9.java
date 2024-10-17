public class pra9 {
    public static void main(String[] args) {
        
        String str = "Hello";
        doublechar(str);
    }   
    
    static void doublechar(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            result.append(s.charAt(i));
        }
        System.out.println(result.toString());
    }
}
