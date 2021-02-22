
package org.gitlab4j.api.models;

import java.util.Date;

public class NoteAuthor extends AbstractUser<NoteAuthor> {

    private String email;
    private Date createdAt;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
