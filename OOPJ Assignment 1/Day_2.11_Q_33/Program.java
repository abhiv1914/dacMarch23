import java.util.Scanner;
class Program{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int i=Integer.parseInt(args[0]);
    float f=Float.parseFloat(args [1]);
    double d=Double.parseDouble(args [2]);
    System.out.println("Enter:\nA for addition \nS for Subtaction \nM for multiplication \nD for Division:");
    String s=sc.nextLine();
    switch(s)
    {
        case "A":System.out.println("Addition is:"+(i+f+d));
                 break;  
        case "S":System.out.println("Subtraction is:"+(i-f-d));
                 break;
        case "M":System.out.println("Multiplication is:"+(i*f*d));
                 break;
        case "D":System.out.println("Division is:"+((i/f)/d));
                 break;
        default :System.out.println("Invalid Choice");
    }
  }
}