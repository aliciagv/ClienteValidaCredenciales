package com.acilia.ws.client;

import java.rmi.RemoteException;

import com.acilia.ws.bean.BeanLogin;
import com.acilia.ws.service.impl.IFaceLoginImpl;
import com.acilia.ws.service.impl.IFaceLoginImplProxy;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFaceLoginImpl iface = 	new IFaceLoginImplProxy("http://localhost:8080/ValidaCredenciales/services/IFaceLoginImpl");
		BeanLogin bean = new BeanLogin();
		bean.setUsuario("Alex");
		bean.setPassword("Alex");
		try {
			BeanLogin beanresult=iface.validaLogin(bean);
			System.out.println(beanresult.getMensaje());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
