package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

    public static void main(String[] args) {
        //new Aluno é uma instância ou criação de objeto
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        aluno1.setIdade(50);
        aluno1.setDataNascimento("18/10/87");
        aluno1.setRegistroGeral("1234567");
        aluno1.setNumeroCpf("013.321.506-50");
        aluno1.setNomeMae("Maria");
        aluno1.setNomePai("Antonio");
        aluno1.setDataMatricula("10/01/19");
        aluno1.setNomeEscola("Santa Rosa");
        aluno1.setSerieMatriculado("5");

        System.out.println("Nome é " + aluno1.getNome());
        System.out.println("Idade é " + aluno1.getIdade());
        System.out.println("Nascimento é " + aluno1.getDataNascimento());


        //===========================================================

        System.out.println("==========================================");

        //aluno2 é uma referência para o Objeto aluno
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Pedro");
        aluno2.setIdade(40);
        aluno2.setDataNascimento("10/10/80");

        System.out.println("Nome é " + aluno2.getNome());
        System.out.println("Idade é " + aluno2.getIdade());
        System.out.println("Nascimento é " + aluno2.getDataNascimento());

        Aluno aluno3 = new Aluno();

        Aluno aluno4 = new Aluno("Maria");

        Aluno aluno5 = new Aluno("Jose", 50);
    }
}
