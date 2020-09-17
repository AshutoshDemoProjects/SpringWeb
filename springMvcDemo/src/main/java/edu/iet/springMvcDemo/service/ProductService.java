package edu.iet.springMvcDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.iet.springMvcDemo.bean.Product;

@Service
public class ProductService {
	private List<Product> pList=new ArrayList<>();
	public ProductService(){
		pList.add(new Product("Camera","Sony","https://cdn1.smartprix.com/rx-iC6oHGD01-w240-h290/sony-alpha-6600-24-2.webp",75000));
		pList.add(new Product("Mobile","Apple","https://www.costco.co.uk/medias/sys_master/images/hfd/hec/15603032686622.jpg",95000));
		pList.add(new Product("Mobile","SAMSUNG","http://5.imimg.com/data5/NT/UC/WR/SELLER-82975943/samsung-galaxy-a7-a750-mobile-phone-500x500.jpg",45000));
	}
	public List<Product> getAllProduct(){
		return pList;
	}
}
