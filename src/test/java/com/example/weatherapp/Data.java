package com.example.weatherapp;

public class Data {

    public static String dailyForecast = """
            {
            "lat": 51.25,
            "lon": 22.5667,
            "timezone": "Europe/Warsaw",
            "timezone_offset": 7200,
            "daily": [
    {
        "dt": 1713866400,
            "sunrise": 1713842229,
            "sunset": 1713893910,
            "moonrise": 1713892980,
            "moonset": 1713841140,
            "moon_phase": 0.48,
            "summary": "Expect a day of partly cloudy with clear spells",
            "temp": {
        "day": 281.41,
                "min": 271.61,
                "max": 283.59,
                "night": 279.78,
                "eve": 281.73,
                "morn": 272.21
    },
        "feels_like": {
        "day": 280.68,
                "night": 277.59,
                "eve": 279.49,
                "morn": 269.38
    },
        "pressure": 1021,
            "humidity": 45,
            "dew_point": 270.05,
            "wind_speed": 4.25,
            "wind_deg": 139,
            "wind_gust": 7.94,
            "weather": [
        {
            "id": 803,
                "main": "Clouds",
                "description": "broken clouds",
                "icon": "04d"
        }
            ],
        "clouds": 53,
            "pop": 0,
            "uvi": 3.87
    },
    {
        "dt": 1713952800,
            "sunrise": 1713928509,
            "sunset": 1713980409,
            "moonrise": 1713983880,
            "moonset": 1713928260,
            "moon_phase": 0.5,
            "summary": "Expect a day of partly cloudy with rain",
            "temp": {
        "day": 280.59,
                "min": 278.85,
                "max": 280.59,
                "night": 279.4,
                "eve": 280.25,
                "morn": 278.85
    },
        "feels_like": {
        "day": 278.48,
                "night": 277.68,
                "eve": 278.94,
                "morn": 275.54
    },
        "pressure": 1004,
            "humidity": 88,
            "dew_point": 278.69,
            "wind_speed": 4.84,
            "wind_deg": 70,
            "wind_gust": 9.7,
            "weather": [
        {
            "id": 500,
                "main": "Rain",
                "description": "light rain",
                "icon": "10d"
        }
            ],
        "clouds": 100,
            "pop": 0.9,
            "rain": 1.2,
            "uvi": 0.8
    },
    {
        "dt": 1714039200,
            "sunrise": 1714014790,
            "sunset": 1714066908,
            "moonrise": 1714074960,
            "moonset": 1714015620,
            "moon_phase": 0.55,
            "summary": "Expect a day of partly cloudy with rain",
            "temp": {
        "day": 282.25,
                "min": 277.46,
                "max": 284.88,
                "night": 278.45,
                "eve": 284.29,
                "morn": 277.8
    },
        "feels_like": {
        "day": 280.34,
                "night": 275.63,
                "eve": 282.95,
                "morn": 274.23
    },
        "pressure": 1009,
            "humidity": 69,
            "dew_point": 276.88,
            "wind_speed": 4.94,
            "wind_deg": 242,
            "wind_gust": 7.59,
            "weather": [
        {
            "id": 501,
                "main": "Rain",
                "description": "moderate rain",
                "icon": "10d"
        }
            ],
        "clouds": 87,
            "pop": 1,
            "rain": 4.46,
            "uvi": 2.93
    },
    {
        "dt": 1714125600,
            "sunrise": 1714101073,
            "sunset": 1714153407,
            "moonrise": 1714165980,
            "moonset": 1714103280,
            "moon_phase": 0.58,
            "summary": "Expect a day of partly cloudy with clear spells",
            "temp": {
        "day": 285.74,
                "min": 276.34,
                "max": 287.31,
                "night": 280.95,
                "eve": 286.72,
                "morn": 276.86
    },
        "feels_like": {
        "day": 284.18,
                "night": 280.38,
                "eve": 285.39,
                "morn": 274.48
    },
        "pressure": 1014,
            "humidity": 43,
            "dew_point": 273.54,
            "wind_speed": 3.55,
            "wind_deg": 310,
            "wind_gust": 5.7,
            "weather": [
        {
            "id": 800,
                "main": "Clear",
                "description": "clear sky",
                "icon": "01d"
        }
            ],
        "clouds": 1,
            "pop": 0,
            "uvi": 4.11
    },
    {
        "dt": 1714212000,
            "sunrise": 1714187357,
            "sunset": 1714239906,
            "moonrise": 0,
            "moonset": 1714191420,
            "moon_phase": 0.61,
            "summary": "There will be clear sky until morning, then partly cloudy",
            "temp": {
        "day": 288.49,
                "min": 281.64,
                "max": 290.5,
                "night": 283.32,
                "eve": 288.39,
                "morn": 281.71
    },
        "feels_like": {
        "day": 287.46,
                "night": 282.19,
                "eve": 287.51,
                "morn": 280.15
    },
        "pressure": 1018,
            "humidity": 53,
            "dew_point": 278.89,
            "wind_speed": 4.02,
            "wind_deg": 188,
            "wind_gust": 5.25,
            "weather": [
        {
            "id": 803,
                "main": "Clouds",
                "description": "broken clouds",
                "icon": "04d"
        }
            ],
        "clouds": 81,
            "pop": 0,
            "uvi": 4.4
    },
    {
        "dt": 1714298400,
            "sunrise": 1714273642,
            "sunset": 1714326405,
            "moonrise": 1714256700,
            "moonset": 1714280460,
            "moon_phase": 0.64,
            "summary": "Expect a day of partly cloudy with clear spells",
            "temp": {
        "day": 291.15,
                "min": 281.02,
                "max": 292.9,
                "night": 285.26,
                "eve": 289.87,
                "morn": 281.02
    },
        "feels_like": {
        "day": 290.34,
                "night": 284.56,
                "eve": 289.32,
                "morn": 278.88
    },
        "pressure": 1023,
            "humidity": 51,
            "dew_point": 280.86,
            "wind_speed": 4.17,
            "wind_deg": 119,
            "wind_gust": 8.09,
            "weather": [
        {
            "id": 800,
                "main": "Clear",
                "description": "clear sky",
                "icon": "01d"
        }
            ],
        "clouds": 0,
            "pop": 0,
            "uvi": 5
    },
    {
        "dt": 1714384800,
            "sunrise": 1714359928,
            "sunset": 1714412904,
            "moonrise": 1714346700,
            "moonset": 1714370460,
            "moon_phase": 0.68,
            "summary": "There will be partly cloudy today",
            "temp": {
        "day": 291.42,
                "min": 282.77,
                "max": 292.51,
                "night": 285.44,
                "eve": 292.09,
                "morn": 282.77
    },
        "feels_like": {
        "day": 290.63,
                "night": 284.68,
                "eve": 291.5,
                "morn": 280.74
    },
        "pressure": 1028,
            "humidity": 51,
            "dew_point": 280.98,
            "wind_speed": 7.47,
            "wind_deg": 133,
            "wind_gust": 14.53,
            "weather": [
        {
            "id": 804,
                "main": "Clouds",
                "description": "overcast clouds",
                "icon": "04d"
        }
            ],
        "clouds": 100,
            "pop": 0,
            "uvi": 5
    },
    {
        "dt": 1714471200,
            "sunrise": 1714446216,
            "sunset": 1714499402,
            "moonrise": 1714435800,
            "moonset": 1714461420,
            "moon_phase": 0.71,
            "summary": "You can expect partly cloudy in the morning, with clearing in the afternoon",
            "temp": {
        "day": 292.78,
                "min": 284.25,
                "max": 295.16,
                "night": 286.01,
                "eve": 294.31,
                "morn": 284.25
    },
        "feels_like": {
        "day": 292.23,
                "night": 285.52,
                "eve": 293.94,
                "morn": 283.35
    },
        "pressure": 1027,
            "humidity": 55,
            "dew_point": 283.49,
            "wind_speed": 6.83,
            "wind_deg": 145,
            "wind_gust": 14.99,
            "weather": [
        {
            "id": 803,
                "main": "Clouds",
                "description": "broken clouds",
                "icon": "04d"
        }
            ],
        "clouds": 70,
            "pop": 0,
            "uvi": 5
    }
    ]
}
""";

}
