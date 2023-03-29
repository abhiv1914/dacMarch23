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
}