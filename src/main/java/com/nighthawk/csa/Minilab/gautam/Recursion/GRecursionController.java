package com.nighthawk.csa.Minilab.gautam.Recursion;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GRecursionController {
    @GetMapping("/GautamRecursion")
    public String gautamRecurse(@RequestParam(name = "sNum", required = true, defaultValue = "2") Integer sNum,
                                Model model
    ){
        model.addAttribute("num1", sNum);
        model.addAttribute("fact1", GautamRecursion.gfactorial(sNum));

        return "GautamMiniLab/GautamRecursion";
    }
}
