package com.demo.cleancode.examples.errorhandling.exceptionclasses;

import com.demo.cleancode.examples.util.exception.ATM1212UnlockedException;
import com.demo.cleancode.examples.util.exception.DeviceResponseException;
import com.demo.cleancode.examples.util.exception.GMXError;
import com.demo.cleancode.examples.util.model.ACMEPort;


/**
 <strong>That statement contains a lot of duplication, and we shouldn’t be surprised.</strong>
 <br>
 In most exception handling situations, the work that we do is relatively standard regardless of the
 actual cause. We have to record an error and make sure that we can proceed.
 <br>
 <br>
 In this case, because we know that the work that we are doing is roughly the same
 regardless of the exception, we can simplify our code considerably by wrapping the API
 that we are calling and making sure that it returns a common exception type:
 **/
public class BadExample {
    public void openConnection() {
        ACMEPort port = new ACMEPort(12);
        try {
            port.open();
        } catch (DeviceResponseException e) {
            reportPortError(e);
            log("Device response exception", e);
        } catch (ATM1212UnlockedException e) {
            reportPortError(e);
            log("Unlock exception", e);
        } catch (GMXError e) {
            reportPortError(e);
            log("Device response exception", e);
        }
    }

    private void log(String message, RuntimeException e) {
    }

    private void reportPortError(RuntimeException e) {

    }
}
