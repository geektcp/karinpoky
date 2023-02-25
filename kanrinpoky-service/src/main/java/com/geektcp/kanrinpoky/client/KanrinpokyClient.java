package com.geektcp.kanrinpoky.client;

public class KanrinpokyClient implements Client{

    @Override
    public boolean checkPermission(String user, String sql) {
        return false;
    }

    public static Client build() {
        return new KanrinpokyClient();
    }
}


