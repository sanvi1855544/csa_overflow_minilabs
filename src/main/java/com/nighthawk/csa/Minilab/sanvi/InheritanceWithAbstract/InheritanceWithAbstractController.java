package com.nighthawk.csa.Minilab.sanvi.InheritanceWithAbstract;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class InheritanceWithAbstractController {

    @GetMapping("/SanviInheritanceWithAbstract")
    public String volumeCalculator(@RequestParam(name = "radius", required = true, defaultValue = "0") Double radius,
                                   @RequestParam(name = "length", required = true, defaultValue = "0") Double length,
                                   Model model){

        model.addAttribute("radius", radius);
        model.addAttribute("length", length);

        Cylinder cylinder = new Cylinder(radius, length);

        model.addAttribute("volume", cylinder.findVolume());

        return "SanviMinilab/SanviInheritanceWithAbstract";
    }
}