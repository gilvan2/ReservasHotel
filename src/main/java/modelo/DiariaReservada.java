package modelo;

import java.io.Serializable;
import javax.persistence.*;
import modelo.Reserva;

/**
 * Entity implementation class for Entity: DiariaReservada
 *
 */
@Entity

public class DiariaReservada extends Reserva implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Reserva reserva;

	public DiariaReservada() {
		super();
	}

	@ManyToOne
	@JoinColumn(name="cod_reserva")
	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
   
}
