/**
 * IFaceLoginImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.acilia.ws.service.impl;

public class IFaceLoginImplServiceLocator extends org.apache.axis.client.Service implements com.acilia.ws.service.impl.IFaceLoginImplService {

    public IFaceLoginImplServiceLocator() {
    }


    public IFaceLoginImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IFaceLoginImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IFaceLoginImpl
    private java.lang.String IFaceLoginImpl_address = "http://localhost:8080/ValidaCredenciales/services/IFaceLoginImpl";

    public java.lang.String getIFaceLoginImplAddress() {
        return IFaceLoginImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IFaceLoginImplWSDDServiceName = "IFaceLoginImpl";

    public java.lang.String getIFaceLoginImplWSDDServiceName() {
        return IFaceLoginImplWSDDServiceName;
    }

    public void setIFaceLoginImplWSDDServiceName(java.lang.String name) {
        IFaceLoginImplWSDDServiceName = name;
    }

    public com.acilia.ws.service.impl.IFaceLoginImpl getIFaceLoginImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IFaceLoginImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIFaceLoginImpl(endpoint);
    }

    public com.acilia.ws.service.impl.IFaceLoginImpl getIFaceLoginImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.acilia.ws.service.impl.IFaceLoginImplSoapBindingStub _stub = new com.acilia.ws.service.impl.IFaceLoginImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getIFaceLoginImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIFaceLoginImplEndpointAddress(java.lang.String address) {
        IFaceLoginImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.acilia.ws.service.impl.IFaceLoginImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.acilia.ws.service.impl.IFaceLoginImplSoapBindingStub _stub = new com.acilia.ws.service.impl.IFaceLoginImplSoapBindingStub(new java.net.URL(IFaceLoginImpl_address), this);
                _stub.setPortName(getIFaceLoginImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IFaceLoginImpl".equals(inputPortName)) {
            return getIFaceLoginImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.ws.acilia.com", "IFaceLoginImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.ws.acilia.com", "IFaceLoginImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IFaceLoginImpl".equals(portName)) {
            setIFaceLoginImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
