package co.id.zahir.nutech.simsppob.app.modules.transactions.controller.impl;

import co.id.zahir.nutech.simsppob.app.modules.transactions.controller.TransactionController;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.data.BalanceData;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.data.TransactionData;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.data.TransactionHistoryData;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.dto.TopUpDto;
import co.id.zahir.nutech.simsppob.app.modules.transactions.model.dto.TransactionDto;
import co.id.zahir.nutech.simsppob.app.modules.transactions.service.TransactionService;
import co.id.zahir.nutech.simsppob.core.model.BaseResponseData;
import co.id.zahir.nutech.simsppob.core.model.PaginationDataResponse;
import co.id.zahir.nutech.simsppob.core.model.PaginationParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TransactionControllerImpl implements TransactionController {
    private final TransactionService transactionService;
    @Override
    @GetMapping("/balance")
    public BaseResponseData<BalanceData> balance() {
        return transactionService.balance();
    }

    @Override
    @PostMapping("/topup")
    public BaseResponseData<BalanceData> topUp(TopUpDto body) {
        return transactionService.topUp(body);
    }

    @Override
    @PostMapping("transaction")
    public BaseResponseData<TransactionData> transaction(TransactionDto body) {
        return transactionService.transaction(body);
    }

    @Override
    @GetMapping("transaction/history")
    public BaseResponseData<PaginationDataResponse<TransactionHistoryData>> transactionHistory(@ModelAttribute PaginationParam param) {
        return transactionService.transactionHistory(param);
    }
}
