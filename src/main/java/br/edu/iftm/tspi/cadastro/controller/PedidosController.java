package br.edu.iftm.tspi.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.iftm.tspi.cadastro.dao.PedidoDAO;
import br.edu.iftm.tspi.cadastro.domain.Pedido;
import br.edu.iftm.tspi.cadastro.domain.Vendedor;

@Controller
@RequestMapping("/pedidos/{email}")
public class PedidosController {
    @Autowired
    private PedidoDAO pedidoDAO;


    @GetMapping
    public String listarPedidos(@PathVariable("email") String email, Model model) {
        List<Pedido> pedidos = pedidoDAO.listarPedidos(email);
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("email", email);
        model.addAttribute("vendedor", new Vendedor());
        return "paginaPedidos";
    }   

    @PostMapping("/inserir")
    public String inserirContato(@ModelAttribute Pedido pedido, Model model) {
        pedidoDAO.inserirPedido(pedido);
        List<Pedido> pedidos = pedidoDAO.listarPedidos(pedido.getEmail_contato());
        model.addAttribute("pedidos", pedidos);
        return "paginaPedidos";
    }


    
}



