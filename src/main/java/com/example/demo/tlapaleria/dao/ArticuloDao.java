package com.example.demo.tlapaleria.dao;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.tlapaleria.entity.Articulo;

@Repository
public class ArticuloDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void guardar(Articulo articulo) {
		mongoTemplate.save(articulo);
	}

	public Articulo consultar(Integer id){
		Query query = new Query(Criteria.where("id").is(id));
		return mongoTemplate.findOne(query, Articulo.class);
	}

	public void actualizar(Articulo articulo) throws SQLException {

	}

	public void borrar(Integer articulo) throws SQLException {

	}

}
