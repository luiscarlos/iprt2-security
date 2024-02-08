package br.com.lc.iprt2.model;

import br.com.lc.iprt2.model.ennums.UserRole;

public record RegisterDTO(String email, String password, UserRole role) {
}
