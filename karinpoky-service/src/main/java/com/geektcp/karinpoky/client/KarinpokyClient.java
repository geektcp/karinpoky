package com.geektcp.karinpoky.client;

public class KarinpokyClient implements Client{

    @Override
    public boolean checkPermission(String user, String sql) {
        return false;
    }

    public static Client build() {
        return new KarinpokyClient();
    }
}


