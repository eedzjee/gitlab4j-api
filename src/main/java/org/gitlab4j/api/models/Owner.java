package org.gitlab4j.api.models;

import java.util.Date;

public class Owner extends AbstractUser<Owner> {

    private Date createdAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
