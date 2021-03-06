
package com.example.webclient.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductService", targetNamespace = "http://service.webservice.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.webclient.service.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://service.webservice.example.com/", className = "com.example.webclient.service.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://service.webservice.example.com/", className = "com.example.webclient.service.AddProductResponse")
    @Action(input = "http://service.webservice.example.com/ProductService/addProductRequest", output = "http://service.webservice.example.com/ProductService/addProductResponse")
    public Product addProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        Product arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.example.webclient.service.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listProducts", targetNamespace = "http://service.webservice.example.com/", className = "com.example.webclient.service.ListProducts")
    @ResponseWrapper(localName = "listProductsResponse", targetNamespace = "http://service.webservice.example.com/", className = "com.example.webclient.service.ListProductsResponse")
    @Action(input = "http://service.webservice.example.com/ProductService/listProductsRequest", output = "http://service.webservice.example.com/ProductService/listProductsResponse")
    public List<Product> listProducts();

}
