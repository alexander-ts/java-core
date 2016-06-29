package main.java.com.alexander.JAXB;

import java.io.File;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



@SuppressWarnings("restriction")
public class JAXBExample {

	public static void main(String[] args) {

		Customer customer = new Customer();
		//Customer[] customers ={customer};
		customer.setId(100);
		customer.setName("My Name");
		customer.setAge(29);
		customer.setFirstName("FIrstNAme");
		customer.setLastName("LAstNAme");
		customer.setAddress("Kharkiv");
		/*Customer[] customers = new Customer[5];
		
		customers[0] = customer;
		customer.setCustomers(customers);*/

		
		
		
		
		try {

			File file = new File("C:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "utf-8");

			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
