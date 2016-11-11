package fr.lang;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thetransactioncompany.jsonrpc2.client.*;
import com.thetransactioncompany.jsonrpc2.*;
import net.minidev.json.*;
import java.net.*;


import java.util.*;

/**
 * Created by philippe on 11/11/2016.
 */
@RestController
public class ConsoInstantController {
    @RequestMapping("/instantane")
    public int GetConsoInstantane(){

        // The remote method to call
        String method = "makePayment";

        // The required named parameters to pass
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("recipient", "Penny Adams");
        params.put("amount", 175.05);

        // The mandatory request ID
        String id = "req-001";

        // Create a new JSON-RPC 2.0 request
        JSONRPC2Request reqOut = new JSONRPC2Request(method, params, id);

        // Serialise the request to a JSON-encoded string
        String jsonString = reqOut.toString();

        // jsonString can now be dispatched to the server...
        return 600;
    }
}
