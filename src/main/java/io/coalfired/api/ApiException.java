package io.coalfired.api;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")
public class ApiException extends Exception {
    private final int code;

    public int getCode() {
        return code;
    }

    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}