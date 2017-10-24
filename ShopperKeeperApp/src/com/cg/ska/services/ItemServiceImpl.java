package com.cg.ska.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ska.daos.ItemRepository;
import com.cg.ska.dtos.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
			
	public ItemRepository getItemRepository() {
		return itemRepository;
	}

	public void setItemRepository(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public Item addItem(Item item) {		
		return itemRepository.addItem(item);
	}

	@Override
	public Item update(Item item) {		
		return itemRepository.update(item);
	}

	@Override
	public boolean delete(int itemCode) {		
		return itemRepository.delete(itemCode);
	}

	@Override
	public Item getItmeByCode(int itemCode) {
		return itemRepository.getItmeByCode(itemCode);
	}

	@Override
	public List<Item> getAllItems() {
		return itemRepository.getAllItems();
	}
}
