package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @RequestMapping("/calculate")
    public String calculate(ModelMap model, @RequestParam(name = "number1", defaultValue = "0") double number1, @RequestParam(name = "number2", defaultValue = "0") double number2, @RequestParam(name = "calculation", defaultValue = "") String calcul) {

        double result = 0;
        switch (calcul) {
            case "Cong<+>":
                result = number1 + number2;
                calcul = "Cong<+>";
                break;
            case "Tru<->":
                result = number1 - number2;
                calcul = "Tru<->";
                break;
            case "Nhan<x>":
                result = number1 * number2;
                calcul = "Nhan<x>";
                break;
            case "Chia</>":
                result = number1 / number2;
                calcul = "Chia</>";
                break;
        }
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("calcul", calcul);
        model.addAttribute("result", result);
        return "index";
    }
}
