package com.happyspace.pdexploration;

import org.dcache.nfs.v4.client.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Configuration
public class ScheduledNFSTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private ConnectionSettings connection;

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() throws IOException {
        System.out.println("The time is now " + dateFormat.format(new Date()));
        System.out.println(connection.getHost());

        InetAddress address = InetAddress.getByName(connection.getHost());

        Main nfs4_client = new org.dcache.nfs.v4.client.Main(address, connection.getUid(), connection.getGid());

        nfs4_client.mount(connection.getMount());
        nfs4_client.readdir();
        nfs4_client.umount();
    }
}
