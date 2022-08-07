package com.alkemy.icons.icons.Entity;

import javax.persistence.CascadeType;

public @interface ManytoManey {
    String mappedBy();

    CascadeType cascade();
}
