package com.github.lauyh.javaeerestapi.resources;

import com.github.lauyh.javaeerestapi.ejb.client.ProductRepository;
import com.github.lauyh.javaeerestapi.model.HttpResponse;
import com.github.lauyh.javaeerestapi.model.Person;
import com.github.lauyh.javaeerestapi.model.Product;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.logging.Level;
import java.util.logging.Logger;

@Path("/product")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

    @EJB
    private ProductRepository productRepository;

    final Logger logger = Logger.getLogger(ProductResource.class.getName());

    @GET
    @Path("/getProductInfo")
    public HttpResponse<Product> getProduct(){
        Product product = productRepository.getProduct();
        HttpResponse<Product> res = new HttpResponse<>();
        res.setErrorCode("0");
        res.setStatusCode(200);
        res.setErrorMessage("");
        res.setData(product);
//        logger.log(Level.INFO,"response --> {}", res);
        logger.log(Level.INFO,"> end of getUserInfo");
        return res;
    }
}
