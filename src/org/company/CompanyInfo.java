package org.company;

public class CompanyInfo {
	private void companyName()
	{
System.out.println("Tata Consultancy Services");
	}
	private void companyId() {
		System.out.println("1600630");
	}
	private void companyAddress() 
	{
		System.out.println("1/124, 9th Floor, Mount Poonamalee Road, Block 9, DLF IT Park Rd, Manapakkam, Chennai, Tamil Nadu 600089");
	}
	public static void main(String[] args)
	{
		CompanyInfo ifo=new CompanyInfo();
		ifo.companyName();
		ifo.companyId();
		ifo.companyAddress();
	}
}
