package service;

import dto.MobileContactDTO;
import model.MobileContact;
import service.exceptions.MobileContactNotFoundException;
import service.exceptions.PhoneNumberAlreadyExistsException;
import service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public interface IMobileContactService {
    MobileContact insertMobileContact(MobileContactDTO contactDTO)
            throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

    MobileContact updateMobileContact(long id, MobileContactDTO contactDTO)
            throws MobileContactNotFoundException, PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

    void deleteMobileContactByPhoneNumber(String phoneNumber) throws MobileContactNotFoundException;

    void deleteMobileContactById(long id) throws MobileContactNotFoundException;

    MobileContact getContact(String phoneNumber) throws MobileContactNotFoundException;

    MobileContact getMobileContact(long id) throws MobileContactNotFoundException;

    List<MobileContact> getAllMobileContacts();
}
