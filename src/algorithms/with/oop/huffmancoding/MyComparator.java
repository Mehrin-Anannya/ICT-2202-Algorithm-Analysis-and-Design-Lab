package algorithms.with.oop.huffmancoding;

import java.util.Comparator;

public class MyComparator implements Comparator<HuffmanNode>{

	@Override
	public int compare(HuffmanNode x, HuffmanNode y) {
		// TODO Auto-generated method stub
		return x.data - y.data;
	}

}
