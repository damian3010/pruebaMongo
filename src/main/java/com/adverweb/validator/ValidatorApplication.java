package com.adverweb.validator;

import com.adverweb.validator.mogomodel.Cliente;
import com.adverweb.validator.mogomodel.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidatorApplication implements CommandLineRunner{

   /* @Autowired
    private ClienteRepository clienteRepository;*/
    
	public static void main(String[] args) {
		SpringApplication.run(ValidatorApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
       
     /*   List<Cliente> clientes = clienteRepository.findAll();
        
        System.err.println("********************************");
        if(clientes.size()==0)
            System.out.println("No existen clientes");
        for(Cliente cli: clientes){
            System.out.println(cli.toString());
    
        } */
        
    }

}
