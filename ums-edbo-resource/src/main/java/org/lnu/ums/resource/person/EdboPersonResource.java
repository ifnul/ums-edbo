package org.lnu.ums.resource.person;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Resource for storing resource.
 * @author ivanursul
 *
 */
public class EdboPersonResource implements Serializable {
	private static final long serialVersionUID = 1L;

    private Long personId;
    private Boolean autoCreate;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(final Long personId) {
        this.personId = personId;
    }

    public Boolean getAutoCreate() {
        return autoCreate;
    }

    public void setAutoCreate(final Boolean autoCreate) {
        this.autoCreate = autoCreate;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EdboPersonResource that = (EdboPersonResource) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) {
            return false;
        }
        return !(autoCreate != null ? !autoCreate.equals(that.autoCreate) : that.autoCreate != null);

    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (autoCreate != null ? autoCreate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("personId", personId)
                .append("autoCreate", autoCreate)
                .toString();
    }
}
