package org.lnu.is.domain.asset.rel;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.asset.Asset;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/***
 * AssetRel entity.
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_assetrel")
public class AssetRel extends InformationModel {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;
	
	@Column(name = "serialnum")
	private String serialNum;
	
	@Column(name = "amount")
	private Double amount;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private AssetRel assetRef;

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(final Asset asset) {
		this.asset = asset;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(final String serialNum) {
		this.serialNum = serialNum;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(final Double amount) {
		this.amount = amount;
	}

	public AssetRel getAssetRef() {
		return assetRef;
	}

	public void setAssetRef(final AssetRel assetRef) {
		this.assetRef = assetRef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result
				+ ((serialNum == null) ? 0 : serialNum.hashCode());
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
		AssetRel other = (AssetRel) obj;
		if (amount == null) {
			if (other.amount != null) {
				return false;
			}
		} else if (!amount.equals(other.amount)) {
			return false;
		}
		if (serialNum == null) {
			if (other.serialNum != null) {
				return false;
			}
		} else if (!serialNum.equals(other.serialNum)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AssetRef [serialNum=" + serialNum + ", amount=" + amount + "]";
	}
	
}
