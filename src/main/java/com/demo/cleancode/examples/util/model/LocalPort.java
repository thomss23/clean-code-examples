package com.demo.cleancode.examples.util.model;

import com.demo.cleancode.examples.util.exception.ATM1212UnlockedException;
import com.demo.cleancode.examples.util.exception.DeviceResponseException;
import com.demo.cleancode.examples.util.exception.GMXError;
import com.demo.cleancode.examples.util.exception.PortDeviceFailure;

public class LocalPort {
    private ACMEPort innerPort;
    public LocalPort(int portNumber) {
        innerPort = new ACMEPort(portNumber);
    }
    public void open() {
        try {
            innerPort.open();
        } catch (DeviceResponseException e) {
            throw new PortDeviceFailure(e);
        } catch (ATM1212UnlockedException e) {
            throw new PortDeviceFailure(e);
        } catch (GMXError e) {
            throw new PortDeviceFailure(e);
        }
    }
}