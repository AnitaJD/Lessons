package stack;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

    public class StackTestCase {

        @Test
        public void test_add() {
            Stack<Integer> stack = new StackImpl<>(3);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            if ( !stack.isFull() ) {
                stack.push(3);
            }

            Assert.assertThat(stack.size(),   Is.is(3));
            Assert.assertThat(stack.peek(),   Is.is(3));
        }

        @Test(expected = ArrayIndexOutOfBoundsException.class)
        public void test_add_error() {
            Stack<Integer> stack = new StackImpl<>(2);
            stack.push(1);
            stack.push(2);
            stack.push(3);
        }

        @Test
        public void test_remove() {
            Stack<Integer> stack = new StackImpl<>(5);
            stack.push(1);
            stack.push(2);
            stack.push(3);

            Assert.assertThat(stack.size(),   Is.is(3));
            Assert.assertThat(stack.pop(),   Is.is(3));
            Assert.assertThat(stack.size(),   Is.is(2));
        }

        @Test
        public void test_display() {
            Stack<Integer> stack = new StackImpl<>(5);
            stack.push(1);
            stack.push(2);
            stack.push(3);


            StringBuilder sb = new StringBuilder();
            while ( !stack.isEmpty() ) {
                sb.append(stack.pop());
                sb.append("; ");
            }

            Assert.assertTrue(sb.toString().equals("3; 2; 1; "));
        }
}
