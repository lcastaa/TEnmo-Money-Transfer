package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.exceptions.AccountExceptions.InvalidUserIdForAccountGetException;
import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.Transfer;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.List;

public interface AccountDao {

    Account getAccountByUserId(Integer userId);

    Account getAccountByUsername(String username);
}
