package com.nighthawk.csa.Minilab.sanvi.InteractiveFRQ;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Arrays;

@Controller
public class InteractiveFRQController {

    @GetMapping("/SanviInteractiveFRQ")
    public String sorter(
            @RequestParam(name = "id0", required = true, defaultValue = "") String id0,
            Model model
    ) {
        if (id0.length() == 0)
            return "SanviMinilab/SanviInteractiveFRQ";
        else {
            model.addAttribute("response", id0);
            return "SanviMinilab/SanviInteractiveFRQResponse";
        }
    }
}
