package es.upm.dit.isst.amigos.dao;

import java.util.List;

import es.upm.dit.isst.amigos.model.Grupo;

public interface GrupoDAO {
	public Grupo insertGrupo(String moderador, String preciomax, String fecha);
	
	public Grupo getGrupoById(Long gid);
	
	public List<Grupo> getGrupoByModerador(String moderador);
}
