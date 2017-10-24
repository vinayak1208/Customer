package com.cg.ska.daos;

import java.util.List;

import com.cg.ska.dtos.Item;

public interface ItemRepository {
	Item addItem(Item item);
	Item update(Item item);
	boolean delete(int itemCode);
	Item getItmeByCode(int itemCode);
	List<Item> getAllItems();
}
