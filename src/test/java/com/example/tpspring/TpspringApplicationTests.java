package com.example.tpspring;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.tpspring.domain.Client;
import com.example.tpspring.repositories.IClientRepository;
import com.example.tpspring.services.ClientService;
import com.example.tpspring.services.IClientService;
import com.example.tpspring.utils.ClientExistException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TpspringApplicationTests {

    @Autowired
    private IClientRepository clientRepository;

    private IClientService clientService;

    @Before
    public void setUp()
    {
        clientService = new ClientService(clientRepository);
    }


//    @Test
//    public void test_store(){
//        long count = clientService.findAll().size();
//        try {
//            clientService.store(new Client(new Long(3),"Chaima Mansouri"));
//        } catch (ClientExistException e) {
//            e.printStackTrace();
//        }
//        assertEquals(count + 1,clientRepository.findAll().size());
//    }
//
//    @Test(expected=ClientExistException.class)
//    public void test_exception() throws ClientExistException {
//        clientService.store(new Client(new Long(3),"Chaima Mansouri"));
//    }

    @After
    public void tearDown(){
        this.clientRepository = null;
    }

}
