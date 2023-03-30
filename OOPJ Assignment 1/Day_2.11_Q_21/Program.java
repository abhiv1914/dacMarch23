class Program{
    //long instance into byte, short, int. long, float and double.
    public static void main(String []args){
        long l=30000L;
        Long l1=new Long(l);
        byte b=l1.byteValue(); //modifier is not static of byteValue() thats why we are using instance of long
        short sh=l1.shortValue();
        int i=l1.intValue();
        long l2=l1;
        float f=l1;
        double d=l1;
        System.out.println("Short instance into byte is: "+b);
        System.out.println("Short instance into short is: "+sh);
        System.out.println("Short instance into int is: "+i);
        System.out.println("Short instance into long is: "+l2);
        System.out.println("Short instance into float is: "+f);
        System.out.println("Short instance into double is: "+d);      
    }
}