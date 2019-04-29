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

// No Use
//		// Constructors for arguments as above
//		public Builder item_column(String item, String itemName) {
//			this.item = item;
//			this.itemName = itemName;
//			return this;
//		}
//
//		public Builder itemType_column(String item_type, String Dairy) {
//			this.item_type = item_type;
//			this.Dairy = Dairy;
//			return this;
//		}

		// Method for building User class
		public QueryBuilder bool() {
			return new QueryBuilder(this);
		}
	}

	/**
	 * @param queryType Enum Type
	 * @return Query adjusted for client's need. Used Factory Pattern (Ref.)
	 *         section4.factoryMethod
	 */
	public Query shouldMatch(QueryType queryType) {
		return queryType.getQuery();
	}

	public Query mustMatch(QueryType queryType) {
		return queryType.getQuery();
	}

}
