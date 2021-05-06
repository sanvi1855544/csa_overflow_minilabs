package com.nighthawk.csa.Minilab.gautam.SortsPOJO;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@org.springframework.stereotype.Controller
public class SPOJOController {
    @GetMapping("/GautamPOJOSort")
    public String sorter(
            @RequestParam(name = "id0", required = true, defaultValue = "0") String id0,
            @RequestParam(name = "id1", required = true, defaultValue = "0") String id1,
            @RequestParam(name = "id2", required = true, defaultValue = "0") String id2,
            @RequestParam(name = "id3", required = true, defaultValue = "0") String id3,
            @RequestParam(name = "id4", required = true, defaultValue = "0") String id4,
            @RequestParam(name = "id5", required = true, defaultValue = "0") String id5,
            @RequestParam(name = "id6", required = true, defaultValue = "0") String id6,
            Model model,
            @RequestParam(name = "sortType", required = true, defaultValue = "Sort - Bubble") String sortType
    ){

        NameG[] sortingArray =   {new NameG(id0),
                                new NameG(id1),
                                new NameG(id2),
                                new NameG(id3),
                                new NameG(id4),
                                new NameG(id5),
                                new NameG(id6)};

        model.addAttribute("sortA", sortType);

        long start = System.nanoTime();

        if(sortType.equals("Sort - Bubble")){
            com.nighthawk.csa.Minilab.gautam.SortsPOJO.Bubble bubbleSorter = new Bubble();
            model.addAttribute("finalArray", Arrays.toString(bubbleSorter.sortArr(sortingArray)));
        } else if (sortType.equals("Sort - Selection")){
            com.nighthawk.csa.Minilab.gautam.SortsPOJO.Selection selSorter = new Selection();
            model.addAttribute("finalArray", Arrays.toString(selSorter.sortArr(sortingArray)));
        } else if (sortType.equals("Sort - Insertion")){
            com.nighthawk.csa.Minilab.gautam.SortsPOJO.Insertion inSorter = new Insertion();
            model.addAttribute("finalArray", Arrays.toString(inSorter.sortArr(sortingArray)));
        } else {
            com.nighthawk.csa.Minilab.gautam.SortsPOJO.Bubble defaultSorter = new Bubble();
            model.addAttribute("finalArray", Arrays.toString(defaultSorter.sortArr(sortingArray)));
        }

        long end = System.nanoTime();
        long time = end - start;

        model.addAttribute("time", time);
        return "GautamMiniLab/GautamPOJOSort";
    }
}
