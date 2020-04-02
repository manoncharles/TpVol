package sopra.tpvol;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Reservation {
	private Boolean annulee;
	private Boolean confirmee;
	private Boolean ouverte;
	private String numeroDeReservation;
	private Paiement paiement;
	private Trajet trajet;
	private Passager passager;
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;

	public Reservation() {
		super();
	}

	public Boolean getAnnulee() {
		return annulee;
	}

	public void setAnnulee(Boolean annulee) {
		this.annulee = annulee;
	}

	public Boolean getConfirmee() {
		return confirmee;
	}

	public void setConfirmee(Boolean confirmee) {
		this.confirmee = confirmee;
	}

	public Boolean getOuverte() {
		return ouverte;
	}

	public void setOuverte(Boolean ouverte) {
		this.ouverte = ouverte;
	}

	public String getNumeroDeReservation() {
		return numeroDeReservation;
	}

	public void setNumeroDeReservation(String numeroDeReservation) {
		this.numeroDeReservation = numeroDeReservation;
	}

	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Reservation [annulee=" + annulee + ", confirmee=" + confirmee + ", ouverte=" + ouverte
				+ ", numeroDeReservation=" + numeroDeReservation + ", paiement=" + paiement + ", passager=" + passager + ", client=" + client + "]";
	}

}
