package week3;


import org.junit.Assert;
import org.junit.Test;

public class Week3Test {
    @Test
        public void test() {
            // TODO: Viết 5 testcase cho phương thức max()
            Assert.assertEquals(7,Week3.max(6,7));
            Assert.assertEquals(-7,Week3.max(-16,-7));
            Assert.assertEquals(110,Week3.max(-110,110));
            Assert.assertEquals(7,Week3.max(3,7));
            Assert.assertEquals(7,Week3.max(2,7));
            // TODO: Viết 5 testcase cho phương thức minOfArray()
            int[] a1= new int[] {-3,-2,-4};
            int[] a2= new int[] {0,1,-33,99};
            int[] a3= new int[] {110,99,123,876};
            int[] a4= new int[] {-33,-23,30};
            int[] a5= new int[] {-21,-31,10};
            Assert.assertEquals(-4,Week3.minOfArray(a1));
            Assert.assertEquals(-33,Week3.minOfArray(a2));
            Assert.assertEquals(99,Week3.minOfArray(a3));
            Assert.assertEquals(-33,Week3.minOfArray(a4));
            Assert.assertEquals(-31,Week3.minOfArray(a5));
            // TODO: Viết 5 testcase cho phương thức calculateBMI()
            Assert.assertEquals("Thieu can",Week3.calculateBMI(40,1.6));
            Assert.assertEquals("Beo phi",Week3.calculateBMI(40,1));
            Assert.assertEquals("Binh thuong",Week3.calculateBMI(40,1.4));
            Assert.assertEquals("Thua can",Week3.calculateBMI(40,1.3));
            Assert.assertEquals("Thieu can",Week3.calculateBMI(40,1.5));
    }
}
