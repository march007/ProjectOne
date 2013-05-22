package ru.vrn.com.client;

import ru.vrn.com.shared.model.UsersAD;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;

	void get(int i, AsyncCallback<Void> callback);
}
