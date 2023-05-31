package com.contact.service;

import com.contact.entity.Contact;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(1L, "anil.cheela@gmail.com", "Anil", 9999L),
            new Contact(1L, "Modi2024@gmail.com", "Modi", 9999L),
            new Contact(1L, "Maqbool@gmail.com", "maqbool", 2222L),
            new Contact(1L, "shruti@gmail.com", "Shruti", 3333L),
            new Contact(1L, "akansha@gmail.com", "Akansha", 4444L)
    );
    @Override
    public List<Contact> getContactForUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
