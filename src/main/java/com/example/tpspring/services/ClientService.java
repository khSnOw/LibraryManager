package com.example.tpspring.services;

import com.example.tpspring.domain.Client;
import com.example.tpspring.repositories.IClientRepository;
import com.example.tpspring.utils.ClientExistException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {

    private IClientRepository clientRepository;

    public ClientService(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void store(Client c) throws ClientExistException{
        this.clientRepository.save(c);

    }

    @Override
    public Client findOne(Long id) {
        Client client = clientRepository.getOne(id);
        return client;
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public boolean delete(Client cl) {

        clientRepository.delete(cl);
        return true;
    }

    @Override
    public Client update(Client cl) {
        Client client = clientRepository.getOne(cl.getClientId());
        if (client != null)
        {
            client.setClientName(cl.getClientName());
            clientRepository.save(client);
        }
        return cl;
    }
}
