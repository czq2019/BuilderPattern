package builder;

import java.util.ArrayList;
import java.util.List;

import builder.inter.Item;

public class Meal {
	
	private List<Item> items=new ArrayList<>();
	//添加商品
	public void addItem(Item item) {
		items.add(item);
	}
	//统计花费的money
	public float getCost() {
		float cost=0.0f;
		for(Item item:items) {
			cost+=item.price();
		}
		return cost;
	}
	//
	public void showItems() {
		for(Item item:items) {
			System.out.println("item:"+item.name());
			System.out.println(",Packing:"+item.packing().pack());
			System.out.println(",price:"+item.price());
		}
		
	}
}
