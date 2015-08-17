
package com.rs;
import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ppp.Customer;

@Path("/oracle")
public class FirstRS {
    HashMap<Integer,Customer> map=new HashMap();
    public FirstRS(){
        map.put(1, new Customer("Sonia", "delhi", 65));
        map.put(2, new Customer("Rahul", "delhi", 35));
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/getText")
    public String getData(){
        return "Hello all from Rest WS";
    
    
    }
    @GET @Produces(MediaType.TEXT_XML)
    @Path("/getInXML")
    public Customer getCustXML(){
        return new Customer("Dilip Kumar","Lucknow",88);
    
    }
    @GET @Produces(MediaType.APPLICATION_JSON)
    @Path("/getJSON")
    public Customer getCustJSON(){
        return new Customer("Dilip Kumar","Lucknow",88);
    
    }
    
    @GET @Produces(MediaType.TEXT_XML)
    @Path("/congress/{pid}")
    public Customer getLeader(@PathParam("pid") int pid){
        return map.get(pid);
    
    }
    
}
