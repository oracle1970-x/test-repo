package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

//商品接口
public interface ItemService {
	
	List<Item> getItems(String orderId);
	
	void decreaseNumbers(List<Item> list);
}
