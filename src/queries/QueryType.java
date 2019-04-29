package queries;
/**
 * @author : Sayaka Tamura Apr 29, 2019 Udemy Master Object Oriented Design in
 *         Java Final Assignment: Create API
 * 
 */
// Factory Pattern: when we want to use another class to create object for us
// can define abstract class to instantiate instances of an enum type.

public enum QueryType {

	Bool {
		public Query getQuery() {
			return new Bool();
		}
	},
	Must {
		public Query getQuery() {
			return new Must();
		}
	},
	Should {
		public Query getQuery() {
			return new Should();
		}
	};

	abstract Query getQuery();

}
