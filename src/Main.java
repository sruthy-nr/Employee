import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("MENU\n1.ADD EMPLOYEE\n2.EMPLOYEE LIST\n3.SEARCH EMPLOYEE\n4.DELETE EMPLOYEE\n5.EXIT");
            System.out.println("ENTER YOUR CHOICE:");
            c = sc.nextInt();
        }while(c!=5);
    }
}