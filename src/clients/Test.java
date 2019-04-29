package clients;

import queries.QueryBuilder;

public class Test {
	public static void main(String[] args) {
		// for temporary test
		QueryBuilder builder = new QueryBuilder.Builder().bool();

		System.out.println(builder);

		/** given code from assignment */
//		builder.bool().mustMatch("item", "Milk").mustMatch("item_type", "Dairy");
//		builder.bool().shouldMatch("product_location", "New Mexico").shouldMatch("warehouse_number", 37);
//
//		builder.bool().shouldMatch("lot_number", 307).bool().mustMatch("expiry_date", "Jan 2020");
	}
}
