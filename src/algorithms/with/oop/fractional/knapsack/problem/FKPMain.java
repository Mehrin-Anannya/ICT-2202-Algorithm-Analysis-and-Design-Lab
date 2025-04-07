package algorithms.with.oop.fractional.knapsack.problem;

import java.util.ArrayList;
import java.util.Collections;

import algorithms.with.oop.fractionalknapsackproblem.FKPComparator;
import algorithms.with.oop.fractionalknapsackproblem.ItemValue;

public class FKPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ItemValue> itemValues = new ArrayList<ItemValue>();
		
		//itemValue1
		ItemValue itemValue1 = new ItemValue();
		itemValue1.setObject(2);
		itemValue1.setProfit(5);
		itemValue1.setWeight(1);
		
		//itemValue2
		ItemValue itemValue2 = new ItemValue();
		itemValue2.setObject(1);
		itemValue2.setProfit(12);
		itemValue2.setWeight(3);
		
		//itemValue3
		ItemValue itemValue3 = new ItemValue();
		itemValue3.setObject(3);
		itemValue3.setProfit(16);
		itemValue3.setWeight(4);
		
		//itemValue4
		ItemValue itemValue4 = new ItemValue();
		itemValue4.setObject(4);
		itemValue4.setProfit(7);
		itemValue4.setWeight(2);
		
		//itemValue5
		ItemValue itemValue5 = new ItemValue();
		itemValue5.setObject(6);
		itemValue5.setProfit(11);
		itemValue5.setWeight(4);
		
		//itemValue6
		ItemValue itemValue6 = new ItemValue();
		itemValue6.setObject(7);
		itemValue6.setProfit(6);
		itemValue6.setWeight(3);
		
		//itemValue7
		ItemValue itemValue7 = new ItemValue();
		itemValue7.setObject(5);
		itemValue7.setProfit(9);
		itemValue7.setWeight(9);
		
		//added all the item values in the list
		itemValues.add(itemValue1);
		itemValues.add(itemValue2);
		itemValues.add(itemValue3);
		itemValues.add(itemValue4);
		itemValues.add(itemValue5);
		itemValues.add(itemValue6);
		itemValues.add(itemValue7);
		
		Collections.sort(itemValues, new FKPComparator());
		
		int capacity = 15;

		  double totalVal = 0;

////		  for(ItemValue item : items) {
////
////		   int currWeight = item.weight;
////
////		   int currVal = item.profit;
//
//		   if(capacity - currWeight >= 0) {
//
//		    capacity = capacity - currWeight;
//
//		    totalVal += currVal;
//
//		   }
//
//		   else {
//
//		    double frac = ((double)capacity/(double)currWeight);
//
//		    totalVal += (frac * currVal);
//
//		    capacity -= (currWeight*frac);
//
//		    break;
//
//		   }
//
//		  }
//
//		  System.out.print("Total Profit: "+totalVal);
	}

}
