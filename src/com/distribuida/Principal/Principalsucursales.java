
package com.distribuida.Principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.sucursales;
import com.distribuida.dao.sucursalesDAO;

public class Principalsucursales {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		sucursalesDAO sucursalesDAO = context.getBean("sucursalesDAOImpl", sucursalesDAO.class);
		
		//CRUD : CREATE , READ , UPDATE ,DELETE
		
		//ADD
		sucursales sucursales1 = new sucursales(0,"sucursal 004","av.vella flora","0989876945");
		//sucursalesDAO.add(sucursales1);
		
		//UP
		sucursales sucursales2 = new sucursales(6,"sucursal5","av.miravalle","0987648532");
		//sucursalesDAO.up(sucursales2);
		
		//DEL
		sucursalesDAO.del(6);
		System.out.println("*************** DEL***********"+sucursalesDAO.findOne(6));
		
		//findAll
		//List<sucursales> sucursales = sucursalesDAO.findAll();
		sucursalesDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		context.close();
	
 


	}

}

