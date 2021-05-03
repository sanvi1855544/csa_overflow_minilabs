package com.nighthawk.csa.Minilab.gautam.Inheritance;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class GInheritanceController {
    @GetMapping("/GautamInheritance")
    public String test(@RequestParam(name = "role", required = true, defaultValue = "Staffer") String role,
                       @RequestParam(name = "deadline", required = true, defaultValue = "100") int deadline,
                       Model model){
        model.addAttribute("role", role);
        model.addAttribute("deadline", deadline);

        String roleA = role.toString();
        int deadlineA = deadline;

        if (role.equals("Editor")) {
            Editor editorA = new Editor(deadlineA, roleA, 90);
            model.addAttribute("roleN", editorA.getRole());
            model.addAttribute("deadlineN", editorA.deadlineStatus());
            model.addAttribute("deadlineStatus", editorA.pagesToDo());
        } else if (role.equals("Staffer")) {
            Staffer stafferA = new Staffer("Staffer", deadline);
            model.addAttribute("roleN", stafferA.getRole());
            model.addAttribute("deadlineN", "100");
            model.addAttribute("deadlineStatus", stafferA.todo());
        }

        return "GautamMinilab/GautamInheritance";
    }

}
