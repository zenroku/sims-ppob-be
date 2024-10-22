package co.id.zahir.nutech.simsppob.app.modules.transactions.model.data;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TransactionHistoryData {
    private String invoiceNumber;
    private String transactionType;
    private String description;
    private BigDecimal amount;
    private String createdOn;
}
