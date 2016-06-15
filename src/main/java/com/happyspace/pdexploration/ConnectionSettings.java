package com.happyspace.pdexploration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * A Connection to a NFS share.
 */
@Component
@ConfigurationProperties(prefix="connection", locations = "classpath:/application.yml")
public class ConnectionSettings {
    private int uid;
    private int gid;
    private String host;
    private int port;
    private String mount;

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getUid() {
        return uid;
    }

    public int getGid() {
        return gid;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}
