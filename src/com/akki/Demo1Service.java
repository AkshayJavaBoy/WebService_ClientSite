/**
 * Demo1Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.akki;

public interface Demo1Service extends javax.xml.rpc.Service {
    public java.lang.String getDemo1Address();

    public com.akki.Demo1 getDemo1() throws javax.xml.rpc.ServiceException;

    public com.akki.Demo1 getDemo1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
