package com.nighthawk.csa.Minilab.gautam.LinkedLists;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import java.util.Arrays;

@Controller
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

        //Linked list times
        long start = System.nanoTime();
        GLinkedList list1 = new GLinkedList(sortArray);
        model.addAttribute("listA", Arrays.toString(list1.sort()));
        long end = System.nanoTime();
        long timeRes = end - start;

        long startB = System.nanoTime();
        list1.add();
        long endB = System.nanoTime();
        long timeAdd = endB - startB;

        long startC = System.nanoTime();
        list1.remove();
        long endC = System.nanoTime();
        long timeRemove = endC - startC;

        //array list times
        long startA = System.nanoTime();
        GArrayList array1 = new GArrayList(sortArray);
        model.addAttribute("listA", Arrays.toString(array1.sort()));
        long endA = System.nanoTime();
        long timeResA = endA - startA;

        long startE = System.nanoTime();
        array1.add();
        long endE = System.nanoTime();
        long timeAddA = endE - startE;

        long startD = System.nanoTime();
        array1.remove();
        long endD = System.nanoTime();
        long timeRemoveA = endD - startD;

        model.addAttribute("timeA", timeRes);
        model.addAttribute("timeB", timeAdd);
        model.addAttribute("timeC", timeRemove);
        model.addAttribute("timeD", timeResA);
        model.addAttribute("timeE", timeAddA);
        model.addAttribute("timeF", timeRemoveA);
        return "GautamMiniLab/GautamLinkedList";

    }
}
