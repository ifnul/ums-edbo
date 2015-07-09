package org.lnu.is.domain.paper.type;

import org.lnu.is.annotation.dbtable.RF;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.paper.usage.PaperUsage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Paper Type entity.
 * @author ivanursul
 *
 */
@RF
@Entity
@Table(name = "q_rf_papertype")
public class PaperType extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "paperusage_id")
	private PaperUsage paperUsage;
	
	@Column(name = "abbrname")
	private String abbrName;
	
	@Column(name = "name")
	private String name;

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrName) {
		this.abbrName = abbrName;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public PaperUsage getPaperUsage() {
		return paperUsage;
	}

	public void setPaperUsage(final PaperUsage paperUsage) {
		this.paperUsage = paperUsage;
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
		PaperType other = (PaperType) obj;
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
		return "PaperType [abbrName=" + abbrName + ", name=" + name + "]";
	}
	
}
