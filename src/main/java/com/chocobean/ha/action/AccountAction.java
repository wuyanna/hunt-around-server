package com.chocobean.ha.action;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.chocobean.ha.account.service.AccountService;
import com.chocobean.ha.common.AbstractAction;
import com.chocobean.ha.common.Result;
import com.chocobean.ha.common.Result.ResultStatus;
import com.chocobean.ha.common.SpringApplicationContext;

@Path("/account")
public class AccountAction extends AbstractAction {
	private static final String Tag = "AccountAction";

	private static AccountService accountService;

	static {
		try {
			accountService = (AccountService) SpringApplicationContext
					.getBean("accountService");
		} catch (Exception e) {
			log.error(String.format("%s", Tag, "init error"), e);
		}
	}
	
	

	@POST
	@Path("/register")
	public Response register(@FormParam("name") String name,
			@FormParam("email") String email, @FormParam("pwd") String pwd,
			@FormParam("sex") int sex) {
		Result result = null;
		try {
			result = accountService.login();
		} catch (Exception e) {
			log.error(String.format("%s:%s", Tag, "register error"), e);
			result = new Result(ResultStatus.RS_ERROR, SERVER_INNER_ERROR_MSG);
		}
		return Response.status(Status.OK).entity(result).build();
	}

	@POST
	@Path("/login")
	public Response login(@FormParam("mac") String mac,
			@FormParam("client_uuid") String clientUUID) {
		return Response.status(Status.OK).entity(mac + "-" + clientUUID)
				.build();
	}

}
