package com.addressbook.service;

import com.addressbook.model.Person;
import com.addressbook.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService {

    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person){
        Person savedPerson = personRepository.save(person);
        return savedPerson;
    }
}
