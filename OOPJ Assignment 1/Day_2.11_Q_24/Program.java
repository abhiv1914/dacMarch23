class Program{
    //float value into String
    public static void main1(String []args){
        float f=10000.12f;
        String str=Float.toString(f);
        System.out.println("Float value into string: "+str);
    }
    //float value into float instance.
    public static void main2(String []args){
        float f=20000.234f;
        Float f1=new Float(f);
        System.out.println("Float value into Float instance: "+f1);
    }
    //String instance into Float instance.
     public static void main3(String []args){
        String str=new String("123456789.123123f");
        Float f2=new Float(str);
        System.out.println("String instance into float instance: "+f2);
    }
    //float value into hexadecimal string.
     public static void main(String []args){
        float f=1234.324f;
        String hexa=Float.toHexString(f);
        System.out.println("float to hexa: "+hexa);
    }
}