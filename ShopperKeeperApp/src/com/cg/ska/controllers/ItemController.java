package com.cg.ska.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ska.dtos.Item;
import com.cg.ska.services.ItemService;

@Controller
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService itemService;

	public ItemService getItemService() {
		return itemService;
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView showList(){
		return new ModelAndView("items/list","items",itemService.getAllItems());
	}
	
	@RequestMapping(value="/new",method=RequestMethod.GET)
	public ModelAndView showNew(){
		return new ModelAndView("items/new","item",new Item());
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView addNew(@ModelAttribute @Valid Item item,BindingResult result){
		ModelAndView mv = new ModelAndView("redirect:list.obj");
		if(result.getErrorCount()==0){
			itemService.addItem(item);
		}else{
			mv.addObject("item",item);
			mv.setViewName("items/new");
		}
		return mv;
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView showEdit(@RequestParam int itemCode){
		return new ModelAndView("items/edit","item",itemService.getItmeByCode(itemCode));
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public ModelAndView doUpdate(@ModelAttribute @Valid Item item,BindingResult result){
		ModelAndView mv = new ModelAndView("redirect:list.obj");
		if(result.getErrorCount()==0){
			itemService.update(item);
		}else{
			mv.addObject("item",item);
			mv.setViewName("items/edit");
		}
		return mv;
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String doDelete(@RequestParam int itemCode){
		itemService.delete(itemCode);
		return "redirect:list.obj";
	}
	
}
