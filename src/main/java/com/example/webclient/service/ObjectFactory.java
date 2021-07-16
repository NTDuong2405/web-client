
package com.example.webclient.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.webclient.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddProductResponse_QNAME = new QName("http://service.webservice.example.com/", "addProductResponse");
    private final static QName _AddProduct_QNAME = new QName("http://service.webservice.example.com/", "addProduct");
    private final static QName _ListProductsResponse_QNAME = new QName("http://service.webservice.example.com/", "listProductsResponse");
    private final static QName _ListProducts_QNAME = new QName("http://service.webservice.example.com/", "listProducts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.webclient.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link ListProductsResponse }
     * 
     */
    public ListProductsResponse createListProductsResponse() {
        return new ListProductsResponse();
    }

    /**
     * Create an instance of {@link ListProducts }
     * 
     */
    public ListProducts createListProducts() {
        return new ListProducts();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.example.com/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.example.com/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.example.com/", name = "listProductsResponse")
    public JAXBElement<ListProductsResponse> createListProductsResponse(ListProductsResponse value) {
        return new JAXBElement<ListProductsResponse>(_ListProductsResponse_QNAME, ListProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.example.com/", name = "listProducts")
    public JAXBElement<ListProducts> createListProducts(ListProducts value) {
        return new JAXBElement<ListProducts>(_ListProducts_QNAME, ListProducts.class, null, value);
    }

}
