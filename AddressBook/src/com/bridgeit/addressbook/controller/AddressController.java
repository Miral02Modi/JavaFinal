package com.bridgeit.addressbook.controller;

import com.bridgeit.addressbook.service.AddressBookInter;
import com.bridgeit.addressbook.service.AddressImple;
import com.bridgeit.addressbook.testApp.AddressBook;

public class AddressController {

	AddressBookInter adbook = new AddressImple();

	public void addPerson() {
		adbook.addPerson();
	}

	public void getFullName() {
		adbook.getFullName();
	}

	public void removePerson(int index) {
		adbook.removePerson(index);
	}

	public void updatePerson() {
		adbook.updatePerson();
	}

	public void sortByName() {
		adbook.sortByName();
	}

	public void sortByZipcode() {
		adbook.sortByZipcode();
	}

	public void display() {
		adbook.display();
	}
	
	public void display(String name){
		adbook.display(name);
	}
	public void fileWriter() {
		adbook.fileWriter();
	}
	public void fileReader(){
		adbook.fileReader();
	}

}
