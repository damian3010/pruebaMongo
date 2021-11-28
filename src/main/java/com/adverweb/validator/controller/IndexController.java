/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adverweb.validator.controller;

import com.adverweb.validator.mogomodel.Cliente;
import com.adverweb.validator.mogomodel.ClienteRepository;
import com.adverweb.validator.mogomodel.User;
import com.adverweb.validator.mogomodel.UserRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Damian
 */
@Controller
@RequestMapping("/app")
public class IndexController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private UserRepository userReposutory;

    @GetMapping({"/", "", "/index", "/home"})
    public String page(Model model) {
        model.addAttribute("titulo", "Prueba Spring");
        return "index";
    }

    @GetMapping("/validarConexion")
    public String listar(Model model) {
        List<Cliente> clientes = null;
        List<User> usuarios = null;
        try {
            
            clientes = clienteRepository.findAll();
            usuarios = userReposutory.findAll();
            for(User u:usuarios){
                u.setCliente(clienteRepository.findById(u.getId_cliente()).orElse(new Cliente()));
            }
            
        } catch (Exception e) {
            //System.out.println(e.getCause());
            model.addAttribute("mesage", "causa:" + e.getCause());
        }
        model.addAttribute("titulo", "Validar Conexion");
        model.addAttribute("clientes", clientes);
        model.addAttribute("titulo2", "Usuarios");
        model.addAttribute("usuarios", usuarios);
        return "ver";
    }

    @GetMapping("/crear")
    public String crear(Model model) {
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente = new Cliente("prueba", "454564", new Date(), new Date(), new Date(), "PR");
        try {

            clienteRepository.save(cliente);
            clientes = clienteRepository.findAll();
        } catch (Exception e) {
            //System.out.println(e.getCause());
            model.addAttribute("mesage", "causa:" + e.getCause());
        }
        model.addAttribute("titulo", "Clientes");

        model.addAttribute("clientes", clientes);

        return "ver";
    }
}
