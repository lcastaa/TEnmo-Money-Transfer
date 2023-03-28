package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.Transfer;

import javax.security.auth.login.AccountNotFoundException;
import java.util.List;

public interface TransferDao {

    Transfer getATransferByTransferId(Integer transferId);

    List<Transfer> getListOfSortedTransfersByUserId(Integer userId , Integer filter);
    void transferFactory(Transfer transfer);


}
