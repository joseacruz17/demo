package com.example.demo.tlapaleria.controller;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.tlapaleria.entity.Articulo;
import com.example.demo.tlapaleria.service.ArticuloService;
import com.google.gson.Gson;

@RestController
public class TlapaleriaController {

	@Autowired
	private ArticuloService service;

	@RequestMapping(method = RequestMethod.GET, value = "/consultar")
	public Articulo consultar(@RequestParam(value = "id") Integer id) {
		return service.consultar(id);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/guardar")
	public void guardar(@RequestParam(value = "articulo") String articulo) {
		System.out.println(articulo);
		Gson formater = new Gson();
		Articulo art=formater.fromJson(articulo, Articulo.class);
		service.guardar(art);

	}
	

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public String test(@RequestParam(value = "id") Integer id) {
		return "Hello world";
	}

	// @RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
	public void borrar(/* @PathVariable */ Integer id) {
//			service.eliminar(id);

	}

	@RequestMapping(method = RequestMethod.PUT, path = "/actualizar/{id}")
	public void actualizar(@PathVariable BigInteger id,   @RequestBody String articulo) {
			System.out.println("Error "+ id);

	}
}
