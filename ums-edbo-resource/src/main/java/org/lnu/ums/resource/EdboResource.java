package org.lnu.ums.resource;

public abstract class EdboResource extends ApiResource {

    private String respondUrl;

    public String getRespondUrl() {
        return respondUrl;
    }

    public void setRespondUrl(String respondUrl) {
        this.respondUrl = respondUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EdboResource that = (EdboResource) o;

        if (respondUrl != null ? !respondUrl.equals(that.respondUrl) : that.respondUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return respondUrl != null ? respondUrl.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "EdboResource{" +
                "respondUrl='" + respondUrl + '\'' +
                '}';
    }
}
