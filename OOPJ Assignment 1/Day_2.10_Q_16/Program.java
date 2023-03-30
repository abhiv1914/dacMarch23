class Program{
    //int value into String
    public static void main(String []args){
        int i=5000;
        String str=Integer.toString(i);
        System.out.println("int value into string: "+str);
    }
    //int value into int instance.
    public static void main2(String []args){
        int i=2000;
        Integer i1=new Integer(i);
        System.out.println("int value into int instance: "+i1);
    }
    //String instance into int instance.
     public static void main3(String []args){
        String str=new String("123456");
        Integer i2=new Integer(str);
        System.out.println("String instance into int instance: "+i2);
    }
    //int value into binary, octal and hexadecimal string.
     public static void main4(String []args){
        int i=132;
        String binary=Integer.toBinaryString(i);
        String octal=Integer.toOctalString(i);
        String hexa=Integer.toHexString(i);
        System.out.println("int to binary: "+binary);
        System.out.println("int to octal: "+octal);
        System.out.println("int to hexa: "+hexa);
    }
}