package com.cg.ska.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.ska.dtos.Item;

@Repository
@Transactional
public class ItemRepositoryImpl implements ItemRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Item addItem(Item item) {
		if(item!=null){
			entityManager.persist(item);
			entityManager.flush();
		}
		return item;
	}

	@Override
	public Item update(Item item) {
		if(item!=null){
			item = entityManager.merge(item);
			entityManager.flush();
		}
		return item;
	}

	@Override
	public boolean delete(int itemCode) {
		entityManager.remove(getItmeByCode(itemCode));
		return true;
	}

	@Override
	public Item getItmeByCode(int itemCode) {		
		return entityManager.find(Item.class,itemCode);
	}

	@Override
	public List<Item> getAllItems() {		
		TypedQuery<Item> query = entityManager.createQuery("SELECT item FROM Item item", Item.class);
		return query.getResultList();
	}

	
}
