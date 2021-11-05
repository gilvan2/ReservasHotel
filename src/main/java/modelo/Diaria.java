package modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Diaria
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //Tipo de herança
@DiscriminatorColumn(name="tipo")
public class Diaria implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue
	private int codigo;
	private Date data;
	
	private Collection<PessoaFisica> hospedes;
	
	public Diaria() {
		super();
	}   
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}   
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@ManyToMany //Obrigatoriamente eu oreciso indicar como acontece a relação muitos para muitos 
	@JoinTable(name="hospedagem", //Tabela de união entre diaria e pessoa fisica
			joinColumns = @JoinColumn(name="cod_diaria"),
			inverseJoinColumns = @JoinColumn(name="cod_pessoa"))
	public Collection<PessoaFisica> getHospedes() {
		return hospedes;
	}
	public void setHospedes(Collection<PessoaFisica> hospedes) {
		this.hospedes = hospedes;
	}
   
}
