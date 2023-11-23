package com.proftelran.org.lessonsixteen;

import java.util.function.Function;

public class RequestHandler implements Function<Request, String> {

    @Override
    public String apply(Request request) {
        return String.format("Message is : %s , number is : %d",
                request.getMessage(),
                request.getNumber());
    }
}
