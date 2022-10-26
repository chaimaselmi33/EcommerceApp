package com.ecommerce.demo.Controllers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.dao.ProductRepository;
import com.ecommerce.demo.models.Category;
import com.ecommerce.demo.models.Product;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepository productRepo;
	
<<<<<<< HEAD
	@GetMapping("/welcome")
	public String hello()
=======
	@GetMapping("/hello")
	public String welcome()
>>>>>>> main
	{
        return "hello world";
	}
	
	@GetMapping("/get-products")
	public List<Product> getProducts()
	{
        return productRepo.findAll();
	}

	@GetMapping("/get-product-id/{id}")
	public Product getProductById(@PathVariable int id)
	{
		return productRepo.findById(id).get();
	}
	
	@GetMapping("get-product-name/{name}")
	public Product getProductByName(@PathVariable String name)
	{
		return productRepo.findByProductNameIs(name);
	}
	
	@GetMapping("get-product-cat/{cat}")	
	public List<Product> getProductsByCategory(@PathVariable String cat)
	{
		List<Product> products = productRepo.findAll();
		List<Product> productsByCat = products.stream().filter(p -> p.getCategory().getCategoryName().equals(cat)).collect(Collectors.toList());
        return productsByCat;
	}
	@GetMapping("get-random-products")
	public List<Product> getRandomProducts(){
		List<Product> products = productRepo.findAll();
		List<Product> randomProducts =new ArrayList<>();

		Random rand = new Random();

		for (int i = 0; i < 4; i++) {
			int randomIndex = rand.nextInt(products.size());
		    Product p = products.get(randomIndex);
		    randomProducts.add(p);
		    }
		
		return randomProducts;
	}
	
}
