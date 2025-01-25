/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme.Resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import org.acme.Services.LabSeqService;

/**
 *
 * @author kalebe
 */

@Path("/labseq")
public class LabSeqResource {
    
    LabSeqService labSeqServ = new LabSeqService();
    
    @Path("/{n}")
    @GET
    @Produces("application/json")
    public Response getLabSeq(@PathParam("n") int n) {
        if(n < 0) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        } else {
            return Response.ok(labSeqServ.labSeqCalc(n)).build();
        }
    }
}
