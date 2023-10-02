

public class reverse_strB {
    public static void main(String[] args) {
        
    
    StringBuilder jsb= new StringBuilder("hemamalini");
    String s= new String("hello");
    for(int i=0; i<jsb.length()/2;i++){
        int front=i;
        int back= jsb.length()-1-i;
      

        char frontChar = jsb.charAt(front);
        char backChar = jsb.charAt(back);
 
 
        jsb.setCharAt(front, backChar);
        jsb.setCharAt(back, frontChar);
 
    }
    System.out.println(jsb);
    }
}
