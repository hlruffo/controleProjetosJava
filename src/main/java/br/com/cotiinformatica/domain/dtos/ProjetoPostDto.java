package br.com.cotiinformatica.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ProjetoPostDto {
	@NotBlank(message = "Por favor, informe o nome do projeto.")
	private String nome;

	@NotBlank(message = "Por favor, informe o escopo do projeto.")
	private String escopo;

	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Por favor, informe a data de entrega do projeto, no formato YYYY-MM-DD.")
	@NotBlank(message = "Por favor, informe a data de entrega do projeto, no formato YYYY-MM-DD.")
	private String dataEntrega;

}
