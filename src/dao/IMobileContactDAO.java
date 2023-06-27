package dao;

import model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(long id, MobileContact mobileContact);
    void delete(String phoneNumber);
    void delete(long id);
    MobileContact get(long id);
    MobileContact get(String phoneNumber);
    List<MobileContact> getAll();
    boolean phoneNumberExists(String phoneNumber);
    boolean userIdExists(long id);
}
