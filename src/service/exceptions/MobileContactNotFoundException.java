package service.exceptions;

import model.MobileContact;

public class MobileContactNotFoundException extends Exception {
    private final static long serialVersionUID = 1L;

    public MobileContactNotFoundException(MobileContact mobileContact) {
        super("The mobile contact with phone number " + mobileContact.getPhoneNumber() + " was not found");
    }

    public MobileContactNotFoundException(String phoneNummber) {
        super("The mobile contact with phone number " + phoneNummber + " was not found");
    }

    public MobileContactNotFoundException(long id) {
        super("The mobile contact with id " + id + " was not found");
    }
}
