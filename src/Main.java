
import java.util.Scanner;
public static void main() {

    IO.println(String.format("Programa recebe as notas de um aluno e repassa as médias e se o aluno fio aprovado ,reprovado ou está em recuperaçao. posteriormente exibir a media da turma."));

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a primeira nota: ");
    double nota1 = entrada.nextDouble();
    System.out.println("Digite a segunda nota: ");
    double nota2 = entrada.nextDouble();
    System.out.println("digite a terceira nota: ");
    double nota3 = entrada.nextDouble();
    System.out.println("digite a quarta nota: ");
    double nota4 = entrada.nextDouble();
    System.out.println("digite a quita nota: ");
    double nota5 = entrada.nextDouble();

    double media = (nota1 + nota2 + nota3 + nota4 + nota5 / 5);
    System.out.println("media" +media);
}
