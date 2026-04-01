import java.util.Scanner;
public class conditional_states{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        String name=sc.nextLine();
        System.out.print("Enter age:");
        int age=sc.nextInt();
        if(age<18){ 
            System.out.println(name+" is Minor");
            System.out.println("Try after "+(18-age)+" Years");
        }
        else if(age>=60){
            System.out.println(name+" is Senior citizen");
            System.out.println("Entered");
        }else{
            System.out.println(name+" Major");
            System.out.println("Entered");
        }
        sc.close();
    }
}