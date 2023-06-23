package com.demo.cleancode.examples.errorhandling.exceptionclasses;

import com.demo.cleancode.examples.util.exception.PortDeviceFailure;
import com.demo.cleancode.examples.util.model.ACMEPort;
import com.demo.cleancode.examples.util.model.LocalPort;

/**
 <strong>Wrappers like the one we defined for ACMEPort can be very useful.</strong>
 <br>
 In fact, wrapping third-party APIs is a best practice. When you wrap a third-party API, you minimize your
 dependencies upon it: You can choose to move to a different library in the future without
 much penalty. Wrapping also makes it easier to mock out third-party calls when you are
 testing your own code.
 <br>
 <br>
 One final advantage of wrapping is that you aren’t tied to a particular vendor’s API
 design choices. You can define an API that you feel comfortable with. In the preceding
 example, we defined a single exception type for port device failure and found that we
 could write much cleaner code
 **/
public class GoodExample {

    public void openConnection() {
        LocalPort port = new LocalPort(new ACMEPort(32));
        try {
            port.open();
        } catch (PortDeviceFailure e) {
            reportError(e);
            log(e.getMessage(), e);
        }
    }

    private void log(String message, PortDeviceFailure e) {
    }

    private void reportError(PortDeviceFailure e) {
    }
}
