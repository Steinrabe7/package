import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.service.VacancyService;

public class VacancyServiceTest {
    @Test
    public void shouldCalcVacancy() {
        VacancyService service = new VacancyService();
        int expected = 3;
        int actual = service.calculate(10000,  3000,  20000 );
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateVacancy() {
        VacancyService service = new VacancyService();
        int expected = 2;
        int actual = service.calculate(100000, 60000,150000 );
        Assertions.assertEquals(expected, actual);
    }


    }


