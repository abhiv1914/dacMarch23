class Program{
    //double instance into byte, short, int. long, float and double.
    public static void main(String []args){
        double d=123.34;
        Double d1=new Double(d);
        byte b=d1.byteValue(); //modifier is not static of byteValue() thats why we are using instance of double
        short sh=d1.shortValue();
        int i=d1.intValue();
        long l=d1.longValue();
        float f=d1.floatValue();
        double d2=d1;
        System.out.println("Short instance into byte is: "+b);
        System.out.println("Short instance into short is: "+sh);
        System.out.println("Short instance into int is: "+i);
        System.out.println("Short instance into long is: "+l);
        System.out.println("Short instance into float is: "+f);
        System.out.println("Short instance into double is: "+d2);      
    }
}