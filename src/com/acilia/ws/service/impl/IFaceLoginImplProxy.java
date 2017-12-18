package com.acilia.ws.service.impl;

public class IFaceLoginImplProxy implements com.acilia.ws.service.impl.IFaceLoginImpl {
  private String _endpoint = null;
  private com.acilia.ws.service.impl.IFaceLoginImpl iFaceLoginImpl = null;
  
  public IFaceLoginImplProxy() {
    _initIFaceLoginImplProxy();
  }
  
  public IFaceLoginImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initIFaceLoginImplProxy();
  }
  
  private void _initIFaceLoginImplProxy() {
    try {
      iFaceLoginImpl = (new com.acilia.ws.service.impl.IFaceLoginImplServiceLocator()).getIFaceLoginImpl();
      if (iFaceLoginImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iFaceLoginImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iFaceLoginImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iFaceLoginImpl != null)
      ((javax.xml.rpc.Stub)iFaceLoginImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.acilia.ws.service.impl.IFaceLoginImpl getIFaceLoginImpl() {
    if (iFaceLoginImpl == null)
      _initIFaceLoginImplProxy();
    return iFaceLoginImpl;
  }
  
  public com.acilia.ws.bean.BeanLogin validaLogin(com.acilia.ws.bean.BeanLogin beanlogin) throws java.rmi.RemoteException{
    if (iFaceLoginImpl == null)
      _initIFaceLoginImplProxy();
    return iFaceLoginImpl.validaLogin(beanlogin);
  }
  
  
}