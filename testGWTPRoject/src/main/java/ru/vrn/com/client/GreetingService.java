package ru.vrn.com.client;

import ru.vrn.com.server.DaoCustomerSupport;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("ecm/productService")
public interface GreetingService extends RemoteService {
	
	String greetServer(String name) throws IllegalArgumentException;
//	void setDaoCustomerSupport(DaoCustomerSupport daoCustomerSupport);
	void setStr(String str);
}
