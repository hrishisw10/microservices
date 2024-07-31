package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> contactList = List.of(
            new Contact(1L, "hrishisw@gmail.com", "Hrishi", 1311L),
            new Contact(2L, "ram@gmail.com", "Ram", 1311L),
            new Contact(3L, "ravi@gmail.com", "Ravi", 1312L),
            new Contact(4L, "modi@gmail.com", "Modi", 1313L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long id) {
        return contactList.stream().filter(contact -> contact.getUserId().equals(id)).collect(Collectors.toList());
    }
}
