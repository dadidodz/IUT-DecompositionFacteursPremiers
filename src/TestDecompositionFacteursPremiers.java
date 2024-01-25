import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDecompositionFacteursPremiers {
	
	private DecompositionEnFacteursPremiers d;
	
	@Before
	public void setUp() throws Exception {
		this.d = new DecompositionEnFacteursPremiers();
	}
	
	@After
	public void tearDown() throws Exception {
		this.d = null;
	}
	
	@Test
	public void UnNapasDeFacteursPremiers() {
		assertEquals(Arrays.asList(), d.compute(1));
	}
	
	@Test
	public void DeuxAUnFacteurPremierDeux() {
		assertEquals(Arrays.asList(2), d.compute(2));
	}
}
