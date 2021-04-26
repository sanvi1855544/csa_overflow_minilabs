package com.nighthawk.csa.Minilab.sanvi.SortsPOJO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Arrays;

@Controller
public class SortsPOJOController {

    @GetMapping("/SanviSortsPOJO")
    public String sorter(
            @RequestParam(name = "id0", required = true, defaultValue = "0") String id0,
            @RequestParam(name = "id1", required = true, defaultValue = "0") String id1,
            @RequestParam(name = "id2", required = true, defaultValue = "0") String id2,
            @RequestParam(name = "id3", required = true, defaultValue = "0") String id3,
            @RequestParam(name = "id4", required = true, defaultValue = "0") String id4,
            @RequestParam(name = "id5", required = true, defaultValue = "0") String id5,
            @RequestParam(name = "id6", required = true, defaultValue = "0") String id6,
            @RequestParam(name = "id7", required = true, defaultValue = "0") String id7,
            @RequestParam(name = "id8", required = true, defaultValue = "0") String id8,
            @RequestParam(name = "id9", required = true, defaultValue = "0") String id9,
            Model model,
            @RequestParam(name = "sortType", required = true, defaultValue = "Bubble Sort") String sortType
    ){

        Name[] arrayToSort =   {new Name(id0),
                                new Name(id1),
                                new Name(id2),
                                new Name(id3),
                                new Name(id4),
                                new Name(id5),
                                new Name(id6),
                                new Name(id7),
                                new Name(id8),
                                new Name(id9)};

        model.addAttribute("chosenSort", sortType);

        long start = System.nanoTime();

        if(sortType.equals("Bubble Sort")){
            Bubble bubbleSorter = new Bubble();
            model.addAttribute("finalArray", Arrays.toString(bubbleSorter.sortArr(arrayToSort)));
        } else if (sortType.equals("Selection Sort")){
            Selection selSorter = new Selection();
            model.addAttribute("finalArray", Arrays.toString(selSorter.sortArr(arrayToSort)));
        } else if (sortType.equals("Insertion Sort")){
            Insertion inSorter = new Insertion();
            model.addAttribute("finalArray", Arrays.toString(inSorter.sortArr(arrayToSort)));
        }

        long end = System.nanoTime();
        long time = end - start;

        model.addAttribute("time", time);
        return "SanviMinilab/SanviSortsPOJO";
    }
}
