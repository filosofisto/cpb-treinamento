package curso.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConsultoriaPK implements Serializable {

	private static final long serialVersionUID = 2231946509673971084L;

	@Column(name="ID_EMPRESA")
	private Long empresaId;
	
	@Column(name="ID_CONSULTOR")
	private Long consultorId;
	
	public ConsultoriaPK() {
		
	}
	
	public ConsultoriaPK(Long empresaId, Long consultorId) {
		setEmpresaId(empresaId);
		setConsultorId(consultorId);
	}
	
	public Long getEmpresaId() {
		return empresaId;
	}
	public void setEmpresaId(Long empresaId) {
		this.empresaId = empresaId;
	}
	public Long getConsultorId() {
		return consultorId;
	}
	public void setConsultorId(Long consultorId) {
		this.consultorId = consultorId;
	}
}
