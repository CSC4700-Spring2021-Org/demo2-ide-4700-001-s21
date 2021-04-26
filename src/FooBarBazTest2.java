//Kevin Sofronas

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FooBarBazTest2 {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	private FooBarBaz fbb;

    @BeforeEach
    void setUp() {
        this.fbb = new FooBarBaz();
    }
	
	@Test
	void testTransform() {
		assertEquals("1",fbb.transform(1));
		assertEquals("2",fbb.transform(2));
		assertEquals("foo",fbb.transform(3));
		assertEquals("bar",fbb.transform(5));
		assertEquals("baz",fbb.transform(7));
		assertEquals("foobar",fbb.transform(15));
		assertEquals("foobaz",fbb.transform(21));
		assertEquals("barbaz",fbb.transform(35));
	}
	
	@Test
	void testTransform2() {
		assertEquals("foobarbaz",fbb.transform(105));
	}

}
