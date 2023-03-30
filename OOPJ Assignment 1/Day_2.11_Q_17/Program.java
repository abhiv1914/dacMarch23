class Program{
    //int instance into byte, short, int. long, float and double.
    public static void main(String []args){
        int i=3000;
        Integer i1=new Integer(i);
        byte b=i1.byteValue(); //modifier is not static of byteValue() thats why we are using instance of int
        short sh=i1.shortValue();
        int i2=i1;
        long l1=i1;
        float f=i1;
        double d=i1;
        System.out.println("Short instance into byte is: "+b);
        System.out.println("Short instance into short is: "+sh);
        System.out.println("Short instance into int is: "+i2);
        System.out.println("Short instance into long is: "+l1);
        System.out.println("Short instance into float is: "+f);
        System.out.println("Short instance into double is: "+d);      
    }
}