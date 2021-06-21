/**
 * Demo1ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.akki;

public class Demo1ServiceLocator extends org.apache.axis.client.Service implements com.akki.Demo1Service {

    public Demo1ServiceLocator() {
    }


    public Demo1ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Demo1ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Demo1
    private java.lang.String Demo1_address = "http://localhost:1010/Axis1Demo/services/Demo1";

    public java.lang.String getDemo1Address() {
        return Demo1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Demo1WSDDServiceName = "Demo1";

    public java.lang.String getDemo1WSDDServiceName() {
        return Demo1WSDDServiceName;
    }

    public void setDemo1WSDDServiceName(java.lang.String name) {
        Demo1WSDDServiceName = name;
    }

    public com.akki.Demo1 getDemo1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Demo1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDemo1(endpoint);
    }

    public com.akki.Demo1 getDemo1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.akki.Demo1SoapBindingStub _stub = new com.akki.Demo1SoapBindingStub(portAddress, this);
            _stub.setPortName(getDemo1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDemo1EndpointAddress(java.lang.String address) {
        Demo1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.akki.Demo1.class.isAssignableFrom(serviceEndpointInterface)) {
                com.akki.Demo1SoapBindingStub _stub = new com.akki.Demo1SoapBindingStub(new java.net.URL(Demo1_address), this);
                _stub.setPortName(getDemo1WSDDServiceName());
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
        if ("Demo1".equals(inputPortName)) {
            return getDemo1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://akki.com", "Demo1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://akki.com", "Demo1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Demo1".equals(portName)) {
            setDemo1EndpointAddress(address);
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
