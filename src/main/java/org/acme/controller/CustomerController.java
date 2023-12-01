package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.acme.model.Adm;
import org.acme.service.CustomerService;

import java.util.List;

@Path("/api/customer")
public class CustomerController {

    @Inject
    CustomerService customerService;

    @POST
    @Transactional
    public void addCustomer (Adm adm){
        customerService.addCustomer(adm);
    }
    @GET
    public Response retrieveCustomers () throws Exception {
        List<Adm> adms = customerService.findAllCustomers();
        return Response.ok(adms).build();
    }
}
