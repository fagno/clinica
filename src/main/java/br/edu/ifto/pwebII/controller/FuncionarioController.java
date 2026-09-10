package br.edu.ifto.pwebII.controller;

import br.edu.ifto.pwebII.model.entity.Funcionario;
import br.edu.ifto.pwebII.model.repository.FuncionarioRepository;
import br.edu.ifto.pwebII.service.FuncionarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    FuncionarioService service;

    public FuncionarioController(FuncionarioRepository repository, FuncionarioService service) {
        this.repository = repository;
        this.service = service;
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

    @GetMapping("/remove/{id}")
    public ModelAndView remove(@PathVariable("id") Long id, ModelMap model){
        if(!service.remover(id)){
            model.addAttribute("erro","Não é possível remover o usuário, pois existem registros vinculados a ele.");
            return new ModelAndView("/funcionario/model");
        }
        return new ModelAndView("redirect:/funcionario/list");
    }

}
