package co.id.zahir.nutech.simsppob.core.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PaginationDataResponse<T> {
    Integer limit;
    Integer offset;
    List<T> data;
}
