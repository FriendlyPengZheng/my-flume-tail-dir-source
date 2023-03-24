package com.cn.taildir.manager;

import com.cn.taildir.taildir.TaildirSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ServerManager implements CommandLineRunner {
    @Autowired
    TaildirSource taildirSource;

    @Override
    public void run(String... args) throws Exception {
        taildirSource.start();
    }
}
