package com.sky.demo.ldap.model;


import com.google.common.base.MoreObjects;

/**
 * Created by user on 17/2/14.
 */
public class ServerConfig {

    private Integer id;
    private String uuid;
    private Integer type;
    private String host;
    private Integer port;
    private String rootContext;
    private String userDn;
    private String password;
    private Boolean isEnable;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getRootContext() {
        return rootContext;
    }

    public void setRootContext(String rootContext) {
        this.rootContext = rootContext;
    }

    public String getUserDn() {
        return userDn;
    }

    public void setUserDn(String userDn) {
        this.userDn = userDn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("uuid", uuid)
                .add("type", type)
                .add("host", host)
                .add("port", port)
                .add("rootContext", rootContext)
                .add("userDn", userDn)
                .add("password", password)
                .add("isEnable", isEnable)
                .toString();
    }
}
