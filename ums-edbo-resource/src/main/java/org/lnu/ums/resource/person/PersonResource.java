package org.lnu.ums.resource.person;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PersonResource {

    // Identifier of person from our local database
    private Long id;
    // idPerson
    private Long uid;
    // personCodeU
    private String utid;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(final Long uid) {
        this.uid = uid;
    }

    public String getUtid() {
        return utid;
    }

    public void setUtid(final String utid) {
        this.utid = utid;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PersonResource that = (PersonResource) o;

        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) {
            return false;
        }
        return !(utid != null ? !utid.equals(that.utid) : that.utid != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (utid != null ? utid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("uid", uid)
                .append("utid", utid)
                .toString();
    }
}
