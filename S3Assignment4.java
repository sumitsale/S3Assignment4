import java.util.Scanner;

public class S3Assignment4
{
	
	private int a,b,c;
	String operation;
	   
   public static void main(String args[])
   { 
	   S3Assignment4 obj = new S3Assignment4();
	   obj.seta();
	   obj.setb();
	   obj.setOperator();
	   
	   System.out.println("Value of a is - " + obj.a);
	   System.out.println("Value of b is - " + obj.b);
	   System.out.println("Value of operation is - " + obj.operation);
	   obj.result();
	   System.out.println("Result is = " + obj.c);
   }
   
   public void seta() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a value of a");
		this.a = in.nextInt();
   }
	
	public void setb() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a value of b");
		this.b = in.nextInt();
   }
   
   public void setOperator() {
	   
	   Scanner in = new Scanner(System.in);

	   System.out.println("Enter a operation");
	   this.operation = in.nextLine();
   }
   
   public void result() {
	  
	  if (this.operation == "+");
        {
           this.c = this.a + this.b;
        }
        if  (operation == "-");
        {
            this.c = this.a - this.b;
        }

        if (operation == "/");
        {
           this.c = this.a / this.b;
        }
        if (operation == "*")
        {
            this.c = this.a * this.b;
        }
   }
	 
}

