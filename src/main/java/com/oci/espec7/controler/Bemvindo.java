package com.oci.espec7.controler;

import com.oci.espec7.modelo.Informacoes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Bemvindo {

    @RequestMapping("/")
    public List<Informacoes> bemvindo() {
        Informacoes informacoes = new Informacoes("Especialidades","Arquitetura AWS EC2 e OCI Autonomus");
        return Arrays.asList(informacoes);

    }
}
