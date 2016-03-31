package com.AmigoInvisible.isst.dao;

import com.AmigoInvisible.isst.model.Login;

public interface LoginDAO {
	
	public Login insertLogin(String usuario, String contraseņa);
	
	public Login getLoginByUsuario(String usuario);
	

}
