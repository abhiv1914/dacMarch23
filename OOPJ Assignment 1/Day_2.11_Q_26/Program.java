class Program{
    public static void main(String []args){
        Float n1=new Float(123.434f);
        Float n2=new Float(213.456f);
        float max=(n1>n2)?n1:n2;
        float min=(n1>n2)?n2:n1;
        System.out.println("Maximum is: "+max+" Minimum is: "+min);
        float sum=n1+n2;
        System.out.println("Sum is: "+sum);
    }
}