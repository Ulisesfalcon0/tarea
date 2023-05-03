package ico.fes.Intro.controllers;

import ico.fes.Intro.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {
    @GetMapping("/inicio")
    public String getInicio(Model model){
        Empleado emp= new Empleado(1,"Jose Sosa",2300,"Sistemas","12/12/2000");
        model.addAttribute("empleado",emp);
        model.addAttribute ("nombre", "Jose");
        return "index";
    }
}
