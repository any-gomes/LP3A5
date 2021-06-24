package ex4;

public class Avaliacao {
	private String disciplina;
	private String nomeAluno;
	private int nota;
	
	public Avaliacao(String disciplina, String nomeAluno, int nota) {
		this.disciplina = disciplina;
		this.nomeAluno = nomeAluno;
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	       

}
