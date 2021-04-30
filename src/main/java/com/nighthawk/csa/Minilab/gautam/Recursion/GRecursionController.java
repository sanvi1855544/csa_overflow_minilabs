package com.nighthawk.csa.Minilab.gautam.Recursion;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GRecursionController {
    @GetMapping("/GautamRecursion")
    public String gautamRecurse(@RequestParam(name = "sNum", required = false, defaultValue = "0") Integer sNum, Model model) {
        model.addAttribute("sNum", sNum);
        model.addAttribute("factA", GautamRecursion.gfactorial(sNum));

        return "GautamMiniLab/GautamRecursion";
    }
}
