package com.demo.cleancode.examples.util.model;

import com.demo.cleancode.examples.util.exception.ATM1212UnlockedException;
import com.demo.cleancode.examples.util.exception.DeviceResponseException;
import com.demo.cleancode.examples.util.exception.GMXError;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ACMEPort {
    private int portNumber;

    public void open() {
        // Open the ACMEPort
        // Simulating some scenarios with custom exceptions
        if (portNumber == 12) {
            throw new DeviceResponseException("Error: Device response exception occurred.");
        } else if (portNumber == 21) {
            throw new ATM1212UnlockedException("Error: ATM1212 is locked and cannot be opened.");
        } else if (portNumber == 42) {
            throw new GMXError("Error: GMX error occurred.");
        } else {
            System.out.println("ACMEPort opened successfully.");
        }
    }
}
