package com.nighthawk.csa.Minilab.sanvi.Inheritance;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class InheritanceController {

    @GetMapping("/SanviInheritance")
    public String inheritanceCalculator(@RequestParam(name = "gear", required = true, defaultValue = "0") Double gear,
                                        @RequestParam(name = "speed", required = true, defaultValue = "0") Double speed,
                                        Model model){

        model.addAttribute("gear", gear);
        model.addAttribute("speed", speed);

        int nGear = gear.intValue();
        int nSpeed = speed.intValue();

        MountainBike mBike = new MountainBike(nGear, nSpeed, 0);

        mBike.speedUp(10);

        model.addAttribute("newgear", mBike.getGear());
        model.addAttribute("newspeed", mBike.getSpeed());

        return "SanviMinilab/SanviInheritance";
    }
}