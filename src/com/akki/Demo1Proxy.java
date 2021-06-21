package com.akki;

public class Demo1Proxy implements com.akki.Demo1 {
  private String _endpoint = null;
  private com.akki.Demo1 demo1 = null;
  
  public Demo1Proxy() {
    _initDemo1Proxy();
  }
  
  public Demo1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initDemo1Proxy();
  }
  
  private void _initDemo1Proxy() {
    try {
      demo1 = (new com.akki.Demo1ServiceLocator()).getDemo1();
      if (demo1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)demo1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)demo1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (demo1 != null)
      ((javax.xml.rpc.Stub)demo1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.akki.Demo1 getDemo1() {
    if (demo1 == null)
      _initDemo1Proxy();
    return demo1;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (demo1 == null)
      _initDemo1Proxy();
    return demo1.add(a, b);
  }
  
  public int delete(int c, int d) throws java.rmi.RemoteException{
    if (demo1 == null)
      _initDemo1Proxy();
    return demo1.delete(c, d);
  }
  
  
}