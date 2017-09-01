package com.cdk.hw.controller;

import com.cdk.hw.model.Product;
import com.cdk.hw.model.Shopkeeper;
import com.cdk.hw.repository.ProductRepository;
import com.cdk.hw.repository.ShopkeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopkeeper")
public class ShopkeeperController {

    @Autowired
    private ShopkeeperRepository shopkeeperRepository;

    @RequestMapping("/add/{id}/{name}/{password}/{location}")
    public Shopkeeper createShopkeeper(@PathVariable int id, @PathVariable String name, @PathVariable String password,@PathVariable String location){


       Shopkeeper shopkeeper= new Shopkeeper(id,name,password,location);
        System.out.println(shopkeeper);
        shopkeeperRepository.saveAndFlush(shopkeeper);
        return shopkeeper;
    }

/*

    @RequestMapping("/delete/{customerId}")
    public void deleteCustomer(@PathVariable int customerId){
        customerRepository.delete(customerRepository.findOne(customerId));
    }



    @RequestMapping("/all")
    public List<Customer> getCustomer(){
        return customerRepository.findAll();
    }

*/

}
