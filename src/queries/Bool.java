package queries;
public class Bool {

	private String item;
	private String itemName;
	private String item_type;
	private String Dairy;

	private Bool(Builder b) {
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
			this.item = item_type;
			this.itemName = Dairy;
			return this;
		}

		public Bool bool() {
			return new Bool(this);
		}
	}

}
