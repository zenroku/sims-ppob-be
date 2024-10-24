package co.id.zahir.nutech.simsppob.core.exceptions;

import lombok.Getter;

@Getter
public class BadRequestException extends RuntimeException {
    private final int code;
    public BadRequestException(int code,String message) {
        super(message);
        this.code = code;
    }
}
