package Array.Ex3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        boolean[] frequencia = {true,true,true,false};
        float[] notas = {10,5,6};
        aluno.setNome("Eduardo");
        aluno.setMatricula("01824823");
        aluno.setTurno("Noite");
        aluno.setNotas(notas);
        aluno.setCurso("ADS");
        aluno.setFrequencia(frequencia);

        System.out.println("O aluno " + aluno.getNome() + " do Curso " + aluno.getCurso() + " de Matricula " + aluno.getMatricula() + " do Turno" + aluno.getTurno());
        System.out.printf("Media: %.1f\n", aluno.media());
        System.out.printf("Frenquencia : %.0f", aluno.frequencia());
        System.err.println("%");
        System.out.println("O aluno foi " + aluno.verificar());
    }
}
