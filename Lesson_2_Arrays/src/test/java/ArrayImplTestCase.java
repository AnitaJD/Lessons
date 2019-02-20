import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class ArrayImplTestCase {

    public static final int INVALID_VALUE = 777;

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

        Array<Integer> array = new ArrayImpl<>();
        array.add(10);
        array.add(20);
        array.add(70);

        Assert.assertTrue(array.contains(10));
        Assert.assertTrue(array.contains(20));
        Assert.assertTrue(array.contains(70));

        Assert.assertFalse(array.contains(INVALID_VALUE));

        Assert.assertThat(array.indexOf(10), Is.is(0));
        Assert.assertThat(array.indexOf(20), Is.is(1));
        Assert.assertThat(array.indexOf(70), Is.is(2));

        Assert.assertThat(array.indexOf(INVALID_VALUE), Is.is(-1));
    }

    @Test
    public void test_remove_by_index (){
        Array<Integer> array = new ArrayImpl<>();
        array.add(10);
        array.add(20);
        array.add(70);

        array.remove(0);
        Assert.assertThat(array.getSize(), Is.is(2));
        Assert.assertThat(array.get(0), Is.is(20));
        Assert.assertThat(array.get(1), Is.is(70));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_remove_by_invalid_index (){
        Array<Integer> array = new ArrayImpl<>();
        array.add(10);
        array.add(20);
        array.add(70);

        array.remove(50);
        Assert.assertThat(array.getSize(), Is.is(2));
        Assert.assertThat(array.get(0), Is.is(20));
        Assert.assertThat(array.get(1), Is.is(70));
    }

    @Test
    public void test_remove_by_value (){
        Array<Integer> array = new ArrayImpl<>();
        array.add(10);
        array.add(20);
        array.add(70);

        Assert.assertTrue(array.remove(new Integer(20)));
        Assert.assertFalse(array.remove(new Integer(INVALID_VALUE)));

        Assert.assertThat(array.getSize(), Is.is(2));
        Assert.assertThat(array.get(0), Is.is(10));
        Assert.assertThat(array.get(1), Is.is(70));
    }

    @Test
    public void test_sorted_array (){
        Array<Integer> array = new SortedArrayImpl<>();
        array.add(20);
        array.add(10);
        array.add(70);

        Assert.assertThat(array.getSize(), Is.is(3));
        Assert.assertThat(array.get(0), Is.is(10));
        Assert.assertThat(array.get(1), Is.is(20));
        Assert.assertThat(array.get(2), Is.is(70));
    }

    @Test
    public void  test_binary_search (){

        Array<Integer> array = new SortedArrayImpl<>();
        array.add(20);
        array.add(10);
        array.add(70);

        Assert.assertTrue(array.contains(10));
        Assert.assertTrue(array.contains(20));
        Assert.assertTrue(array.contains(70));

        Assert.assertFalse(array.contains(INVALID_VALUE));

        Assert.assertThat(array.indexOf(10), Is.is(0));
        Assert.assertThat(array.indexOf(20), Is.is(1));
        Assert.assertThat(array.indexOf(70), Is.is(2));

        Assert.assertThat(array.indexOf(INVALID_VALUE), Is.is(-1));
    }

    @Test
    public void test_sort_bubble (){
        ArrayImpl<Integer> array = new ArrayImpl<>();
        array.add(20);
        array.add(10);
        array.add(70);
        array.add(5);
        array.add(50);

        array.sortBubble();
        Assert.assertThat(array.get(0), Is.is(5));
        Assert.assertThat(array.get(1), Is.is(10));
        Assert.assertThat(array.get(2), Is.is(20));
        Assert.assertThat(array.get(3), Is.is(50));
        Assert.assertThat(array.get(4), Is.is(70));
    }

    @Test
    public void test_sort_select (){
        ArrayImpl<Integer> array = new ArrayImpl<>();
        array.add(20);
        array.add(10);
        array.add(70);
        array.add(5);
        array.add(50);

        array.sortSelect();
        Assert.assertThat(array.get(0), Is.is(5));
        Assert.assertThat(array.get(1), Is.is(10));
        Assert.assertThat(array.get(2), Is.is(20));
        Assert.assertThat(array.get(3), Is.is(50));
        Assert.assertThat(array.get(4), Is.is(70));
    }

    @Test
    public void test_sort_insert (){
        ArrayImpl<Integer> array = new ArrayImpl<>();
        array.add(20);
        array.add(10);
        array.add(70);
        array.add(5);
        array.add(50);

        array.sortInsert();
        Assert.assertThat(array.get(0), Is.is(5));
        Assert.assertThat(array.get(1), Is.is(10));
        Assert.assertThat(array.get(2), Is.is(20));
        Assert.assertThat(array.get(3), Is.is(50));
        Assert.assertThat(array.get(4), Is.is(70));
    }
}

