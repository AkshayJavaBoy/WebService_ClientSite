package com.akki;

public class ClientR {

	public static void main(String[] args) throws Exception
	{
		java.net.URL url= new java.net.URL("http://localhost:1010/Axis1Demo/services/Demo1?wsdl");
		org.apache.axis.client.Service service=new org.apache.axis.client.Service();
		Demo1SoapBindingStub stub=new Demo1SoapBindingStub(url,service);
		int result =stub.add(10, 20);
		System.out.println(result);
		int result2=stub.delete(40, 20);
		System.out.println(result2);
	}

}
