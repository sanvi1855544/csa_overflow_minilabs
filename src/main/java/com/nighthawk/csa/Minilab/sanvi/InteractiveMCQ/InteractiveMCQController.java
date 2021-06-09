package com.nighthawk.csa.Minilab.sanvi.InteractiveMCQ;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InteractiveMCQController {

    @GetMapping("/SanviInteractiveMCQ")
    public String sorter(
            @RequestParam(name = "id0", required = true, defaultValue = "") String id0,
            Model model,
            @RequestParam(name = "A1", required = true, defaultValue = "A") String A1,
            @RequestParam(name = "A2", required = true, defaultValue = "A") String A2,
            @RequestParam(name = "A3", required = true, defaultValue = "A") String A3,
            @RequestParam(name = "A4", required = true, defaultValue = "A") String A4,
            @RequestParam(name = "A5", required = true, defaultValue = "A") String A5,
            @RequestParam(name = "A6", required = true, defaultValue = "A") String A6,
            @RequestParam(name = "A7", required = true, defaultValue = "A") String A7,
            @RequestParam(name = "A8", required = true, defaultValue = "A") String A8,
            @RequestParam(name = "A9", required = true, defaultValue = "A") String A9,
            @RequestParam(name = "A10", required = true, defaultValue = "A") String A10,
            @RequestParam(name = "A11", required = true, defaultValue = "A") String A11,
            @RequestParam(name = "A12", required = true, defaultValue = "A") String A12,
            @RequestParam(name = "A13", required = true, defaultValue = "A") String A13,
            @RequestParam(name = "A14", required = true, defaultValue = "A") String A14,
            @RequestParam(name = "A15", required = true, defaultValue = "A") String A15,
            @RequestParam(name = "A16", required = true, defaultValue = "A") String A16,
            @RequestParam(name = "A17", required = true, defaultValue = "A") String A17,
            @RequestParam(name = "A18", required = true, defaultValue = "A") String A18,
            @RequestParam(name = "A19", required = true, defaultValue = "A") String A19,
            @RequestParam(name = "A20", required = true, defaultValue = "A") String A20
    ) {

        if (id0.length() == 0)
            return "SanviMinilab/SanviInteractiveMCQ";
        else {
            model.addAttribute("S1", id0);
            model.addAttribute("R1", A1);
            model.addAttribute("R2", A2);
            model.addAttribute("R3", A3);
            model.addAttribute("R4", A4);
            model.addAttribute("R5", A5);
            model.addAttribute("R6", A6);
            model.addAttribute("R7", A7);
            model.addAttribute("R8", A8);
            model.addAttribute("R9", A9);
            model.addAttribute("R10", A10);
            model.addAttribute("R11", A11);
            model.addAttribute("R12", A12);
            model.addAttribute("R13", A13);
            model.addAttribute("R14", A14);
            model.addAttribute("R15", A15);
            model.addAttribute("R16", A16);
            model.addAttribute("R17", A17);
            model.addAttribute("R18", A18);
            model.addAttribute("R19", A19);
            model.addAttribute("R20", A20);

            return "SanviMinilab/SanviInteractiveMCQResponse";
        }
    }
}
