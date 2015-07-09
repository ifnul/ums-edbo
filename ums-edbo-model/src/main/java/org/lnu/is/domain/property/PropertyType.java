package org.lnu.is.domain.property;

import org.lnu.is.annotation.dbtable.RF;
import org.lnu.is.domain.InformationModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author illay
 *
 */
@RF
@Entity
@Table(name = "q_rf_propertytype")
public class PropertyType extends InformationModel {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "abbrname")
	private String abbrname;
	
	@Column(name = "name")
	private String name;

	public String getAbbrname() {
		return abbrname;
	}

	public void setAbbrname(final String abbrname) {
		this.abbrname = abbrname;
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
				+ ((abbrname == null) ? 0 : abbrname.hashCode());
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
		PropertyType other = (PropertyType) obj;
		if (abbrname == null) {
			if (other.abbrname != null) {
				return false;
			}
		} else if (!abbrname.equals(other.abbrname)) {
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
		return "PropertyType [abbrname=" + abbrname + ", name=" + name + "]";
	}
	
	
}
