class Program{
    //double value into String
    public static void main1(String []args){
        double d=10000.12;
        String str=Double.toString(d);
        System.out.println("Double value into string: "+str);
    }
    //double value into double instance.
    public static void main2(String []args){
        double d=20000.234;
        Double d1=new Double(d);
        System.out.println("Double value into Double instance: "+d1);
    }
    //String instance into Double instance.
     public static void main3(String []args){
        String str=new String("123456789.123123");
        Double d2=new Double(str);
        System.out.println("String instance into double instance: "+d2);
    }
    //double value into binary, octal and hexadecimal string
    public static void main(String []args){
        double d=20000.234;
        long l=Double.doubleToLongBits(d);
        String binary=Long.toBinaryString(l);
        String octal=Long.toOctalString(l);
        String hexa=Long.toHexString(l);
        System.out.println("long to binary: "+binary);
        System.out.println("long to octal: "+octal);
        System.out.println("long to hexa: "+hexa);
   }      
}