package co.id.zahir.nutech.simsppob.app.modules.transactions.service;

import co.id.zahir.nutech.simsppob.app.modules.transactions.model.data.BalanceData;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.data.TransactionData;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.data.TransactionHistoryData;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.dto.TopUpDto;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.dto.TransactionDto;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;
import co.id.zahir.nutech.simsppob.core.model.PaginationDataResponse;
import co.id.zahir.nutech.simsppob.core.model.PaginationParam;

public interface TransactionService {
    BaseResponseData<BalanceData> balance();
    BaseResponseData<BalanceData> topUp(TopUpDto body);
    BaseResponseData<TransactionData> transaction(TransactionDto body);
    BaseResponseData<PaginationDataResponse<TransactionHistoryData>> transactionHistory(PaginationParam param);
}
