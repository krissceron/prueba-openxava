package com.tuempresa.prueba.modelo;

import java.math.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

/**
 * Esto es un ejemplo de una entidad.HOLI SOY KRIS
 * 
 * Siéntete libre de renombrarla, modificarla o borrarla a tu gusto.
 */

@Entity @Getter @Setter
public class TuPrimeraEntidad extends Identifiable {
	
	@Column(length=50) @Required
	String descripcion;
	
	LocalDate fecha;
	
	BigDecimal importe;
	
}
