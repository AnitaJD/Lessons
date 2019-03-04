import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class TestBinarySearch {

    @Test
    public void  test_binary_search (){

        Array<Integer> array = new RecSortedArrayImpl<>();
        array.add(20);
        array.add(10);
        array.add(70);

        Assert.assertTrue(array.contains(10));
        Assert.assertTrue(array.contains(20));
        Assert.assertTrue(array.contains(70));

        Assert.assertFalse(array.contains(-1));//INVALID_VALUE

        Assert.assertThat(array.indexOf(10), Is.is(0));
        Assert.assertThat(array.indexOf(20), Is.is(1));
        Assert.assertThat(array.indexOf(70), Is.is(2));

        Assert.assertThat(array.indexOf(-1), Is.is(-1));// array.indexOf(INVALID_VALUE)
    }
}
