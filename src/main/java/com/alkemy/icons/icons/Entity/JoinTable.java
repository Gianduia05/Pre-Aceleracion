package com.alkemy.icons.icons.Entity;

public @interface JoinTable {
    String name();
    JoinColumn joinColumns();

    JoinColumn inverseJoinColumns();
}
