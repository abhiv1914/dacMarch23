class Program{
    //long value into String
    public static void main(String []args){
        long l=10000L;
        String str=Long.toString(l);
        System.out.println("Long value into string: "+str);
    }
    //long value into long instance.
    public static void main2(String []args){
        long l=20000L;
        Long l1=new Long(l);
        System.out.println("long value into long instance: "+l1);
    }
    //String instance into long instance.
     public static void main3(String []args){
        String str=new String("123456789");
        Long l2=new Long(str);
        System.out.println("String instance into long instance: "+l2);
    }
     //long value into binary, octal and hexadecimal string.
     public static void main4(String []args){
        long l=132456L;
        String binary=Long.toBinaryString(l);
        String octal=Long.toOctalString(l);
        String hexa=Long.toHexString(l);
        System.out.println("long to binary: "+binary);
        System.out.println("long to octal: "+octal);
        System.out.println("long to hexa: "+hexa);
    }
}