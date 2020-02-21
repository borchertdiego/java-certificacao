package entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

//  Cada produto tem uma tag diferente
	@Override
	public final String priceTag() {
		return  super.getName() 
			  + " $ " 
			  + String.format("%.2f", super.getPrice() + customsFee)
			  + " (Customs fee: $ "
			  + String.format("%.2f", customsFee)
			  + ")";
	}
}
