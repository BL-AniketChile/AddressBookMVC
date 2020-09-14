package com.addressbook;

import com.addressbook.dao.AddressBookDAO;
import com.addressbook.model.Person;
import com.addressbook.service.AddressBookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@Controller
public class AddressBookController {

    @Autowired
    AddressBookDAO addressBookDAO;

    @Autowired
    private AddressBookService addressBookService;

    private static final Logger log = LoggerFactory.getLogger(AddressBookController.class);

    @RequestMapping("/")
    public String showWelcome() {
        return "welcome";
    }

    @RequestMapping("/addcontact")
    public String showAddContactForm(Model model){
        model.addAttribute("person", new Person());
        return "addcontact";
    }

    @RequestMapping("/findcontact")
    public String showFindContactForm(Model model){
        model.addAttribute("person", new Person());
        return "findcontact";
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public String addContact(@ModelAttribute("person") Person person){
//        addressBookDAO.addContact(person);
        log.info("Inside add contact"+person.getFirstName());
        addressBookService.savePerson(person);
        return "redirect:/";
    }

    @RequestMapping(value="/find",method = RequestMethod.POST)
    public String findContact(Person person,Model model){
        Person personByName = addressBookDAO.findPersonByName(person.getFirstName(), person.getLastName());
        System.out.println(personByName.toString());
        model.addAttribute("person", personByName);
        return "contactview";
    }

    @RequestMapping(value="/editcontact/{firstName}/{lastName}")
    public String editContactForm(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName, Model model){
        Person personByName = addressBookDAO.findPersonByName(firstName, lastName);
        model.addAttribute("person",personByName);
        return "editcontactform";
    }

    @RequestMapping(value="/edit",method = RequestMethod.POST)
    public String editContact(@ModelAttribute("person") Person person){
        addressBookDAO.updateContact(person);
        return "redirect:/";
    }

    @RequestMapping(value="/deletecontact/{firstName}/{lastName}")
    public String deleteContact(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        addressBookDAO.deleteContact(firstName, lastName);
        return "redirect:/";
    }

}
