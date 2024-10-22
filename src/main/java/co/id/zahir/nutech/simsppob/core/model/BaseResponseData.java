package co.id.zahir.nutech.simsppob.core.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponseData<T> extends BaseResponse {
    private T data;
}
