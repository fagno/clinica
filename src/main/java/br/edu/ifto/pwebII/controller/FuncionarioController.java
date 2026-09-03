package br.edu.ifto.pwebII.controller;

import br.edu.ifto.pwebII.model.entity.Funcionario;
import br.edu.ifto.pwebII.model.repository.FuncionarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Anotando seu controller com @Controller,
 * todos os seus métodos públicos serão acessíveis pela web.
 */
@Controller
@RequestMapping("funcionario")
public class FuncionarioController {

    FuncionarioRepository repository;

    public FuncionarioController(FuncionarioRepository repository){
        this.repository = repository;
    }

    /**
     * Método que vai carregar a página form
     * @return ModelAndView
     */
    @GetMapping("form")
    public ModelAndView form(Funcionario funcionario){
        return new ModelAndView("funcionario/form");
    }


    @GetMapping("/list")
    public ModelAndView listar(ModelMap model) {
        model.addAttribute("funcionarios", repository.funcionarios());
        return new ModelAndView("/funcionario/list", model);
    }


}
