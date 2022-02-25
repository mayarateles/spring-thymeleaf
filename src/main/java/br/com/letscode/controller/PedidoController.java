package br.com.letscode.controller;

import br.com.letscode.dto.PedidoDTO;
import br.com.letscode.entity.PedidoEntity;
import br.com.letscode.repository.PedidoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    @GetMapping("/listar")
    public String listar() {
        return "listar-pedidos";
    }

    @GetMapping("/pedido-form")
    public String obterFormulario() {
        return "pedido-form";
    }

    @PostMapping("/cadastrar")
    public RedirectView cadastrarPedido(PedidoDTO pedidoDTO, RedirectAttributes redirectAttributes) {
        PedidoRepository repository = new PedidoRepository();
        PedidoEntity entity = new PedidoEntity(pedidoDTO);
        PedidoEntity savedEntity = repository.salvar(entity);

        redirectAttributes.addFlashAttribute("pedidos", repository.getLista());

        RedirectView redirectView = new RedirectView("/pedidos/listar", true);

        return redirectView;
    }

//    @GetMapping("/atualizar/{id}")
//    public RedirectView atualizarPedido() {
//
//
//
//        RedirectView redirectView = new RedirectView("/pedidos/listar", true);
//        return redirectView;
//
//    }
//
//    @GetMapping("/deletar/{id}")
//    public RedirectView deletarPedido(@PathVariable("id") long id) {
//
//
//
//        RedirectView redirectView = new RedirectView("/pedidos/listar", true);
//        return redirectView;
//
//    }

}
