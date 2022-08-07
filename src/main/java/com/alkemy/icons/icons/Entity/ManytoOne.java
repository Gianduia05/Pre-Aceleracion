package com.alkemy.icons.icons.Entity;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;

public @interface ManytoOne {
    FetchType fetch();

    CascadeType cascade();
}
