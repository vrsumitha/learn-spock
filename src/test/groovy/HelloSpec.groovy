import spock.lang.Specification
import spock.lang.Unroll

public class HelloSpec extends Specification {

    @Unroll
    def "hello test"() {

        expect:
        a == c

        where:

        a << [1, 2, 3]
        c << [1, 2, 3]
    }
}