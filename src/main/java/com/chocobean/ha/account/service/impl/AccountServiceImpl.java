package com.chocobean.ha.account.service.impl;

import com.chocobean.ha.account.service.AccountService;
import com.chocobean.ha.account.service.dao.AccountDao;
import com.chocobean.ha.common.AbstractService;
import com.chocobean.ha.common.Message;
import com.chocobean.ha.common.Result;
import com.chocobean.ha.common.Result.ResultStatus;
import com.chocobean.ha.common.SpringApplicationContext;

/**
 * 
 * @author chris.liu
 * 
 */
public class AccountServiceImpl extends AbstractService implements
		AccountService {

	private static final String Tag = "AccountService";

	private static AccountDao accountDao;

	static {
		try {
			accountDao = (AccountDao) SpringApplicationContext
					.getBean("accountDao");
		} catch (Exception e) {
			log.error(String.format("%s:%s", Tag, "init error"), e);
		}
	}

	@Override
	public Result register() {
		return null;
	}

	@Override
	public Result login() {
		Result result = null;
		try {
			result = new Result(ResultStatus.RS_OK,
					new Message("login", "登陆测试"));
		} catch (Exception e) {
			log.error(String.format("%s:%s:%s", Tag, "login error"), e);
			result = new Result(ResultStatus.RS_ERROR, SERVER_INNER_ERROR_MSG);
		}
		return result;
	}

}
