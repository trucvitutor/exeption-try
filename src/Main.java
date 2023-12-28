import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("nhap canh a: ");
            int a= Integer.parseInt(sc.nextLine());
            System.out.println("nhap canh b: ");
            int b= Integer.parseInt(sc.nextLine());
            System.out.println("nhap canh c: ");
            int c= Integer.parseInt(sc.nextLine());
            if(a>=0&&b>=0&&c>=0){
                if(a+b>c||a+c>b||b+c>a) {
                    System.out.println("tam giác ");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("không phải cạnh tam giác.");
        }finally {
            System.out.println("done");
        }
    }
}