package com.nighthawk.csa.Minilab.gautam.SortsString;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SSController {
    @GetMapping("/GautamStringSorts")
    public String sorter(
            @RequestParam(name = "id0", required = true, defaultValue = "0") String id0,
            @RequestParam(name = "id1", required = true, defaultValue = "0") String id1,
            @RequestParam(name = "id2", required = true, defaultValue = "0") String id2,
            @RequestParam(name = "id3", required = true, defaultValue = "0") String id3,
            @RequestParam(name = "id4", required = true, defaultValue = "0") String id4,
            @RequestParam(name = "id5", required = true, defaultValue = "0") String id5,
            @RequestParam(name = "id6", required = true, defaultValue = "0") String id6,
            Model model,
            @RequestParam(name = "sortType", required = true, defaultValue = "Bubble Sort") String sortType
    ){

        String[] sortingArray = {id0, id1, id2, id3, id4, id5, id6};

        model.addAttribute("sortA", sortType);

        long start = System.nanoTime();

        if (sortType.equals("Bubble Sort")){
            com.nighthawk.csa.Minilab.gautam.SortsString.Bubble bubbleSorter = new Bubble();
            model.addAttribute("finalArray", Arrays.toString(bubbleSorter.sortArr(sortingArray)));
        } else if (sortType.equals("Selection Sort")){
            com.nighthawk.csa.Minilab.gautam.SortsString.Selection selSorter = new Selection();
            model.addAttribute("finalArray", Arrays.toString(selSorter.sortArr(sortingArray)));
        } else if (sortType.equals("Insertion Sort")){
            com.nighthawk.csa.Minilab.gautam.SortsString.Insertion inSorter = new Insertion();
            model.addAttribute("finalArray", Arrays.toString(inSorter.sortArr(sortingArray)));
        } else {
            com.nighthawk.csa.Minilab.gautam.SortsString.Bubble defaultSorter = new Bubble();
            model.addAttribute("finalArray", Arrays.toString(defaultSorter.sortArr(sortingArray)));
        }

        long end = System.nanoTime();
        long time = end - start;

        model.addAttribute("time", time);
        return "GautamMiniLab/GautamStringSorts";
    }
}
