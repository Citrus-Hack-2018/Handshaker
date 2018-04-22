package com.github.citrus_hack_2018.handshaker;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String username;
    public List<Friend> friends;

    public User() {
        friends = new ArrayList<Friend>();
    }
}
