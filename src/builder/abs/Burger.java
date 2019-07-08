package builder.abs;

import builder.inter.Item;
import builder.inter.Packing;

public abstract class Burger implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price() ;

}
