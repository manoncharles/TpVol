package sopra.tpvol;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity // obligatoire
@Table // optionnel
public class Paiement {
	@Id // obligatoire
	@GeneratedValue // optionnel
	private Long id;
	@Column(length=8)
	@Enumerated(EnumType.STRING)
	@NotEmpty
	private TypePaiement typePaiement;
	@NotEmpty
	private Float montant;
	//@OneToOne(mappedBy = "paiement")
	private Reservation reservation;
	@Version
	private int version;

	public Paiement() {
		super();
	}
	public Paiement(TypePaiement typePaiement,Float montant) {
		super();
		this.typePaiement=typePaiement;
		this.montant=montant;
	}

	public TypePaiement getTypePaiement() {
		return typePaiement;
	}

	public void setTypePaiement(TypePaiement typePaiement) {
		this.typePaiement = typePaiement;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Paiement [typePaiement=" + typePaiement + ", montant=" + montant + "]";
	}

}
