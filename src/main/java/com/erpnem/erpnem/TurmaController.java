package com.erpnem.erpnem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TurmaController {
@RequestMapping("/cadastrarTurmas")
    public String showTurmas(){
        return "turmas/formTurmas";
    }
}
