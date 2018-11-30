package com.example.tpspring.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity

@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String clientName;

    // Relations
    @OneToMany(mappedBy = "client",fetch = FetchType.EAGER)
    private List<Command> commands;

    public Client(Long id, String name) {
        this.clientId = id;
        this.clientName = name;
    }


    public Client(List<Command> commands) {
        this.commands = commands;
    }

    public Client(String clientName) {
        this.clientName = clientName;
    }
    public Long getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }
}
