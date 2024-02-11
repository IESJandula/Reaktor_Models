package es.iesjandula.reaktor.models.jpa;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class TaskId implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2686153173707368266L;
	
	private String actionId;
	
	private Date date;
	
	private String info;
	
	private Long motherBoardId;

}