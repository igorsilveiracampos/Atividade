
import java.util.Scanner;
public static void main() {

    IO.println(String.format("Programa recebe as notas de um aluno e repassa as médias e se o aluno fio aprovado ,reprovado ou está em recuperaçao. posteriormente exibir a media da turma."));


    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a Quantidade de alunos: ");
    int qtalunos = entrada.nextInt();
    double somamedia = 0;
    double media, nota1 , nota2, nota3 , nota4 , nota5;

    for(int i = 1; i <= qtalunos; i++) {
        System.out.println("Digite o nome do aluno" + i);

        System.out.println("Digite a primeira nota: ");
         nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
         nota2 = entrada.nextDouble();
        System.out.println("digite a terceira nota: ");
         nota3 = entrada.nextDouble();
        System.out.println("digite a quarta nota: ");
         nota4 = entrada.nextDouble();
        System.out.println("digite a quita nota: ");
         nota5 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("media" + media);
        somamedia += media;
        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media >= 4){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }

        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Nota 3: "+nota3);
        System.out.println("Nota 4: "+nota4);
        System.out.println("Nota 5: "+nota5);
    }
    double mediaturma = somamedia / qtalunos;
    System.out.println("Media da Turma"+mediaturma);

}

