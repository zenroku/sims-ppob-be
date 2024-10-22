package co.id.zahir.nutech.simsppob.app.modules.transactions.model.data;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TransactionData {
    private String invoiceNumber;
    private String serviceCode;
    private String serviceName;
    private String transactionType;
    private BigDecimal totalAmount;
    private String createdOn;
}
