
import java.util.Scanner;

public class SistemaAtm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;

        double saldo = 1000;

        do {

            System.out.println("\n==================SISTEMA ATM===========================");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Tranfesfir");
            System.out.println("Escolha: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Saldo atual: R$ "
                            + saldo);
                    voltarMenu(scanner);
                    break;
                case 2:

                    int optionDeposito;

                    do {
                        System.out.println("\n==================DEPOSITO===========================");
                        System.out.println("1 - Depositar dinheiro");
                        System.out.println("2 - Voltar");
                        System.out.println("Escolha uma opção: ");

                        opitionDeposito = scanner.nextInt();

                        swich(optionDeposito){
                              
                              case 1:
                                System.out.println("Digite o valor depósito: ");
                                double deposito = scanner.nextDouble();

                            if (deposito > 0){

                                saldo += deposito;

                                System.out.println("Deposito realizado");

                            
                            }else{
                                System.out.println("Valor inválido");
                            }
                            break;

                            case 2:
                                System.out.println("Voltando ao menu...");
                                break;

                            default:

                                System.out.println("Opção invalida");



                        }
                        while(opitionDeposito !=2);

                    } while (true);

                    
                case 3:
                    
                    int optionSaque;

                    do {
                        System.out.println("\n==================SAQUE===========================");
                        System.out.println("1 - Sacar dinheiro ");
                        System.out.println("2 - Voltar");
                        System.out.println("Escolha uma opção: ");

                        optionSaque = scanner.nextInt();

                        switch (optionSaque) {
                            case 1: 
                               System.out.println("Digite o valor do saque");
                               double saque = scanner.nextDouble()

                               break;
                            default:
                        }


                    }






                    System.out.println("Valor do saque: ");
                    double saque = scanner.nextDouble();

                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado");

                    } else {
                        System.out.println("Saldo insuficiente");

                    }
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção invalida");

            }
        } while (option != 4);

        scanner.close();
    }

    public static void voltarMenu(Scanner scanner) {

    }
}
