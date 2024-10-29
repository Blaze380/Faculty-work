import java.util.Scanner;
class App{
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de operaçao deseja fazer?");
        System.out.print("1 - Adiçao \n2 - Subtraçao \n3 - Multiplicaçao \n4 - Divisao \n: ");
        int operacao=sc.nextInt();
        System.out.print("Digite o primeiro numero: ");
        int primeiroNum = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundoNum = sc.nextInt();

        switch(operacao){
            case 1:
                System.out.println("A soma deu: "+(primeiroNum +segundoNum));
                break;
            case 2:
                System.out.println("A subtraçao deu: "+(primeiroNum -segundoNum));
                break;
            case 3:
                System.out.println("A multiplicaçao deu: "+(primeiroNum *segundoNum));
                break;
            case 4:
                System.out.println("A divisao deu: "+(primeiroNum /segundoNum));
                break;
        }
        
        
        
        
    }
}