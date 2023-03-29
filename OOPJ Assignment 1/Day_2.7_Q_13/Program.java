class Program{
    //Short value into String
    public static void main1(String []args){
        short sh=12;
        String str=Short.toString(sh);
        System.out.println("short value into string: "+str);
    }
    //short value into Short instance.
    public static void main2(String []args){
        short sh=10;
        Short sh1=new Short(sh);
        System.out.println("Short value into Short instance: "+sh1);
    }
    //String instance into Short instance.
     public static void main(String []args){
        String str=new String("1234");
        Short sh2=new Short(str);
        System.out.println("String instance into short instance: "+sh2);
    }
}