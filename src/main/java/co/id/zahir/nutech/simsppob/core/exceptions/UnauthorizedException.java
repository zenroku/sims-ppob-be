package co.id.zahir.nutech.simsppob.core.exceptions;

import lombok.Getter;

@Getter
public class UnauthorizedException extends RuntimeException{
    private final int code;
    public UnauthorizedException(int code,String message){
        super(message);
        this.code = code;
    }
}
