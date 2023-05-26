package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.util.model.WorkItem;

import java.util.List;

public class LoopsBad {

    /**
     * This FOR loop is large and hard to maintain / test. It has at least 3 responsibilities for each group of conditions checked.
     * <br>
     * When you need to add another custom check, the ifs will continue to grow
     *
     */
    public void processWorkItemsBad(List<WorkItem> workItems) {
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

            if (isMyCustomConditionFulfilled(workItem)) {
                System.out.println("My custom logic in depth embedded that I need to add for a corner case bug fix unrelated with the other 1-5 conditions");
            }


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
