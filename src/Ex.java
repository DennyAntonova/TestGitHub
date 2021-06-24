import java.util.Scanner;



import java.util.Scanner;

    public class  Ex{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("a: ");
            double a = scanner.nextDouble();
            System.out.println(cuArea(a));
            System.out.println(cuVolume(a));
        }
        public static double cuArea (double a){
            double s =6 * a * a;
            return s;
        }
        public static double cuVolume (double a){
            double v = a * a * a;
            return v;
        }
    }


