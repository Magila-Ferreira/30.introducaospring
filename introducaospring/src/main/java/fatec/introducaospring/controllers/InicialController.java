package fatec.introducaospring.controllers;

import fatec.introducaospring.IntroducaospringApplication;
import fatec.introducaospring.models.Cliente;
import java.rmi.server.UID;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicialController {

  // Funcão para inicializar o projeto no navegador
  @GetMapping(value = "/")
  public String inicio() {
    return "index";
  }

  // Funcão para chamar a página listagem
  @GetMapping(value = "/listar")
  public ModelAndView listaDeClientes() {
    ModelAndView mv = new ModelAndView("listagem");
    mv.addObject("Clientes", IntroducaospringApplication.listaClientes);
    return mv;
  }

  @GetMapping(value = "/novo")
  public ModelAndView novoCliente() {
    ModelAndView mv = new ModelAndView("cadastro");
    Cliente cli = IntroducaospringApplication.listaClientes.get(0);
    mv.addObject("cliente", cli);
    return mv;
  }

  @PostMapping(value = "/novo")
  public String salvarCliente(Cliente cliente) {
    cliente.setId(new UID());
    IntroducaospringApplication.listaClientes.add(cliente);
    return "redirect:/listar";
  }
}
