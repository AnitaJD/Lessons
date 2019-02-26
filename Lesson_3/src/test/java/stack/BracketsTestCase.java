package stack;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BracketsTestCase {

    @Test
    public void test_valid_code() {
        String code = "    public void push(E value) {        this.data[size++] = value;    }";
        Brackets brackets = new Brackets(code);
        List<String> errors = brackets.check();

        errors.forEach(System.out::println);

        Assert.assertThat(errors.size(), Is.is(0));
    }

    @Test
    public void test_second_bracket_is_invalid() {
        String code = "    public void push(E value] {        this.data[size++] = value;    }";
        Brackets brackets = new Brackets(code);
        List<String> errors = brackets.check();

        errors.forEach(System.out::println);
        Assert.assertThat(errors.size(), Is.is(1));
    }

    @Test
    public void test_missing_right_delimiter() {
        String code = "    public void push(E value) {        this.data[size++] = value;    ";
        Brackets brackets = new Brackets(code);
        List<String> errors = brackets.check();

        errors.forEach(System.out::println);
        Assert.assertThat(errors.size(), Is.is(1));
        Assert.assertThat(errors.get(0), Is.is("Error: missing right delimiter"));
    }
}
