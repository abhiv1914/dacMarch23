class Program{
    //short instance into byte, short, int. long, float and double.
    public static void main(String []args){
        Short sh=300;
        Short sh1=new Short(sh);
        byte b=sh1.byteValue(); //modifier is not static of byteValue() thats why we are using instance of short
        short sh2=sh1;
        int i=sh1;
        long l1=sh1;
        float f=sh1;
        double d=sh1;
        System.out.println("Short instance into byte is: "+b);
        System.out.println("Short instance into short is: "+sh2);
        System.out.println("Short instance into int is: "+i);
        System.out.println("Short instance into long is: "+l1);
        System.out.println("Short instance into float is: "+f);
        System.out.println("Short instance into double is: "+d);      
    }
}