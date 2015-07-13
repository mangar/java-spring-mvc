package br.web.app.controllers;

import br.web.app.business.home.Index;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
        model.addAttribute("message", Index.getMessage() );
		return "home/index";
	}


    @RequestMapping(value="/send")
    public String send(Model model) {
        return "home/index";
    }





//	TODO metodo para enviar mensagem para RabbitMQ
//	TODO loop para obter retorno do processamento no RabbitMQ
//	TODO código em Scala para fazer o processamento



//  TODO adicionar /admin
//  TODO adicionar bootstrap no /admin


}
