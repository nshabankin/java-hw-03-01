public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int rublesForAMile = 20; // Количество рублей за одну милю
        return ticketPrice / rublesForAMile;
    }
}
