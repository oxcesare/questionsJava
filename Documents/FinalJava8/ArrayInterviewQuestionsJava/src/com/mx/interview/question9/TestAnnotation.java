package com.mx.interview.question9;

public class TestAnnotation {
	
	
	public static void main(String[] args) throws JsonSerializeException {
		Car car = new Car("Ford", "F150", "2018");
		JsonSerializer serializer = new JsonSerializer();
		serializer.serialize(car);
	}

}
