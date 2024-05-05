package com.example.weatherapp.apitest;

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

    public static String hourlyForecast = """
            {
                "lat": 51.25,
                "lon": 22.5667,
                "timezone": "Europe/Warsaw",
                "timezone_offset": 7200,
                "hourly": [
                    {
                        "dt": 1714773600,
                        "temp": 287.86,
                        "feels_like": 286.9,
                        "pressure": 1008,
                        "humidity": 58,
                        "dew_point": 279.69,
                        "uvi": 0,
                        "clouds": 20,
                        "visibility": 10000,
                        "wind_speed": 3.05,
                        "wind_deg": 93,
                        "wind_gust": 8.26,
                        "weather": [
                            {
                                "id": 801,
                                "main": "Clouds",
                                "description": "few clouds",
                                "icon": "02n"
                            }
                        ],
                        "pop": 0.03
                    },
                    {
                        "dt": 1714777200,
                        "temp": 287.5,
                        "feels_like": 286.45,
                        "pressure": 1006,
                        "humidity": 56,
                        "dew_point": 278.85,
                        "uvi": 0,
                        "clouds": 0,
                        "visibility": 10000,
                        "wind_speed": 3.27,
                        "wind_deg": 105,
                        "wind_gust": 7.64,
                        "weather": [
                            {
                                "id": 800,
                                "main": "Clear",
                                "description": "clear sky",
                                "icon": "01n"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714780800,
                        "temp": 287.4,
                        "feels_like": 286.42,
                        "pressure": 1008,
                        "humidity": 59,
                        "dew_point": 279.51,
                        "uvi": 0,
                        "clouds": 20,
                        "visibility": 10000,
                        "wind_speed": 2.96,
                        "wind_deg": 103,
                        "wind_gust": 5.07,
                        "weather": [
                            {
                                "id": 801,
                                "main": "Clouds",
                                "description": "few clouds",
                                "icon": "02n"
                            }
                        ],
                        "pop": 0.15
                    },
                    {
                        "dt": 1714784400,
                        "temp": 286.7,
                        "feels_like": 285.78,
                        "pressure": 1009,
                        "humidity": 64,
                        "dew_point": 280.03,
                        "uvi": 0,
                        "clouds": 37,
                        "visibility": 10000,
                        "wind_speed": 1.46,
                        "wind_deg": 129,
                        "wind_gust": 1.46,
                        "weather": [
                            {
                                "id": 500,
                                "main": "Rain",
                                "description": "light rain",
                                "icon": "10n"
                            }
                        ],
                        "pop": 0.59,
                        "rain": {
                            "1h": 0.14
                        }
                    },
                    {
                        "dt": 1714788000,
                        "temp": 285.97,
                        "feels_like": 285.14,
                        "pressure": 1011,
                        "humidity": 70,
                        "dew_point": 280.64,
                        "uvi": 0,
                        "clouds": 48,
                        "visibility": 10000,
                        "wind_speed": 1.23,
                        "wind_deg": 135,
                        "wind_gust": 1.22,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03n"
                            }
                        ],
                        "pop": 0.4
                    },
                    {
                        "dt": 1714791600,
                        "temp": 285.56,
                        "feels_like": 284.87,
                        "pressure": 1013,
                        "humidity": 77,
                        "dew_point": 281.65,
                        "uvi": 0,
                        "clouds": 63,
                        "visibility": 10000,
                        "wind_speed": 2.07,
                        "wind_deg": 118,
                        "wind_gust": 2.1,
                        "weather": [
                            {
                                "id": 803,
                                "main": "Clouds",
                                "description": "broken clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0.4
                    },
                    {
                        "dt": 1714795200,
                        "temp": 286.34,
                        "feels_like": 285.8,
                        "pressure": 1015,
                        "humidity": 80,
                        "dew_point": 282.85,
                        "uvi": 0.13,
                        "clouds": 78,
                        "visibility": 10000,
                        "wind_speed": 2.42,
                        "wind_deg": 144,
                        "wind_gust": 3.03,
                        "weather": [
                            {
                                "id": 803,
                                "main": "Clouds",
                                "description": "broken clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0.38
                    },
                    {
                        "dt": 1714798800,
                        "temp": 288.11,
                        "feels_like": 287.67,
                        "pressure": 1015,
                        "humidity": 77,
                        "dew_point": 284.02,
                        "uvi": 0.26,
                        "clouds": 83,
                        "visibility": 10000,
                        "wind_speed": 2.3,
                        "wind_deg": 131,
                        "wind_gust": 3.46,
                        "weather": [
                            {
                                "id": 803,
                                "main": "Clouds",
                                "description": "broken clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0.28
                    },
                    {
                        "dt": 1714802400,
                        "temp": 290.01,
                        "feels_like": 289.55,
                        "pressure": 1015,
                        "humidity": 69,
                        "dew_point": 284.24,
                        "uvi": 1.35,
                        "clouds": 78,
                        "visibility": 10000,
                        "wind_speed": 2,
                        "wind_deg": 135,
                        "wind_gust": 2.46,
                        "weather": [
                            {
                                "id": 803,
                                "main": "Clouds",
                                "description": "broken clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0.19
                    },
                    {
                        "dt": 1714806000,
                        "temp": 291.43,
                        "feels_like": 290.98,
                        "pressure": 1015,
                        "humidity": 64,
                        "dew_point": 284.52,
                        "uvi": 2.46,
                        "clouds": 32,
                        "visibility": 10000,
                        "wind_speed": 2.06,
                        "wind_deg": 119,
                        "wind_gust": 2.09,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714809600,
                        "temp": 292.82,
                        "feels_like": 292.41,
                        "pressure": 1016,
                        "humidity": 60,
                        "dew_point": 284.75,
                        "uvi": 3.66,
                        "clouds": 38,
                        "visibility": 10000,
                        "wind_speed": 2.64,
                        "wind_deg": 134,
                        "wind_gust": 2.67,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714813200,
                        "temp": 293.93,
                        "feels_like": 293.5,
                        "pressure": 1015,
                        "humidity": 55,
                        "dew_point": 284.72,
                        "uvi": 4.65,
                        "clouds": 50,
                        "visibility": 10000,
                        "wind_speed": 3.04,
                        "wind_deg": 143,
                        "wind_gust": 2.98,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714816800,
                        "temp": 294.85,
                        "feels_like": 294.38,
                        "pressure": 1015,
                        "humidity": 50,
                        "dew_point": 283.99,
                        "uvi": 5.25,
                        "clouds": 56,
                        "visibility": 10000,
                        "wind_speed": 3.04,
                        "wind_deg": 148,
                        "wind_gust": 2.75,
                        "weather": [
                            {
                                "id": 803,
                                "main": "Clouds",
                                "description": "broken clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714820400,
                        "temp": 295.56,
                        "feels_like": 295.03,
                        "pressure": 1015,
                        "humidity": 45,
                        "dew_point": 283.07,
                        "uvi": 5.25,
                        "clouds": 50,
                        "visibility": 10000,
                        "wind_speed": 2.94,
                        "wind_deg": 150,
                        "wind_gust": 2.53,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714824000,
                        "temp": 295.89,
                        "feels_like": 295.34,
                        "pressure": 1015,
                        "humidity": 43,
                        "dew_point": 282.82,
                        "uvi": 4.59,
                        "clouds": 48,
                        "visibility": 10000,
                        "wind_speed": 2.97,
                        "wind_deg": 147,
                        "wind_gust": 2.65,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714827600,
                        "temp": 295.15,
                        "feels_like": 294.66,
                        "pressure": 1014,
                        "humidity": 48,
                        "dew_point": 283.64,
                        "uvi": 1.61,
                        "clouds": 87,
                        "visibility": 10000,
                        "wind_speed": 2.98,
                        "wind_deg": 146,
                        "wind_gust": 2.81,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714831200,
                        "temp": 293.86,
                        "feels_like": 293.37,
                        "pressure": 1014,
                        "humidity": 53,
                        "dew_point": 283.92,
                        "uvi": 0.61,
                        "clouds": 93,
                        "visibility": 10000,
                        "wind_speed": 2.21,
                        "wind_deg": 155,
                        "wind_gust": 2.38,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714834800,
                        "temp": 293.12,
                        "feels_like": 292.61,
                        "pressure": 1014,
                        "humidity": 55,
                        "dew_point": 283.8,
                        "uvi": 0.25,
                        "clouds": 96,
                        "visibility": 10000,
                        "wind_speed": 1.58,
                        "wind_deg": 155,
                        "wind_gust": 1.51,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714838400,
                        "temp": 292.07,
                        "feels_like": 291.56,
                        "pressure": 1014,
                        "humidity": 59,
                        "dew_point": 283.82,
                        "uvi": 0.09,
                        "clouds": 97,
                        "visibility": 10000,
                        "wind_speed": 1.99,
                        "wind_deg": 162,
                        "wind_gust": 2.18,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0.02
                    },
                    {
                        "dt": 1714842000,
                        "temp": 289.55,
                        "feels_like": 289.2,
                        "pressure": 1014,
                        "humidity": 75,
                        "dew_point": 284.9,
                        "uvi": 0.16,
                        "clouds": 93,
                        "visibility": 10000,
                        "wind_speed": 1.5,
                        "wind_deg": 273,
                        "wind_gust": 1.63,
                        "weather": [
                            {
                                "id": 500,
                                "main": "Rain",
                                "description": "light rain",
                                "icon": "10d"
                            }
                        ],
                        "pop": 0.36,
                        "rain": {
                            "1h": 0.35
                        }
                    },
                    {
                        "dt": 1714845600,
                        "temp": 289.13,
                        "feels_like": 288.69,
                        "pressure": 1014,
                        "humidity": 73,
                        "dew_point": 284.28,
                        "uvi": 0,
                        "clouds": 91,
                        "visibility": 10000,
                        "wind_speed": 1.03,
                        "wind_deg": 221,
                        "wind_gust": 0.94,
                        "weather": [
                            {
                                "id": 500,
                                "main": "Rain",
                                "description": "light rain",
                                "icon": "10n"
                            }
                        ],
                        "pop": 0.42,
                        "rain": {
                            "1h": 0.14
                        }
                    },
                    {
                        "dt": 1714849200,
                        "temp": 289.6,
                        "feels_like": 289.1,
                        "pressure": 1015,
                        "humidity": 69,
                        "dew_point": 284.03,
                        "uvi": 0,
                        "clouds": 99,
                        "visibility": 10000,
                        "wind_speed": 0.96,
                        "wind_deg": 182,
                        "wind_gust": 0.92,
                        "weather": [
                            {
                                "id": 500,
                                "main": "Rain",
                                "description": "light rain",
                                "icon": "10n"
                            }
                        ],
                        "pop": 0.5,
                        "rain": {
                            "1h": 0.12
                        }
                    },
                    {
                        "dt": 1714852800,
                        "temp": 289.3,
                        "feels_like": 288.8,
                        "pressure": 1015,
                        "humidity": 70,
                        "dew_point": 283.84,
                        "uvi": 0,
                        "clouds": 93,
                        "visibility": 10000,
                        "wind_speed": 2.99,
                        "wind_deg": 169,
                        "wind_gust": 3.35,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04n"
                            }
                        ],
                        "pop": 0.18
                    },
                    {
                        "dt": 1714856400,
                        "temp": 287.54,
                        "feels_like": 286.99,
                        "pressure": 1015,
                        "humidity": 75,
                        "dew_point": 283.06,
                        "uvi": 0,
                        "clouds": 95,
                        "visibility": 10000,
                        "wind_speed": 3.39,
                        "wind_deg": 184,
                        "wind_gust": 4.93,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04n"
                            }
                        ],
                        "pop": 0.03
                    },
                    {
                        "dt": 1714860000,
                        "temp": 286.96,
                        "feels_like": 286.38,
                        "pressure": 1015,
                        "humidity": 76,
                        "dew_point": 282.86,
                        "uvi": 0,
                        "clouds": 95,
                        "visibility": 10000,
                        "wind_speed": 3.72,
                        "wind_deg": 198,
                        "wind_gust": 6.43,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04n"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714863600,
                        "temp": 286.72,
                        "feels_like": 286.2,
                        "pressure": 1014,
                        "humidity": 79,
                        "dew_point": 283,
                        "uvi": 0,
                        "clouds": 96,
                        "visibility": 10000,
                        "wind_speed": 3.91,
                        "wind_deg": 211,
                        "wind_gust": 8.74,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04n"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714867200,
                        "temp": 286.26,
                        "feels_like": 285.69,
                        "pressure": 1014,
                        "humidity": 79,
                        "dew_point": 282.83,
                        "uvi": 0,
                        "clouds": 97,
                        "visibility": 10000,
                        "wind_speed": 3.84,
                        "wind_deg": 210,
                        "wind_gust": 8.55,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04n"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714870800,
                        "temp": 286.23,
                        "feels_like": 285.63,
                        "pressure": 1014,
                        "humidity": 78,
                        "dew_point": 282.41,
                        "uvi": 0,
                        "clouds": 100,
                        "visibility": 10000,
                        "wind_speed": 3.74,
                        "wind_deg": 214,
                        "wind_gust": 8.36,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04n"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714874400,
                        "temp": 285.78,
                        "feels_like": 285.11,
                        "pressure": 1014,
                        "humidity": 77,
                        "dew_point": 281.85,
                        "uvi": 0,
                        "clouds": 100,
                        "visibility": 10000,
                        "wind_speed": 3.66,
                        "wind_deg": 226,
                        "wind_gust": 8.19,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04n"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714878000,
                        "temp": 285.65,
                        "feels_like": 284.94,
                        "pressure": 1014,
                        "humidity": 76,
                        "dew_point": 281.52,
                        "uvi": 0,
                        "clouds": 100,
                        "visibility": 10000,
                        "wind_speed": 3.62,
                        "wind_deg": 223,
                        "wind_gust": 7.93,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714881600,
                        "temp": 286.18,
                        "feels_like": 285.52,
                        "pressure": 1014,
                        "humidity": 76,
                        "dew_point": 281.94,
                        "uvi": 0.15,
                        "clouds": 100,
                        "visibility": 10000,
                        "wind_speed": 3.65,
                        "wind_deg": 228,
                        "wind_gust": 8.74,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714885200,
                        "temp": 287.68,
                        "feels_like": 287.09,
                        "pressure": 1014,
                        "humidity": 73,
                        "dew_point": 282.7,
                        "uvi": 0.54,
                        "clouds": 100,
                        "visibility": 10000,
                        "wind_speed": 3.58,
                        "wind_deg": 219,
                        "wind_gust": 7.96,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714888800,
                        "temp": 289.87,
                        "feels_like": 289.22,
                        "pressure": 1014,
                        "humidity": 62,
                        "dew_point": 282.52,
                        "uvi": 1.29,
                        "clouds": 99,
                        "visibility": 10000,
                        "wind_speed": 3.95,
                        "wind_deg": 221,
                        "wind_gust": 6.54,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714892400,
                        "temp": 291.92,
                        "feels_like": 291.26,
                        "pressure": 1013,
                        "humidity": 54,
                        "dew_point": 282.41,
                        "uvi": 2.37,
                        "clouds": 51,
                        "visibility": 10000,
                        "wind_speed": 4.11,
                        "wind_deg": 227,
                        "wind_gust": 5.8,
                        "weather": [
                            {
                                "id": 803,
                                "main": "Clouds",
                                "description": "broken clouds",
                                "icon": "04d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714896000,
                        "temp": 293.34,
                        "feels_like": 292.69,
                        "pressure": 1013,
                        "humidity": 49,
                        "dew_point": 282.26,
                        "uvi": 3.61,
                        "clouds": 34,
                        "visibility": 10000,
                        "wind_speed": 4.19,
                        "wind_deg": 228,
                        "wind_gust": 5.38,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714899600,
                        "temp": 294.64,
                        "feels_like": 294.02,
                        "pressure": 1013,
                        "humidity": 45,
                        "dew_point": 282.21,
                        "uvi": 4.7,
                        "clouds": 29,
                        "visibility": 10000,
                        "wind_speed": 4.34,
                        "wind_deg": 230,
                        "wind_gust": 5.26,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714903200,
                        "temp": 295.64,
                        "feels_like": 295.04,
                        "pressure": 1013,
                        "humidity": 42,
                        "dew_point": 282.03,
                        "uvi": 5.33,
                        "clouds": 33,
                        "visibility": 10000,
                        "wind_speed": 4.53,
                        "wind_deg": 232,
                        "wind_gust": 5.32,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714906800,
                        "temp": 296.14,
                        "feels_like": 295.54,
                        "pressure": 1012,
                        "humidity": 40,
                        "dew_point": 281.85,
                        "uvi": 5.35,
                        "clouds": 34,
                        "visibility": 10000,
                        "wind_speed": 5.15,
                        "wind_deg": 231,
                        "wind_gust": 5.87,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714910400,
                        "temp": 296.54,
                        "feels_like": 295.95,
                        "pressure": 1012,
                        "humidity": 39,
                        "dew_point": 281.81,
                        "uvi": 4.7,
                        "clouds": 35,
                        "visibility": 10000,
                        "wind_speed": 5.11,
                        "wind_deg": 231,
                        "wind_gust": 5.82,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714914000,
                        "temp": 296.72,
                        "feels_like": 296.15,
                        "pressure": 1011,
                        "humidity": 39,
                        "dew_point": 282.08,
                        "uvi": 3.59,
                        "clouds": 46,
                        "visibility": 10000,
                        "wind_speed": 4.35,
                        "wind_deg": 226,
                        "wind_gust": 5.18,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0
                    },
                    {
                        "dt": 1714917600,
                        "temp": 296.7,
                        "feels_like": 296.1,
                        "pressure": 1010,
                        "humidity": 38,
                        "dew_point": 281.81,
                        "uvi": 2.27,
                        "clouds": 48,
                        "visibility": 10000,
                        "wind_speed": 4.57,
                        "wind_deg": 219,
                        "wind_gust": 5.43,
                        "weather": [
                            {
                                "id": 802,
                                "main": "Clouds",
                                "description": "scattered clouds",
                                "icon": "03d"
                            }
                        ],
                        "pop": 0.17
                    },
                    {
                        "dt": 1714921200,
                        "temp": 291.93,
                        "feels_like": 291.59,
                        "pressure": 1011,
                        "humidity": 66,
                        "dew_point": 285.33,
                        "uvi": 0.25,
                        "clouds": 64,
                        "visibility": 10000,
                        "wind_speed": 6.22,
                        "wind_deg": 332,
                        "wind_gust": 8.08,
                        "weather": [
                            {
                                "id": 500,
                                "main": "Rain",
                                "description": "light rain",
                                "icon": "10d"
                            }
                        ],
                        "pop": 0.58,
                        "rain": {
                            "1h": 0.36
                        }
                    },
                    {
                        "dt": 1714924800,
                        "temp": 290.13,
                        "feels_like": 289.74,
                        "pressure": 1011,
                        "humidity": 71,
                        "dew_point": 284.74,
                        "uvi": 0.09,
                        "clouds": 73,
                        "visibility": 10000,
                        "wind_speed": 1.56,
                        "wind_deg": 331,
                        "wind_gust": 2.27,
                        "weather": [
                            {
                                "id": 500,
                                "main": "Rain",
                                "description": "light rain",
                                "icon": "10d"
                            }
                        ],
                        "pop": 0.72,
                        "rain": {
                            "1h": 0.49
                        }
                    },
                    {
                        "dt": 1714928400,
                        "temp": 291.33,
                        "feels_like": 290.8,
                        "pressure": 1010,
                        "humidity": 61,
                        "dew_point": 283.6,
                        "uvi": 0.11,
                        "clouds": 79,
                        "visibility": 10000,
                        "wind_speed": 1.65,
                        "wind_deg": 173,
                        "wind_gust": 1.66,
                        "weather": [
                            {
                                "id": 500,
                                "main": "Rain",
                                "description": "light rain",
                                "icon": "10d"
                            }
                        ],
                        "pop": 0.71,
                        "rain": {
                            "1h": 0.16
                        }
                    },
                    {
                        "dt": 1714932000,
                        "temp": 288,
                        "feels_like": 287.6,
                        "pressure": 1011,
                        "humidity": 79,
                        "dew_point": 284.29,
                        "uvi": 0,
                        "clouds": 82,
                        "visibility": 5284,
                        "wind_speed": 4.42,
                        "wind_deg": 236,
                        "wind_gust": 8.49,
                        "weather": [
                            {
                                "id": 500,
                                "main": "Rain",
                                "description": "light rain",
                                "icon": "10n"
                            }
                        ],
                        "pop": 0.81,
                        "rain": {
                            "1h": 0.62
                        }
                    },
                    {
                        "dt": 1714935600,
                        "temp": 286.78,
                        "feels_like": 286.55,
                        "pressure": 1011,
                        "humidity": 90,
                        "dew_point": 285.09,
                        "uvi": 0,
                        "clouds": 100,
                        "visibility": 10000,
                        "wind_speed": 6.25,
                        "wind_deg": 297,
                        "wind_gust": 11.49,
                        "weather": [
                            {
                                "id": 500,
                                "main": "Rain",
                                "description": "light rain",
                                "icon": "10n"
                            }
                        ],
                        "pop": 1,
                        "rain": {
                            "1h": 0.79
                        }
                    },
                    {
                        "dt": 1714939200,
                        "temp": 285.92,
                        "feels_like": 285.63,
                        "pressure": 1011,
                        "humidity": 91,
                        "dew_point": 284.42,
                        "uvi": 0,
                        "clouds": 100,
                        "visibility": 8222,
                        "wind_speed": 4.56,
                        "wind_deg": 313,
                        "wind_gust": 11.1,
                        "weather": [
                            {
                                "id": 500,
                                "main": "Rain",
                                "description": "light rain",
                                "icon": "10n"
                            }
                        ],
                        "pop": 1,
                        "rain": {
                            "1h": 0.39
                        }
                    },
                    {
                        "dt": 1714942800,
                        "temp": 286.27,
                        "feels_like": 285.91,
                        "pressure": 1011,
                        "humidity": 87,
                        "dew_point": 284.11,
                        "uvi": 0,
                        "clouds": 100,
                        "visibility": 10000,
                        "wind_speed": 0.75,
                        "wind_deg": 275,
                        "wind_gust": 0.79,
                        "weather": [
                            {
                                "id": 804,
                                "main": "Clouds",
                                "description": "overcast clouds",
                                "icon": "04n"
                            }
                        ],
                        "pop": 0.8
                    }
                ]
            }
            """;
}
