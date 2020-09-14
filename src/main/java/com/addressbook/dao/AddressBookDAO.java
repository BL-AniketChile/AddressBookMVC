package com.addressbook.dao;

import com.addressbook.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AddressBookDAO {
    private List<Person> addressBook;

    public AddressBookDAO() {
        addressBook = new ArrayList<>();
    }

    public void addContact(Person person) {
        addressBook.add(person);
        System.out.println("Person Added: "+person.toString());
    }

    public Person findPersonByName(String firstName, String lastName){
        Optional<Person> newPerson=addressBook.stream().filter(person -> person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)).findFirst();
        return newPerson.orElse(null);
    }

    public void updateContact(Person person) {
        int index = addressBook.indexOf(person);
        addressBook.set(index, person);
        System.out.println("Person Updated");
    }

    public void deleteContact(String firstName, String lastName) {
        Person personByName = findPersonByName(firstName, lastName);
        if (personByName != null) {
            addressBook.remove(personByName);
            System.out.println("Person Deleted");
        }
    }
}
