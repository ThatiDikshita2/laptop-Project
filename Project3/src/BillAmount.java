public class BillAmount {
public static double findDiscount (double billAmount) {
		double discount = 0.0;
		
		if (100 < billAmount && billAmount <= 250) {
			discount = billAmount * .05;//5%
		}else if(250 < billAmount && billAmount <= 500) {
			discount = billAmount * .1;//10%
		}else if(500 < billAmount && billAmount <= 750) {
		    discount = billAmount * .15;//15%
		}else if(750<billAmount && billAmount <= 1000) {
		    discount = billAmount * .2;//20%
	    }else{
		    discount = billAmount * .3;//30%
	    }
		return discount;
	}
	public static void billGenerate(double billAmount) {
		double discount = findDiscount(billAmount);
	    System.out.println("Bill Amount: "+billAmount);
	    System.out.println("Discount: "+discount);
	    System.out.println("Final Bill Amount: "+(billAmount-discount));
	}
}