class Program3{
    //byte value into String
    public static void main1(String []args){
        byte b=12;
        String str=Byte.toString(b);
        System.out.println("byte value into string: "+str);
    }
    //byte value into Byte instance.
    public static void main2(String []args){
        byte b=10;
        Byte b1=new Byte(b);
        System.out.println("byte value into Byte instance: "+b1);
    }
    //String instance into Byte instance.
     public static void main(String []args){
        String str=new String("123");
        Byte b2=new Byte(str);
        System.out.println("String instance into Byte instance: "+b2);
    }
}