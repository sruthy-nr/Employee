import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int c,i=2;
        Scanner sc=new Scanner(System.in);
//        ArrayList<Employee> ar=new ArrayList<>();
        Integer[] emp_code=new Integer[2];
        String[] name=new String[2];
        String[] designation=new String[2];
        String[] company=new String[2];
        String[] phone=new String[2];
        String[] email=new String[2];
        String[] salary=new String[2];
        do {
            System.out.println("MENU\n1.ADD EMPLOYEE\n2.EMPLOYEE LIST\n3.SEARCH EMPLOYEE\n4.DELETE EMPLOYEE\n5.EXIT");
            System.out.println("ENTER YOUR CHOICE:");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    for(int a=0;a<2;a++){
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
                case 2:
                    System.out.println("EMPLOYEE DETAILS");
                    for(int a=0;a<2;a++){
                        System.out.println("\nEMPLOYEE CODE:"+emp_code[a]);
                        System.out.println("EMPLOYEE NAME:"+name[a]);
                        System.out.println("DESIGNATION:"+designation[a]);
                        System.out.println("SALARY:"+salary[a]);
                        System.out.println("COMPANY NAME:"+company[a]);
                        System.out.println("PHONE NUMBER:"+phone[a]);
                        System.out.println("EMAIL:"+email[a]);
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("ENTER THE EMPLOYEE CODE:");
                    int s=sc.nextInt();
                    boolean f=false;
                    for (int a=0;a<2;a++){
                        if(emp_code[a]==s){
                            f=true;
                        }
                    }
                    if(f==true){
                        for (int a=0;a<2;a++){
                            System.out.println("\nEMPLOYEE CODE:"+emp_code[a]);
                            System.out.println("EMPLOYEE NAME:"+name[a]);
                            System.out.println("DESIGNATION:"+designation[a]);
                            System.out.println("SALARY:"+salary[a]);
                            System.out.println("COMPANY NAME:"+company[a]);
                            System.out.println("PHONE NUMBER:"+phone[a]);
                            System.out.println("EMAIL:"+email[a]);
                            System.out.println("");
                        }

                    }
                    else {
                        System.out.println("Data is not found");
                    }
                    break;
                default:
                    System.out.println("Invalid choice...Enter a valid choice.");
                    break;
            }
        }while(c!=5);
    }
}