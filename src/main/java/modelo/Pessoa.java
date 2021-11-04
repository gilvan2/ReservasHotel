package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo")
public abstract class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String nome;
	private String telefone;
	private String email;
	
	private Endereco endereco;
	

	public Pessoa() {
		super();
	}   
	@Id	
	@SequenceGenerator(sequenceName = "pessoa_cod_seq",name = "genpessoa")
	@GeneratedValue(generator = "genpessoa")
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Embedded
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
   
}
