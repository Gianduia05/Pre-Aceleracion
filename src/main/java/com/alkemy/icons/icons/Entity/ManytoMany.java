package com.alkemy.icons.icons.Entity;

import javax.persistence.CascadeType;

public @interface ManytoMany {
    CascadeType[] cascade();
}
