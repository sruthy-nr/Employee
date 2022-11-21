import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int c;
        Scanner sc=new Scanner(System.in);
//        ArrayList<Employee> ar=new ArrayList<>();
        Integer[] emp_code=new Integer[5];
        String[] name=new String[5];
        String[] designation=new String[5];
        String[] company=new String[5];
        String[] phone=new String[5];
        String[] email=new String[5];
        String[] salary=new String[5];
        do {
            System.out.println("MENU\n1.ADD EMPLOYEE\n2.EMPLOYEE LIST\n3.SEARCH EMPLOYEE\n4.DELETE EMPLOYEE\n5.EXIT");
            System.out.println("ENTER YOUR CHOICE:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    for(int a=0;a<5;a++){
                        System.out.println("ENTER THE EMPLOYEE DETAILS");
                        System.out.println("EMPLOYEE CODE:");
                        emp_code[a]=sc.nextInt();
                        System.out.println("EMPLOYEE NAME:");
                        name[a]=sc.next();
                        System.out.println("DESIGNATION:");
                        designation[a]=sc.next();
                        System.out.println("SALARY:");
                        salary[a]=sc.next();
                        System.out.println("COMPANY NAME:");
                        company[a]=sc.next();
                        System.out.println("PHONE NUMBER:");
                        phone[a]=sc.next();
                        System.out.println("EMAIL:");
                        email[a]=sc.next();
                    }
                    break;
                default:
                    System.out.println("Invalid choice...Enter a valid choice.");
                    break;
            }
        }while(c!=5);
    }
}