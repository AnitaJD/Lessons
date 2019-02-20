import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class ArrayImplTestCase {

    @Test
    public void test_init_array (){
        Array<Integer> array = new ArrayImpl<>();
        array.add(1);
        array.add(2);
        Assert.assertThat(array.getSize(), Is.is(2));
        Assert.assertThat(array.get(0), Is.is(1));
        Assert.assertThat(array.get(1), Is.is(2));

    }
    @Test
    public void test_init_array_fixed_size (){
        Array<Integer> array = new ArrayImpl<>(2);
        array.add(1);
        array.add(2);
        array.add(3);
        Assert.assertThat(array.getSize(), Is.is(3));
        Assert.assertThat(array.get(0), Is.is(1));
        Assert.assertThat(array.get(1), Is.is(2));
        Assert.assertThat(array.get(2), Is.is(3));
    }

    @Test
    public void  test_search (){
        int invalidValue = 777;

        Array<Integer> array = new ArrayImpl<>();
        array.add(10);
        array.add(20);
        array.add(70);

        Assert.assertTrue(array.contains(10));
        Assert.assertTrue(array.contains(20));
        Assert.assertTrue(array.contains(70));

        Assert.assertFalse(array.contains(invalidValue));

        Assert.assertThat(array.indexOf(10), Is.is(0));
        Assert.assertThat(array.indexOf(20), Is.is(1));
        Assert.assertThat(array.indexOf(70), Is.is(2));

        Assert.assertThat(array.indexOf(invalidValue), Is.is(-1));

    }

    @Test
    public void test_remove (){

    }
}
