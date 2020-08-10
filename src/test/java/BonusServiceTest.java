import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        // given
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // when
        long actual = service.calculate(amount, registered);

        // then
        assertEquals(expected, actual);
    }

        @Test
        void shouldCalculateForNotRegisteredAndUnderLimit() {

            BonusService service = new BonusService();

            long amount = 1000_60;
            boolean registered = false;
            long expected = 10;

            long actual = service.calculate(amount, registered);
            assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForRegisteredAndMoreThanLimit() {
        // given
        BonusService service = new BonusService();

        long amount = Integer.MAX_VALUE;
        boolean registered = true;
        long expected = 500;

        // when
        long actual = service.calculate(amount, registered);

        // then
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndMoreThanLimit() {
        // given
        BonusService service = new BonusService();

        long amount = Integer.MAX_VALUE;
        boolean registered = false;
        long expected = 500;

        // when
        long actual = service.calculate(amount, registered);

        // then
        assertEquals(expected, actual);

    }
}




