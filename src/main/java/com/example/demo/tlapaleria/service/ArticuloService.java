package com.example.demo.tlapaleria.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tlapaleria.dao.ArticuloDao;
import com.example.demo.tlapaleria.dao.ConexionInterface;
import com.example.demo.tlapaleria.entity.Articulo;

@Service
public class ArticuloService {

	@Autowired
	private ArticuloDao articuloDao;
	@Autowired
	private ConexionInterface conexionInterface;

	public void guardar(Articulo articulo) {
		conexionInterface.save(articulo);
		// articuloDao.guardar(articulo);
	}

	public Articulo consultar(Integer id) {
		return articuloDao.consultar(id);
	}
//	
//	public void actualizar(Articulo articulo) throws SQLException {
//		articuloDao.actualizar(articulo);
//	}
//	
//	public void eliminar(Integer  id) throws SQLException {
//		articuloDao.borrar(id);
//	}

}
