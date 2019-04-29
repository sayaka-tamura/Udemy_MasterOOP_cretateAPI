// Used Builder Pattern (Ref.) section4.builderPattern

package queries;

public class QueryBuilder {

	private String item;
	private String itemName;
	private String item_type;
	private String Dairy;

	private QueryBuilder(Builder b) {
		this.item = b.item;
		this.itemName = b.itemName;
		this.item_type = b.item_type;
		this.Dairy = b.Dairy;
	}

	public String toString() {
		String msg;
		msg = "Item : " + item + "\n";
		msg += "ItemName : " + itemName + "\n";
		msg += "Item_type : " + item_type + "\n";
		msg += "Dairy : " + Dairy + "\n";
		return msg;
	}

	public static class Builder {

		private String item;
		private String itemName;
		private String item_type;
		private String Dairy;

		// Constructors for arguments as above
		public Builder item_column(String item, String itemName) {
			this.item = item;
			this.itemName = itemName;
			return this;
		}

		public Builder itemType_column(String item_type, String Dairy) {
			this.item_type = item_type;
			this.Dairy = Dairy;
			return this;
		}

		// method for building User class
		public QueryBuilder bool() {
			return new QueryBuilder(this);
		}
	}

//	public Query getQuery(String QueryType) {
//		if (QueryType.equalsIgnoreCase("truck")) {
//			return new Truck();
//		} else if (QueryType.equalsIgnoreCase("car")) {
//			return new Car();
//		} else if (QueryType.equalsIgnoreCase("electric")) {
//			return new ElectricCar();
//		} else if (QueryType.equalsIgnoreCase("bus")) {
//			return new Bus();
//		}
//		return null;
//	}
//
//	/**
//	 * @param vehicleType Enum Type
//	 * @return Vehicle adjusted for client's need
//	 */
//	public Vehicle getVehicle(VehicleType vehicleType) {
//		return vehicleType.getVehicle();
//	}
//
//	public void bool() {
//        if () {
//            // create the instances of the Musts, Shoulds etc.
//            b.create();
//        } else if () {
//            b.mustMatch(String key, String value);
//        } else if () {
//            b.shouldMatch(String key, String value);
//        } else if () {
//            // print out the composed objects json format to prove that the API works as expected
//            b.printAsJSONformat();
//        }
//    }
}
