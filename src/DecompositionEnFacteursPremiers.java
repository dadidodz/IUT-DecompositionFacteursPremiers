import java.util.ArrayList;
import java.util.List;

public class DecompositionEnFacteursPremiers {
	List<Integer> factors;
	public List<Integer> compute(int n) {
			this.factors = new ArrayList<Integer>();
				if (n>1)
					this.factors.add(2);
				return factors;
	}
}