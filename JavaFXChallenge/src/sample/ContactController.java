package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import sample.datamodel.Contact;

public class ContactController {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField notesField;
    @FXML
    private TableView<Contact> contactsTable;

    public Contact getNewContact() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String notes = notesField.getText();

        Contact newContact = new Contact(firstName, lastName, phoneNumber, notes);
        return newContact;
    }

    public void updateContacts(Contact contact) {
        contact.setFirstName(firstNameField.getText());
        contact.setLastName(lastNameField.getText());
        contact.setPhoneNumber(phoneNumberField.getText());
        contact.setNotes(notesField.getText());

    }


    public void editContact(Contact contact) {
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        phoneNumberField.setText(contact.getPhoneNumber());
        notesField.setText(contact.getNotes());
    }
}
