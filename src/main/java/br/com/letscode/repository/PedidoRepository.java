package br.com.letscode.repository;

import br.com.letscode.entity.PedidoEntity;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PedidoRepository {

    private static List<PedidoEntity> lista = new ArrayList<>();

    public PedidoEntity salvar(PedidoEntity pedidoEntity) {
        String id = UUID.randomUUID().toString();
        LocalDate dataEntrega = LocalDate.now();

        pedidoEntity.setId(id);
        pedidoEntity.setDataEntrega(dataEntrega);

        lista.add(pedidoEntity);
        return pedidoEntity;
    }

    public List<PedidoEntity> getLista() {
        return lista;
    }

    public static PedidoEntity getListaById(Long id) {
        return null;
    }
}
