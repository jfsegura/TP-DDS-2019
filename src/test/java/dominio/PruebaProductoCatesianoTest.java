package dominio;


import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import org.junit.Test;


import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;


public class PruebaProductoCatesianoTest {/*

*/

    @Test
    public void whenCalculatingCartesianProductOfSets_thenCorrect() {
        Set<Character> first = ImmutableSet.of('a', 'b');
        Set<Character> second = ImmutableSet.of('c', 'd');
        Set<List<Character>> result =
                Sets.cartesianProduct(ImmutableList.of(first, second));

        Function<List<Character>, String> func =
                new Function<List<Character>, String>() {
                    public String apply(List<Character> input) {
                        return Joiner.on(" ").join(input);
                    }
                };
        Iterable<String> joined = Iterables.transform(result, func);
        assertThat(joined, containsInAnyOrder("a c", "a d", "b c", "b d"));
    }
        }
