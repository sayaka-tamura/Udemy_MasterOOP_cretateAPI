package queries;
public class QueryBuilder {

	public Query getQuery(String QueryType) {
		if (QueryType.equalsIgnoreCase("truck")) {
			return new Truck();
		} else if (QueryType.equalsIgnoreCase("car")) {
			return new Car();
		} else if (QueryType.equalsIgnoreCase("electric")) {
			return new ElectricCar();
		} else if (QueryType.equalsIgnoreCase("bus")) {
			return new Bus();
		}
		return null;
	}

	public void bool() {
        if () {
            // create the instances of the Musts, Shoulds etc.
            b.create();
        } else if () {
            b.mustMatch(String key, String value);
        } else if () {
            b.shouldMatch(String key, String value);
        } else if () {
            // print out the composed objects json format to prove that the API works as expected
            b.printAsJSONformat();
        }
    }
}
