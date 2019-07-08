package builder.abs;

import builder.inter.Item;
import builder.inter.Packing;

public abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}
	@Override
	public abstract float price() ;
}
