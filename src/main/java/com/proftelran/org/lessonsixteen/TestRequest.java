package com.proftelran.org.lessonsixteen;

import java.util.function.Function;

public class TestRequest {

    public static void main(String[] args) {
        Request request = new Request("Hello", 545);

        // Message is : 'message' , number is : 'number'

        Function<Request, String> function = (rq) -> "Message is : " + rq.getMessage()
                + " , number is :" + rq.getNumber();

        String result = function.apply(request);
        System.out.println(result);

        RequestHandler requestHandler = new RequestHandler();
        String resultRequest = requestHandler.apply(request);
        System.out.println(resultRequest);

    }


}
