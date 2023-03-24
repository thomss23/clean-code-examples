package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.util.service.FryingPanService;
import lombok.RequiredArgsConstructor;

/**
 * The Step-down Rule.
 * We want the code to read like a top-down narrative.
 * We want every function to be followed by those at the next level of abstraction so that we can read the program, descending one level of abstraction at a time as we read down the list of functions.
 * It implies that the function ordering is no longer random. A caller function should always reside above the callee function.
 **/
@RequiredArgsConstructor
public class TopDownNarrativeGood {

    private final FryingPanService fryingPanService;

    public void makeBreakfast() {
        addEggs();
        cook();
        serve();
    }

    private void addEggs() {
        System.out.println("Add eggs from the fridge");

    }

    private void cook() {
        fryingPanService.mixContents();
        fryingPanService.addCondiments();
        fryingPanService.mixContents();
    }

    private void serve() {
        System.out.println("Serve breakfast");
    }
}
