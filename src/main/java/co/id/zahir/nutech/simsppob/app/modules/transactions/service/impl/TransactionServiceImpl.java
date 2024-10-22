package co.id.zahir.nutech.simsppob.app.modules.transactions.service.impl;

import co.id.zahir.nutech.simsppob.app.modules.transactions.model.data.BalanceData;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.data.TransactionData;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.data.TransactionHistoryData;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.dto.TopUpDto;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.dto.TransactionDto;
import co.id.zahir.nutech.simsppob.app.modules.transactions.service.TransactionService;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;
import co.id.zahir.nutech.simsppob.core.model.PaginationDataResponse;
import co.id.zahir.nutech.simsppob.core.model.PaginationParam;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Override
    public BaseResponseData<BalanceData> balance() {
        return null;
    }

    @Override
    public BaseResponseData<BalanceData> topUp(TopUpDto body) {
        return null;
    }

    @Override
    public BaseResponseData<TransactionData> transaction(TransactionDto body) {
        return null;
    }

    @Override
    public BaseResponseData<PaginationDataResponse<TransactionHistoryData>> transactionHistory(PaginationParam param) {
        return null;
    }
}
