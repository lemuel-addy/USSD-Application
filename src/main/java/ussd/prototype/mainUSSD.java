package ussd.prototype;
import com.google.gson.Gson;
import io.javalin.Javalin;
//import kong.unirest.json.JSONObject;

public class mainUSSD {


    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.post("/ussd/session/:sessionid/start", ctx -> {

            String sessionId = ctx.pathParam("sessionid");
            System.out.println(sessionId);
            String json = ctx.body();
            Gson gson = new Gson();
            RequestObject req = gson.fromJson(json,RequestObject.class);
            String msisdn = req.getMsisdn();
            int imsi = req.getImsi();
            String shortCode = req.getShortCode();
            String optional= req.getOptional();
            String ussdNodeId = req.getOptional();
            String text = req.getText();
            String networkName = req.getNetworkName();
            String countryName = req.getCountryName();
            System.out.printf("msisdn: %s\nimsi: %s\nshortCode: %s\noptional: %s\nussdNodeId: %s\ntext: %s\nnetworkName: %s\ncountryName: %s\n",msisdn,imsi,shortCode,optional,ussdNodeId,text,networkName,countryName);
            //System.out.println(msisdn);

            //////////

            ResponseObject restr = new ResponseObject();
            restr.setShouldClose(false);
            restr.setUssdMenu("Menu\n1) Transfer Money\n2) MoMoPay & Pay Bill\n3) Airtime & Bundles\n4) Allow Cash Out\n5) Financial Services\n6) My Wallet");
            restr.setResponseExitCode(200);
            restr.setResponseMessage("");

            ctx.header("content-type","application/json");
            ctx.result(gson.toJson(restr));
        });
        app.post("/ussd/session/:sessionid/response", ctx -> {
            Gson gson = new Gson();
            ResponseObject res = new ResponseObject();
            res.setShouldClose(false);
            res.setUssdMenu("Account info... ");
            res.setResponseExitCode(200);
            res.setResponseMessage("");

            ctx.header("content-type","application/json");
            ctx.result(gson.toJson(res));


        });
        app.post("/ussd/session/:sessionid/end", ctx -> {
            Gson gson = new Gson();
            ResponseObject rend = new ResponseObject();
            rend.setShouldClose(false);
            rend.setUssdMenu("Account info... ");
            rend.setResponseExitCode(200);
            rend.setResponseMessage("");

            ctx.header("content-type","application/json");
            ctx.result(gson.toJson(rend));
        });
    }
}

