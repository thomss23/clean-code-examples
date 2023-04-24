package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.util.service.FryingPanService;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class TopDownNarrativeBad {

    private final FryingPanService fryingPanService;

    private void serve() {
        System.out.println("Serve breakfast");
    }

    private void addEggs() {
        System.out.println("Add eggs from the fridge");
    }

    private void cook() {
        fryingPanService.mixContents();
        fryingPanService.addCondiments();
        fryingPanService.mixContents();
    }

    public void makeBreakfast() {
        addEggs();
        cook();
        serve();
    }
}
