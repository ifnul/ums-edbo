package org.lnu.is.domain.enrolment.type;

import org.lnu.is.annotation.dbtable.RF;
import org.lnu.is.domain.InformationModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Enrolment Type entity.
 * @author ivanursul
 *
 */
@RF
@Entity
@Table(name = "q_rf_enrolmenttype")
public class EnrolmentType extends InformationModel {
	private static final long serialVersionUID = 1L;

	@Column(name = "abbrname")
	private String abbrName;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private EnrolmentType patent;
	
	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrname) {
		this.abbrName = abbrname;
	}

	public EnrolmentType getParent() {
		return patent;
	}

	public void setParent(final EnrolmentType enrolmentType) {
		this.patent = enrolmentType;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		EnrolmentType other = (EnrolmentType) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EnrolmentType [abbrname=" + abbrName + ", name=" + name + "]";
	}

}
