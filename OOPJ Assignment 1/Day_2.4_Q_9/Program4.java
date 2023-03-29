class Program4{
    //Byte instance into byte, short, int. long, float and double.
    public static void main(String []args){
        byte b=12;
        Byte b1=new Byte(b);
        byte b2=b1;
        short sh=b1;
        int i=b1;
        long l1=b1;
        float f=b1;
        double d=b1;
        System.out.println("Byte instance into byte is: "+b2);
        System.out.println("Byte instance into short is: "+sh);
        System.out.println("Byte instance into int is: "+i);
        System.out.println("Byte instance into long is: "+l1);
        System.out.println("Byte instance into float is: "+f);
        System.out.println("Byte instance into double is: "+d);      
    }
}