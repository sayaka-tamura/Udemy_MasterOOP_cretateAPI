// Used Interface Segregation (Ref.) section3.interfaceSegregationPrinciple ?

package queries;

public interface Query {
	public void makeQuery();
	/**
	 * public void mustMatch(String key, String value);
	 * 
	 * public void shouldMatch(String key, String value);
	 * 
	 * // create the instances of the Musts, Should etc. public void create();
	 * 
	 * // print out the composed objects JSON format to prove that the API works as
	 * // expected public void printAsJSONformat();
	 */
}
