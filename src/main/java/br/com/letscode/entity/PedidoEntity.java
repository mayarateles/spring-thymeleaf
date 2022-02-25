package br.com.letscode.entity;

import br.com.letscode.dto.PedidoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PedidoEntity {
    private String id;
    private String produto;
    private BigDecimal valor;
    private LocalDate dataEntrega;
    private String descricao;

    public PedidoEntity(PedidoDTO pedidoDTO){
        this.id = pedidoDTO.getId();
        this.produto = pedidoDTO.getProduto();
        this.valor = pedidoDTO.getValor();
        this.dataEntrega = pedidoDTO.getDataEntrega();
        this.descricao = pedidoDTO.getDescricao();
    }

    public PedidoEntity() { }
}
