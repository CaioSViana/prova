package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cadastro_Livro")
public class Livraria {
	
	@GeneratedValue
	@Id
	@Column(name = "Id")
	private Long id;
	
	@Column(name ="Titulo")
	private String titulo;
	
	@Column(name = "Autor")
	private String Autor;
	
	@Column(name ="Editora")
	private String Editora;
	
	@Column(name ="Categoria")
	private String Categoria;
	
	@Column(name ="Quantidade")
	private Integer Quantidade;

}
