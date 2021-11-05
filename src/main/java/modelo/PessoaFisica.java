package modelo;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import modelo.Pessoa;

/**
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity
@DiscriminatorValue("PF")
public class PessoaFisica extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cpf;
	private String rg;
	private Date dataNascimento;
	
	private Sexo sexo;
	
	//To do -> Criar relacionamento de diaria para pessoa fisica 22:43
	
	public PessoaFisica() {
		super();
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Temporal(TemporalType.DATE)//Deixar claro que quero somente o dia mes ano da data, em time tras as horas e timestemp a data completa
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
   
}
