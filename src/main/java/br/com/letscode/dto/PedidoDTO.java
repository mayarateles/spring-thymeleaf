package br.com.letscode.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PedidoDTO {
    private String id;
    private String produto;
    private BigDecimal valor;
    private LocalDate dataEntrega;
    private String descricao;
}
