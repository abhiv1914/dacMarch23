class Program{
    public static void main(String []args){
        Long n1=new Long(123546L);
        Long n2=new Long(213458L);
        long max=(n1>n2)?n1:n2;
        long min=(n1>n2)?n2:n1;
        System.out.println("Maximum is: "+max+" Minimum is: "+min);
        long sum=n1+n2;
        System.out.println("Sum is: "+sum);
    }
}