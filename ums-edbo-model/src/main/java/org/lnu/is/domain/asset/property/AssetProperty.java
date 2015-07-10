package org.lnu.is.domain.asset.property;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.property.Property;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * 
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_assetproperty")
public class AssetProperty extends InformationModel {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;
	
	@ManyToOne
	@JoinColumn(name = "property_id")
	private Property property;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private AssetProperty assetProperty;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "numvalue")
	private Double numValue;
	
	@Column(name = "strvalue")
	private String strValue;
	
	@Column(name = "datevalue")
	private Date dateValue;

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(final Asset asset) {
		this.asset = asset;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(final Property property) {
		this.property = property;
	}

	public AssetProperty getAssetProperty() {
		return assetProperty;
	}

	public void setAssetProperty(final AssetProperty assetProperty) {
		this.assetProperty = assetProperty;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public Double getNumValue() {
		return numValue;
	}

	public void setNumValue(final Double numValue) {
		this.numValue = numValue;
	}

	public String getStrValue() {
		return strValue;
	}

	public void setStrValue(final String strValue) {
		this.strValue = strValue;
	}

	public Date getDateValue() {
		return dateValue;
	}

	public void setDateValue(final Date dateValue) {
		this.dateValue = dateValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((dateValue == null) ? 0 : dateValue.hashCode());
		result = prime * result
				+ ((numValue == null) ? 0 : numValue.hashCode());
		result = prime * result
				+ ((strValue == null) ? 0 : strValue.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		AssetProperty other = (AssetProperty) obj;
		if (dateValue == null) {
			if (other.dateValue != null) {
				return false;
			}
		} else if (!dateValue.equals(other.dateValue)) {
			return false;
		}
		if (numValue == null) {
			if (other.numValue != null) {
				return false;
			}
		} else if (!numValue.equals(other.numValue)) {
			return false;
		}
		if (strValue == null) {
			if (other.strValue != null) {
				return false;
			}
		} else if (!strValue.equals(other.strValue)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AssetProperty [title=" + title + ", numValue=" + numValue
				+ ", strValue=" + strValue + ", dateValue=" + dateValue + "]";
	}
		
}
