package com.nighthawk.csa.Minilab.sanvi.List;

import com.nighthawk.csa.Minilab.sanvi.List.LinkedListOps;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Arrays;

@Controller
public class ListController {

    @GetMapping("/SanviList")
    public String listops(
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
            @RequestParam(name = "listType", required = true, defaultValue = "Linked List") String listType
    ){

        String[] arrayToModify = {id0, id1, id2, id3, id4, id5, id6, id7, id8, id9};

        model.addAttribute("chosenList", listType);

        long start = System.nanoTime();

        if(listType.equals("Linked List")){
            LinkedListOps linkedListOps = new LinkedListOps(arrayToModify);
            model.addAttribute("finalArray", Arrays.toString(linkedListOps.modifyList()));
        } else if (listType.equals("Array List")){
            ArrayListOps arrayListOps = new ArrayListOps(arrayToModify);
            model.addAttribute("finalArray", Arrays.toString(arrayListOps.modifyList()));
        }

        long end = System.nanoTime();
        long time = end - start;

        model.addAttribute("time", time);
        return "SanviMinilab/SanviList";
    }
}
