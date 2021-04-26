package com.nighthawk.csa.Minilab.sanvi.Recursion;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class SanviRecursionController {
    @GetMapping("/SanviRecursion")
    public String factorialrecursion(@RequestParam(name = "num1", required = false, defaultValue = "1") Integer num1, Model model) {

        long startTime = System.nanoTime();

        model.addAttribute("num1", num1);
        model.addAttribute("fact1", SanviRecursion.factorial(num1));

        long endTime = System.nanoTime();
        long time = endTime - startTime;
        model.addAttribute("time", time);

        return "SanviMinilab/SanviRecursion";
    }
}
