import java.util.Scanner;

public class Calculadora {

    public static Scanner leer = new Scanner(System.in);
    public static int opcion;
    public static double n1;
    public static double n2;
    public static double r;
    public static String p;

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        ParteUno();
        ParteDos();

    }

    public static void ParteUno() {
        System.out.println("Calculadora");
        System.out.println("Ingrese primer numero");
        n1 = leer.nextDouble();
    }

    public static void ParteDos() {
        System.out.println("Ingrese segundo numero");
        n2 = leer.nextDouble();
        System.out.println("Elige la operacion que quieres realizar");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        opcion = leer.nextInt();
        Operaciones();
    }

    public static void Operaciones() {

        switch (opcion) {
            case 1:
                r = n1 + n2;
                System.out.println("El resultado es " + r);
                Continuar();
                break;
            case 2:
                r = n1 - n2;
                System.out.println("El resultado es " + r);
                Continuar();
                break;
            case 3:
                r = n1 * n2;
                System.out.println("El resultado es " + r);
                Continuar();
                break;
            case 4:
            if(n2==0){
                System.out.println("Error numero indeterminado");
                Menu();
            }else{
                r = n1 / n2;
                System.out.println("El resultado es " + r);
                Continuar();
            }
                break;
            default:
                System.out.println("Valor incorrecto, ingrese tipo de operacion nuevamente");
                opcion = leer.nextInt();
                Operaciones();
        }
    }

    public static void Continuar() {
        System.out.println("¿Desea hacer otra operacion con el resultado? Si(Y)/No(N)");
        p = leer.next();
        if (p.equals("y") || p.equals("Y")) {
            n1 = r;
            ParteDos();
        }else if (p.equals("n")|| p.equals("N")){
            Menu();
        }else {
            System.out.println("Ingrese la letra correcta");
            Continuar();
        }
    }
}