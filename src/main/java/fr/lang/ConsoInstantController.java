package fr.lang;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thetransactioncompany.jsonrpc2.client.*;
import com.thetransactioncompany.jsonrpc2.*;
import java.net.*;

import net.minidev.json.*;


import java.util.*;

/**
 * Created by philippe on 11/11/2016.
 */
@RestController
public class ConsoInstantController {

    private static String apikey = "1d5f3d24d9a9e286cc70123ee86e1e3e779f3e7c";
    private static String puissanceInstantaneeId = "334";
    private static String ConsoHistoriqueId = "354";

    private JSONObject callRpc(String methode,String cmdId){
        URL serverURL = null;

        try {
            serverURL = new URL("http://jeedom.maison.local/core/api/jeeApi.php");

        } catch (MalformedURLException e) {
            // handle exception...
        }
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("apikey", apikey);
        params.put("id",cmdId);

        String id = "req-001";


        JSONRPC2Session mySession = new JSONRPC2Session(serverURL);
        mySession.getOptions().setAllowedResponseContentTypes(new String[]{"text/html"});

        JSONRPC2Request request = new JSONRPC2Request("cmd::byId",params, id);
        JSONRPC2Response response = null;

        try {
            response = mySession.send(request);

        } catch (JSONRPC2SessionException e) {

            System.err.println(e.getMessage());
        }
       return (JSONObject)response.getResult();

    }

    @RequestMapping("/instantane")
    public Object GetConsoInstantane(){
        return callRpc("cmd::byId",puissanceInstantaneeId).get("currentValue");
    }

    @RequestMapping("/historique")
    public JSONObject GetConsoHistorique(){
        return callRpc("cmd::getStatistique",ConsoHistoriqueId);
    }
}
