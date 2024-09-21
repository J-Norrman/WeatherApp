package com.j_norrman.weatherapp.model.user;

import java.util.List;

public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private List<String> favourites;

    public UserDTO() {
    }

    public UserDTO(Long id, String username, String password, List<String> favourites) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.favourites = favourites;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<String> favourites) {
        this.favourites = favourites;
    }
}
