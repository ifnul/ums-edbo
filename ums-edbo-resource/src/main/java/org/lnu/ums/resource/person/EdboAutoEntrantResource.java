package org.lnu.ums.resource.person;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.ums.resource.EdboResource;

/**
 * Created by ivanursul on 7/12/15.
 */
public class EdboAutoEntrantResource extends EdboResource {

    private Long id;

    @Override
    public String getUri() {
        // todo: add idPerson
        return String.format("/api/entrants/%d", null);
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EdboAutoEntrantResource that = (EdboAutoEntrantResource) o;

        return !(id != null ? !id.equals(that.id) : that.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .toString();
    }

}
