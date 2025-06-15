package io.coalfired.api;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-05-22T16:36:15.642271455Z[GMT]")
public class NotFoundException extends ApiException {
    private final int code;

    @Override
    public int getCode() {
        return code;
    }

    public NotFoundException(int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
