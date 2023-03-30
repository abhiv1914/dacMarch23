class Program{
    public static void main(String []args){
        Double n1=new Double(123.434);
        Double n2=new Double(213.456);
        double max=(n1>n2)?n1:n2;
        double min=(n1>n2)?n2:n1;
        System.out.println("Maximum is: "+max+" Minimum is: "+min);
        double sum=n1+n2;
        System.out.println("Sum is: "+sum);
    }
}