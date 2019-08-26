package com.groceries.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "grocery_items")
public class Item {
	@OneToOne
	@JoinColumn(name = "list_id")
	private int listId;
	
	@Column(name = "item_name")
	private String itemName;
	
	private int amount;
	
	@Column(name = "item_type")
	private String itemType;

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Item(int listId, String itemName, int amount, String itemType) {
		super();
		this.listId = listId;
		this.itemName = itemName;
		this.amount = amount;
		this.itemType = itemType;
	}

	@Override
	public String toString() {
		return "Item [listId=" + listId + ", itemName=" + itemName + ", amount=" + amount + ", itemType=" + itemType
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
		result = prime * result + listId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (amount != other.amount)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (itemType == null) {
			if (other.itemType != null)
				return false;
		} else if (!itemType.equals(other.itemType))
			return false;
		if (listId != other.listId)
			return false;
		return true;
	}
	
	
	

}
