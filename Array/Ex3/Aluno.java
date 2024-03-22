package Array.Ex3;

public class Aluno {
    private String nome;
    private float[] notas;
    private String curso;
    private String turno;
    private String matricula;
    private boolean[] frequencia;

    private double nota;
    private double totalFrequencia;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float[] getNotas() {
        return notas;
    }
    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public boolean[] getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(boolean[] frequencia) {
        this.frequencia = frequencia;
    }

    public double media() {
        double soma = 0;
        
        for(int i=0;i < notas.length; i++) {
            soma += notas[i];
        }        

        nota = soma / notas.length;
        return nota;
    }

    public double frequencia() {
        int total = frequencia.length;
        
        for(int i=0;i<frequencia.length;i++) {
            if(frequencia[i]) {
                total--;
            }
        }
        
        // frequencia.length = 100%
        // total = X

        totalFrequencia = 100 - ((total * 100) / frequencia.length);
        return totalFrequencia;
    }

    public String verificar() {
        if(nota >= 7 && totalFrequencia >= 70) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

}
