package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

    public static void main(String[] args) {
        //new Aluno é uma instância ou criação de objeto
        Aluno aluno1 = new Aluno();

        //aluno2 é uma referência para o Objeto aluno
        Aluno aluno2 = new Aluno();

        Aluno aluno3 = new Aluno();

        Aluno aluno4 = new Aluno("Maria");

        Aluno aluno5 = new Aluno("Jose", 50);
    }
}
