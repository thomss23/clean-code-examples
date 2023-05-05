package com.demo.cleancode.examples.functions;


import com.demo.cleancode.examples.util.model.WorkItem;

import java.util.List;

/**
 * Refactor a large loop by splitting it. This is a common refactoring technique of clean code that facilitates SRP principle
 * <br>
 * <br>
 * It won't affect performance nowadays, but depends, of course, of the logic inside the for loop (like doing some very expensive operation of calling the database or a million of iterations.
 * Also, consider the memory size, if you could keep all the items in memory.
 */
public class LoopsGood {

    public void processWorkItemsWithLoopSplit(List<WorkItem> workItems) {
        for (WorkItem workItem : workItems) {
            if (isCondition1Fulfilled(workItem)) {
                System.out.println("Some logic1 that is related with logic 2 and 3");
            }
            if (isCondition2Fulfilled(workItem)) {
                System.out.println("Some logic2 that is related with logic 1 and 3");
            }
            if (isCondition3Fulfilled(workItem)) {
                System.out.println("Some logic3 that is related with logic 1 and 2");
            }
        }

        for (WorkItem workItem : workItems) {
            if (isMyCustomConditionFulfilled(workItem)) {
                System.out.println("My custom logic that I need to add for a corner case bug fix unrelated with the other 1-5 conditions");
            }
        }

        for (WorkItem workItem : workItems) {
            if (isCondition4Fulfilled(workItem)) {
                System.out.println("Some logic4 that is related with logic 5");
            }
            if (isCondition5Fulfilled(workItem)) {
                System.out.println("Some logic5 that is related with logic 4");
            }
        }
    }

    /**
     * Further refactoring by extracting each loop in a separate private method
     */
    public void processWorkItemsWithLoopsExtracted(List<WorkItem> workItems) {
        processWorkItemsWithConditionSet123(workItems);
        processWorkItemsWithCustomCondition(workItems);
        processWorkItemsWithConditionSet45(workItems);
    }

    private void processWorkItemsWithConditionSet123(List<WorkItem> workItems) {
        for (WorkItem workItem : workItems) {
            if (isCondition1Fulfilled(workItem)) {
                System.out.println("Some logic1 that is related with logic 2 and 3");
            }
            if (isCondition2Fulfilled(workItem)) {
                System.out.println("Some logic2 that is related with logic 1 and 3");
            }
            if (isCondition3Fulfilled(workItem)) {
                System.out.println("Some logic3 that is related with logic 1 and 2");
            }
        }
    }

    private void processWorkItemsWithCustomCondition(List<WorkItem> workItems) {
        for (WorkItem workItem : workItems) {
            if (isMyCustomConditionFulfilled(workItem)) {
                System.out.println("My custom logic that I need to add for a corner case bug fix unrelated with the other 1-5 conditions");
            }
        }
    }

    private void processWorkItemsWithConditionSet45(List<WorkItem> workItems) {
        for (WorkItem workItem : workItems) {
            if (isCondition4Fulfilled(workItem)) {
                System.out.println("Some logic4 that is related with logic 5");
            }
            if (isCondition5Fulfilled(workItem)) {
                System.out.println("Some logic5 that is related with logic 4");
            }
        }
    }

    private boolean isCondition1Fulfilled(WorkItem workItem) {
        //implement logic for WorkItem check
        return false;
    }

    private boolean isCondition2Fulfilled(WorkItem workItem) {
        //implement logic for workItem check
        return false;
    }

    private boolean isCondition3Fulfilled(WorkItem workItem) {
        //implement logic for workItem check
        return false;
    }

    private boolean isMyCustomConditionFulfilled(WorkItem workItem) {
        //implement logic for WorkItem check
        return false;
    }

    private boolean isCondition4Fulfilled(WorkItem workItem) {
        //implement logic for WorkItem check
        return false;
    }

    private boolean isCondition5Fulfilled(WorkItem workItem) {
        //implement logic for WorkItem check
        return false;
    }
}
