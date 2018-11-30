package com.example.tpspring.services;

import com.example.tpspring.domain.Client;
import com.example.tpspring.utils.ClientExistException;



import java.util.List;

public interface IClientService {
    public void store(Client c) throws ClientExistException;
    public Client findOne(Long id);
    public List<Client> findAll();
    public boolean delete(Client cl);
    public Client update(Client cl);
}
