package com.nighthawk.csa.Minilab.gautam.APMiniLab;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class GAPController {
    @GetMapping("/GautamAPMiniLab")
    public String test(@RequestParam(name = "minSteps", required = true, defaultValue = "1000") int minSteps, @RequestParam(name = "steps", required = true, defaultValue = "100") int steps, Model model){
        main stepFRQ = new main(minSteps);
        stepFRQ.addDailySteps(steps);
        model.addAttribute("activeSteps", stepFRQ.activeDays());
        model.addAttribute("averageSteps", stepFRQ.averageSteps());
        model.addAttribute("totalSteps", stepFRQ.getTotalSteps());

        return "GautamMinilab/GautamAPMiniLab";
    }
}