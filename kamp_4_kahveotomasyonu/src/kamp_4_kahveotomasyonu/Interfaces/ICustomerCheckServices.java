package kamp_4_kahveotomasyonu.Interfaces;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerCheckServices {
	boolean CheckIfRealPerson(Customer customer);


}
