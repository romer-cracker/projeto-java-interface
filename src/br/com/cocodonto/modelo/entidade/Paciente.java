/**
 * 
 */
package br.com.cocodonto.modelo.entidade;

import java.util.Objects;

/**
 * @author romer
 *
 */
public class Paciente {

	private Long id;
	
	private String nome;
	
	private String rg;
	
	private String cpf;
	
	private sexoType sexo;
	
	private Contato contato;

	private Endereco endereco;

	public Paciente(Long id, String nome, String rg, String cpf, sexoType sexo, Contato contato, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.contato = contato;
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id, nome, rg, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(rg, other.rg) && sexo == other.sexo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [id=").append(id).append(", nome=").append(nome).append(", rg=").append(rg)
				.append(", cpf=").append(cpf).append(", sexo=").append(sexo).append(", contato=").append(contato)
				.append(", endereco=").append(endereco).append("]");
		return builder.toString();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public sexoType getSexo() {
		return sexo;
	}

	public void setSexo(sexoType sexo) {
		this.sexo = sexo;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Paciente(String nome, String rg, String cpf, sexoType sexo) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public Paciente(Long id, String nome, String rg, String cpf, sexoType sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	
	
	
	
	
}
