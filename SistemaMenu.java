import java.util.Scanner;

public class SistemaMenu{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int option;

        for(int i = 0; i<100;i++){

System.out.println("\n----MENU----");

System.out.println("1 - SOMAR");

System.out.println("2 - MULTIPLICAR");

System.out.println("3 - SUBTRAIR");

System.out.println("4 - DIVIDIR");

System.out.println("5 - SAIR");


     option = sc.nextInt();

     switch(option){
     

         case 1:
            System.out.println("Primeiro número: ");
            int a = sc.nextInt();
            System.out.println("Segundo número: ");
            int b = sc.nextInt();
            System.out.println("Resultado: "+ (a+b));
            break;

            case 2:
            System.out.println("Primeiro número: ");
            int x = sc.nextInt();
            System.out.println("Segundo número: ");
            int y = sc.nextInt();
            System.out.println("Resultado: "+ (x-y));
            break;

            case 3:
            System.out.println("Primeiro número: ");
            int d = sc.nextInt();
            System.out.println("Segundo número: ");
            int e = sc.nextInt();
            System.out.println("Resultado: "+ (d*e));
            break; 

            case 4:
            System.out.println("Primeiro número: ");
            int f = sc.nextInt();
            System.out.println("Segundo número: ");
            int g = sc.nextInt();
            System.out.println("Resultado: "+ (f/g));
            break;
        
           case 5: 
           System.out.println("Saindo");
           sc.close();
           return;
        default:
            System.out.println("Opcao invalida");





     }
        }




    }
}
