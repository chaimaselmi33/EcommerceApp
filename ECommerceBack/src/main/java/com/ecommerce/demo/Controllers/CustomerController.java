package com.ecommerce.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.dao.CustomerRepository;
import com.ecommerce.demo.models.Customer;

<<<<<<< HEAD
@CrossOrigin( origins="*")
@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerRepository custRepo;
	
	@PostMapping("/add-customer")
	Customer addCustomer( @RequestBody Customer c) {
		return custRepo.save(c);
	}
=======
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerRepository customerRepo;

	@PostMapping("/add-customer")
	Customer saveCustomer(@RequestBody Customer c)
	{
		return customerRepo.save(c);
	}
	
>>>>>>> main
}
