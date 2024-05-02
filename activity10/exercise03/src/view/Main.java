package view;


import controller.EstudanteController;
import controller.EstudanteGraduacaoController;
import controller.EstudantePosGraduacaoController;
import model.Estudante;

//O método entregarTCC() violava o LSP, já que os estudantes de Pós Graduação
//não entregam TCC, e por isso foi criada uma interface para esse. Assim podemos implentar
//essa interface nos estudantes de Graduação, por exemplo.
public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.setNome("Leandro");
        estudante2.setNome("Colevati");

        EstudanteGraduacaoController eg = new EstudanteGraduacaoController();
        EstudantePosGraduacaoController ep = new EstudantePosGraduacaoController();

        eg.estudar(estudante1);
        eg.entregarTCC(estudante1);

        ep.estudar(estudante2);
    }
}