package com.democode.action;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;
import com.democode.form.product;

public class productAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private List<product> objlist = new ArrayList<product>();
	public String selectAll()
	{
		
		getObjlist().add(new product("sp01", "Laptop", "May tinh", 200, 20));
		getObjlist().add(new product("sp02", "May giat", "Giat quan ao", 200, 20));
		getObjlist().add(new product("sp03", "O to", "van tai", 200, 20));
		getObjlist().add(new product("sp04", "Ti vi", "xem truyen hinh", 200, 20));
		getObjlist().add(new product("sp05", "Tu lanh", "bao quan do an", 200, 20));
		return "SUCCESS";
	}
	List<product> getObjlist() {
		return objlist;
	}
	void setObjlist(List<product> objlist) {
		this.objlist = objlist;
	}
	
	
}
