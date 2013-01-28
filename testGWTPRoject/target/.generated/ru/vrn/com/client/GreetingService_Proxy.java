package ru.vrn.com.client;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;

public class GreetingService_Proxy extends RemoteServiceProxy implements ru.vrn.com.client.GreetingServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "ru.vrn.com.client.GreetingService";
  private static final String SERIALIZATION_POLICY ="BB5F5E8BBA45D3FC6D1A7EDF4210FC9A";
  private static final ru.vrn.com.client.GreetingService_TypeSerializer SERIALIZER = new ru.vrn.com.client.GreetingService_TypeSerializer();
  
  public GreetingService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "ecm/productService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void greetServer(java.lang.String input, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("GreetingService_Proxy.greetServer", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("greetServer");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(input);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("GreetingService_Proxy.greetServer", requestId, "requestSerialized"));
      doInvoke(ResponseReader.STRING, "GreetingService_Proxy.greetServer", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void setStr(java.lang.String str, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("GreetingService_Proxy.setStr", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("setStr");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(str);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("GreetingService_Proxy.setStr", requestId, "requestSerialized"));
      doInvoke(ResponseReader.VOID, "GreetingService_Proxy.setStr", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
