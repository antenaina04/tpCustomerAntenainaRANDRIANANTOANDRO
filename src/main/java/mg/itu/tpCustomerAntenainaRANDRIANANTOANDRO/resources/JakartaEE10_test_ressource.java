/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tpCustomerAntenainaRANDRIANANTOANDRO.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Antenaina
 */
@Path("test")

public class JakartaEE10_test_ressource {
    @GET
    public Response test(){
        return Response
                .ok("test Jakarta EE")
                .build();
    }
}
