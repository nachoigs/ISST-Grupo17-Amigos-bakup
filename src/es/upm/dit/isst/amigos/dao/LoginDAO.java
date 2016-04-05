package es.upm.dit.isst.amigos.dao;

import es.upm.dit.isst.amigos.model.Login;

public interface LoginDAO {
	
	public Login insertLogin(String usuario, String contraseņa);
	
	public Login getLoginByUser(String user);
}
