package com.armchairbitcoinist.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
// import com.sun.tools.sjavac.server.RequestHandler;

import java.util.Collections;

public class LambdaJavaAPI implements RequestHandler<Object, GatewayResponse> {
    @Override
    public GatewayResponse handleRequest(Object o, Context context) {

        String message = "Welcome to Java-Version ArmchairBitcoinist";
        System.out.println(message);

        GatewayResponse response = new GatewayResponse(
                message,
                200,
                Collections.singletonMap("X-Powered-By", "ArmchairBitcoinist"),
                false
        );
        return response;
    }
}
