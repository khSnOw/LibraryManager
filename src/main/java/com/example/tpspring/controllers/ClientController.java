package com.example.tpspring.controllers;

import com.example.tpspring.domain.Client;
import com.example.tpspring.repositories.IClientRepository;
import com.example.tpspring.utils.ClientExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    @Autowired
    private IClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<List<Client>> getClients(){
        List<Client> clients = new ArrayList<Client>();
        clients = clientRepository.findAll();
        return new ResponseEntity(clients, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Client> storeClient(@RequestBody Client client){
        try
        {
            clientRepository.save(client);
        }
        catch(Exception ex){
            return new ResponseEntity("Client Exist",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(client,HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Client> updateClient(@RequestBody Client client){

        try
        {
            Optional<Client> current = clientRepository.findById(client.getClientId());
            current.get().setClientName(client.getClientName());
            clientRepository.save(current.get());
        }
        catch(Exception ex){
            return new ResponseEntity(client,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(client,HttpStatus.NO_CONTENT);
    }
}
