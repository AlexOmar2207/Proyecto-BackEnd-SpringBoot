package com.console.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sexo")

public class Sexo {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer idSexo;
		
		@Column(name= "opcion", length = 20, nullable = false)
		private String sexo;
		
		
		public Integer getIdSexo() {
			return idSexo;
		}
		
		public void setIdSexo(Integer idSexo) {
			this.idSexo = idSexo;
		}
		
		public String getSexo() {
			return sexo;
		}
		
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
	
}
