package edu.csc131.FlightPlan;

public class NotValidAddressException extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public NotValidAddressException(String errorMessage) {
        super(errorMessage);
    }
    
}
