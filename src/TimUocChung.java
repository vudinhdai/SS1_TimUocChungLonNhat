import java.util.Scanner;

public class TimUocChung {
    public static void main(String[] args) {
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("a:");
        a = nhap.nextInt();
        System.out.println("b:");
        b = nhap.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("khong co uoc chung lon nhat");
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("uoc chung lon nhat :"+ a);
        }
    }
}
