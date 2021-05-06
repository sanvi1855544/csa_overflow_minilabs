package com.nighthawk.csa.Minilab.gautam.SortsInt;

import java.util.Arrays;

import com.nighthawk.csa.Minilab.gautam.SortsInt.Bubble;
import com.nighthawk.csa.Minilab.gautam.SortsInt.Insertion;
import com.nighthawk.csa.Minilab.gautam.SortsInt.Selection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SIController {
    @GetMapping("/GautamIntSort")
    public String sorter(
            @RequestParam(name = "id0", required = true, defaultValue = "0") Integer id0,
            @RequestParam(name = "id1", required = true, defaultValue = "0") Integer id1,
            @RequestParam(name = "id2", required = true, defaultValue = "0") Integer id2,
            @RequestParam(name = "id3", required = true, defaultValue = "0") Integer id3,
            @RequestParam(name = "id4", required = true, defaultValue = "0") Integer id4,
            @RequestParam(name = "id5", required = true, defaultValue = "0") Integer id5,
            @RequestParam(name = "id6", required = true, defaultValue = "0") Integer id6,
            Model model,
            @RequestParam(name = "sortType", required = true, defaultValue = "Sort - Bubble") String sortType
    ){

        int[] arrayToSort = {id0, id1, id2, id3, id4, id5, id6};

        model.addAttribute("sortA", sortType);

        long start = System.nanoTime();

        if(sortType.equals("Sort - Bubble")){
            com.nighthawk.csa.Minilab.gautam.SortsInt.Bubble bubbleSorter = new Bubble();
            model.addAttribute("final", Arrays.toString(bubbleSorter.sortBubble(arrayToSort)));
        } else if (sortType.equals("Sort - Selection")){
            com.nighthawk.csa.Minilab.gautam.SortsInt.Selection selSorter = new Selection();
            model.addAttribute("final", Arrays.toString(selSorter.sortSelection(arrayToSort)));
        } else if (sortType.equals("Sort - Insertion")){
            com.nighthawk.csa.Minilab.gautam.SortsInt.Insertion inSorter = new Insertion();
            model.addAttribute("final", Arrays.toString(inSorter.sortInsertion(arrayToSort)));
        }

        long end = System.nanoTime();
        long time = end - start;

        model.addAttribute("time", time);
        return "GautamMiniLab/GautamIntSort";
    }
}
