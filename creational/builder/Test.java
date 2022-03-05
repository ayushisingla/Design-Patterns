package creational.builder;

import creational.builder.HttpClient.HttpClientBuilder;

public class Test {

	public static void main(String[] args) {
//	HttpClient client = new HttpClient("Post", "ayushi.com", "ayushi46", "ayushi", null, null);
		HttpClient client = new HttpClientBuilder().method("POST").url("testurl").build();
		System.out.println(client);
	}

}
