class Program{
    //String value into Boolean instance.
    public static void main(String []args){
        String str="false";
        Boolean b3=new Boolean(str);
        System.out.println("The result is: "+b3);
    }
    //String value into boolean value
    public static void main3(String []args){
        String str="true";
        Boolean b2=Boolean.parseBoolean(str);
        System.out.println("The result is: "+b2);
    }
    //boolean value into Boolean instance.
    public static void main2(String []args){
        boolean b=false;
        Boolean b1=new Boolean(b);
        System.out.println("The result is: "+b1);
    }
    //boolean value into String
    public static void main1(String []args){
        boolean b=true;
        String str=Boolean.toString(b);
        System.out.println("The result is: "+str);
    }
}