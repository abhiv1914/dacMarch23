class Program{
    //float instance into byte, short, int. long, float and double.
    public static void main(String []args){
        float f=123.34f;
        Float f1=new Float(f);
        byte b=f1.byteValue(); //modifier is not static of byteValue() thats why we are using instance of float
        short sh=f1.shortValue();
        int i=f1.intValue();
        long l=f1.longValue();
        float f2=f1;
        double d=f1;
        System.out.println("Short instance into byte is: "+b);
        System.out.println("Short instance into short is: "+sh);
        System.out.println("Short instance into int is: "+i);
        System.out.println("Short instance into long is: "+l);
        System.out.println("Short instance into float is: "+f2);
        System.out.println("Short instance into double is: "+d);      
    }
}