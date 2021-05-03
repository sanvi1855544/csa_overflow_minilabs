package com.nighthawk.csa.Minilab.gautam.LinkedLists;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

@org.springframework.stereotype.Controller
public class GLLController {
    @GetMapping("/GautamLinkedList")
    public String sort(
            @RequestParam(name = "inputA", required = true, defaultValue = "0") String inputA,
            @RequestParam(name = "inputB", required = true, defaultValue = "0") String inputB,
            @RequestParam(name = "inputC", required = true, defaultValue = "0") String inputC,
            @RequestParam(name = "inputD", required = true, defaultValue = "0") String inputD,
            Model model
    ){
        String[] sortArray = {inputA, inputB, inputC, inputD};

        GLinkedList list1 = new GLinkedList(sortArray);
        model.addAttribute("listA", Arrays.toString(list1.add()));

        return "GautamMiniLab/GautamLinkedList";

    }
}
