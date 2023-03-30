//to find value and codepoint
class Program5{
    public static void main(String []args){
    String str=args[0];
    char ch=str.charAt(0);
    int codepoint=str.codePointAt(0);
    if(Character.isDigit(ch)){
        System.out.println("Value is: "+ch+" Codepoint is:"+codepoint);    
    }
    if(Character.isLetter(ch)){
        if(Character.isLowerCase(ch))
        {
            char ch1=Character.toUpperCase(ch);
            int codepoint1=(int)ch1;
            System.out.println("Value is: "+ch1+" Codepoint is:"+codepoint1);    
        }
        else if(Character.isUpperCase(ch))
        {
            char ch2=Character.toLowerCase(ch);
            int codepoint2=(int)ch2;
            System.out.println("Value is: "+ch2+" Codepoint is:"+codepoint2);    
        }
     }
   }
}