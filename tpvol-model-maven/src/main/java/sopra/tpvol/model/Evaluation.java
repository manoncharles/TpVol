package sopra.formation.model;

public class Evaluation {
	private Long id;
	private Integer comportemental;
	private Integer technique;
	private String commentaires;

	public Evaluation() {
		super();
	}

	public Evaluation(Integer comportemental, Integer technique, String commentaires) {
		super();
		this.comportemental = comportemental;
		this.technique = technique;
		this.commentaires = commentaires;
	}

	public Evaluation(Long id, Integer comportemental, Integer technique, String commentaires) {
		super();
		this.id = id;
		this.comportemental = comportemental;
		this.technique = technique;
		this.commentaires = commentaires;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getComportemental() {
		return comportemental;
	}

	public void setComportemental(Integer comportemental) {
		this.comportemental = comportemental;
	}

	public Integer getTechnique() {
		return technique;
	}

	public void setTechnique(Integer technique) {
		this.technique = technique;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

	@Override
	public String toString() {
		return "Evaluation [id=" + id + ", comportemental=" + comportemental + ", technique=" + technique
				+ ", commentaires=" + commentaires + "]";
	}

}
