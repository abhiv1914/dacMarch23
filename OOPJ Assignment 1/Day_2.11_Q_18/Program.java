class Program{
    public static void main(String []args){
        Integer n1=new Integer(12354);
        Integer n2=new Integer(21345);
        int max=(n1>n2)?n1:n2;
        int min=(n1>n2)?n2:n1;
        System.out.println("Maximum is: "+max+" Minimum is: "+min);
        int sum=n1+n2;
        System.out.println("Sum is: "+sum);
    }
}