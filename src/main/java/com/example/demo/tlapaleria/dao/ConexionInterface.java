package com.example.demo.tlapaleria.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.tlapaleria.entity.Articulo;

public interface ConexionInterface extends MongoRepository<Articulo, Integer>{

}
