public class pra12 {
    public static void main(String[] args) {
        for(String str: args) {
           
float argument = Float.parseFloat(str);

          float r=argument*100;
          System.out.println(argument+" pounds ="+r+" rupees");
          
          }
    
        }
}
