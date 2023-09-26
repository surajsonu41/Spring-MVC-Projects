package com.usastores.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "storetable")
public class StoreBean {

	@Override
	public String toString() {
		return "StoreBean [storeId=" + storeId + ", storeName=" + storeName + ", storeArea=" + storeArea + ", zipcode="
				+ zipcode + ", distanceInMiles=" + distanceInMiles + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq")    //used to generate primary keys on specific strategy
	@GenericGenerator(name = "seq", strategy = "increment")        //used to generate primary values on predefined strategy.
	@Column(name = "store_id")
	private int storeId;
	@Column(name = "store_name")
	private String storeName;
	@Column(name = "store_area")
	private String storeArea;
	@Column(name = "store_zipcode")
	private int zipcode;
	@Column(name = "store_distance")
	private float distanceInMiles;

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreArea() {
		return storeArea;
	}

	public void setStoreArea(String storeArea) {
		this.storeArea = storeArea;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public float getDistanceInMiles() {
		return distanceInMiles;
	}

	public void setDistanceInMiles(float distanceInMiles) {
		this.distanceInMiles = distanceInMiles;
	}

}
