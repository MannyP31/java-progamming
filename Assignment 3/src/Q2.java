import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int mark;
   System.out.println("Enter the mark of the student");
   mark=sc.nextInt();
   if(mark>=40)
    System.out.println("Congratulations! You have passed");
   else
     System.out.println("Sorry! you have failed the exam");
   
	   
	}

}
