package hw8.provider;

//import hw8.WeatherData;
import hw8.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException, SQLException;

//    List<WeatherData> getAllFromDb() throws IOException, SQLException;
}
