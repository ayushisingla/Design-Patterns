package creational.builder;

public class HttpClient {

	public HttpClient(HttpClientBuilder httpClientBuilder) {
		this.method = httpClientBuilder.method;
		this.url = httpClientBuilder.url;
		this.username = httpClientBuilder.username;
		this.password = httpClientBuilder.password;
		this.headers = httpClientBuilder.headers;
		this.body = httpClientBuilder.body;
	}

	private String method;
	private String url;
	private String username;
	private String password;
	private String headers;
	private String body;

	public static class HttpClientBuilder {
		private String method;
		private String url;
		private String username;
		private String password;
		private String headers;
		private String body;

		public HttpClientBuilder method(String method) {
			this.method = method;
			return this;
		}

		public HttpClientBuilder url(String url) {
			this.url = url;
			return this;
		}

		public HttpClientBuilder secure(String username, String password) {
			this.username = username;
			this.password = password;
			return this;
		}

		public HttpClientBuilder headers(String headers) {
			this.headers = headers;
			return this;
		}

		public HttpClientBuilder body(String body) {
			this.body = body;
			return this;
		}
		
		public HttpClient build() {
			return new HttpClient(this);
		}

	}

	public String getMethod() {
		return method;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getHeaders() {
		return headers;
	}

	public String getBody() {
		return body;
	}

	@Override
	public String toString() {
		return "HttpClient [method=" + method + ", url=" + url + ", username=" + username + ", password=" + password
				+ ", headers=" + headers + ", body=" + body + "]";
	}
}
