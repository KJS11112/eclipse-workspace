package kr.co.kosta7;

public class CompanyTest {
	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		System.out.println(company1);
		System.out.println(company2);
	}
}
