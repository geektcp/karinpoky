package com.geektcp.karinpoky.server.entry;

public interface Client {

    boolean checkPermission(String user, String sql);

}
