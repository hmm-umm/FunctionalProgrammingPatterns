import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {

    interface Functor<T, F extends Functor<?,?>> {
        <R> F map(Function<T,R> f);
    }

    static class Identity<T> implements Functor<T, Identity<?>> {
        private final T value;

        Identity(T value) { this.value = value; }

        public <R> Identity<R> map(Function<T,R> f) {
            final R result = f.apply(value);
            return new Identity<>(result);
        }
    }

    static class FOptional<T> implements Functor<T,FOptional<?>> {

        private final T valueOrNull;

        private FOptional(T valueOrNull) {
            this.valueOrNull = valueOrNull;
        }

        public <R> FOptional<R> map(Function<T,R> f) {
            if (valueOrNull == null)
                return empty();
            else
                return of(f.apply(valueOrNull));
        }

        public static <T> FOptional<T> of(T a) {
            return new FOptional<T>(a);
        }

        public static <T> FOptional<T> empty() {
            return new FOptional<T>(null);
        }

    }

    static FOptional<Integer> tryParse(String s) {
        try {
            final int i = Integer.parseInt(s);
            return FOptional.of(i);
        } catch (NumberFormatException e) {
            return FOptional.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Identity<String> idString = new Identity<>("abc");
        Identity<Integer> idInt = idString.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });

        System.out.println("idInt :: " + idInt);

        List<String> listTest = new ArrayList<>();
        listTest.add("1");
        listTest.add("2");
        listTest.add("3");
        listTest.add("4");
        listTest.add("5");
        listTest.add("6");
        listTest.add("7");
        listTest.add("8");
        listTest.add("9");
        listTest.add("10");

        FOptional<String> str = FOptional.of("42");
        FOptional<Integer> strInt = str.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });

    }
}
