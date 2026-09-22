import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       
        int numero;
        double valor;
        double saldo = 500;
        Scanner scanner = new Scanner(System.in);

        do{
          System.out.println("Bem-vindo ao caixa automático! Por favor, selecione uma das opções abaixo:");  
          System.out.println("1- Consultar saldo");  
          System.out.println("2- Realizar depósito");  
          System.out.println("3- Realizar saque");  
          System.out.println("4- Sair");  
          numero = scanner.nextInt();
          ConsoleUtils.clearConsole();

          switch (numero) {

            case 1:
                System.out.printf("O saldo disponível é de: R$%.2f%n", saldo);
                break;
        
            case 2:
                System.out.println("Digite o valor que deseja depositar (no formato R$xxx,xx ou R$x.xxx,xx): ");
                valor = scanner.nextDouble();
                ConsoleUtils.clearConsole();

                if(valor>0){
                    saldo += valor;
                    System.out.printf("Operação concluída com sucesso! O novo saldo é de: R$%.2f%n", saldo);
                    break;
                }

                else{
                    System.out.println("O valor inserido é inválido. Tente novamente!");
                    break;
                }

            case 3:
                System.out.println("Digite o valor que deseja sacar (no formato R$xxx,xx ou R$x.xxx,xx): ");
                valor = scanner.nextDouble();
                ConsoleUtils.clearConsole();

                if(valor<=0){
                    System.out.println("O valor inserido é inválido. Tente novamente!");
                    break;
                }

                else if(valor>saldo){
                    System.out.println("O saldo na sua conta é insuficiente!");
                    break;
                    }

                else{
                saldo -= valor;
                System.out.printf("Operação concluída com sucesso! O novo saldo é de: R$%.2f%n", saldo);
                break;
                }

            case 4:
                System.out.println("Programa encerrado!");
                break;

          default:
            System.out.println("Opção inválida! Tente novamente!");
            break;
            }
        }

        while(numero != 4);
        scanner.close();

    }
}
