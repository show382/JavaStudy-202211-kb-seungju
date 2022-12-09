package 연습;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
@Builder
@AllArgsConstructor
public class Company {
	private int companyId;
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	public static void main(String[] args) {
		Company company = Company.builder()
				.companyId(100)
				.companyName("Apple")
				.address("Apple Computer Inc. 1 infinte Loop")
				.city("Cupertion")
				.state("CA")
				.zipCode("95014")
				.build();
		System.out.println(company);
//				new Company(100, "Apple","Apple Computer Inc. 1 infinte Loop" , "Cupertion", "CA", "95014");
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.setPrettyPrinting().create();
		String json = gson.toJson(company);
		System.out.println(json);
	}
}
