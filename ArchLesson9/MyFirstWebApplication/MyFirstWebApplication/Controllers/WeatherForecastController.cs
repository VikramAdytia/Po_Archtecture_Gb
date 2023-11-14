using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using MyFirstWebApplication.Models;

namespace MyFirstWebApplication.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class WeatherForecastController : ControllerBase
    {

        private WeatherForecastHolder _weatherForecastHolder;

        public WeatherForecastController(
            WeatherForecastHolder weatherForecastHolder)
        {
            _weatherForecastHolder = weatherForecastHolder;
        }

        [HttpPost("add-data")]
        public IActionResult Add([FromQuery]  DateTime date, [FromQuery] int temperatureC)
        {
            _weatherForecastHolder.Add(date, temperatureC);
            return Ok();
        }

        [HttpPut("update-data")]
        public IActionResult Update([FromQuery] DateTime date, [FromQuery] int temperatureC)
        {
            _weatherForecastHolder.Update(date, temperatureC);
            return Ok();
        }

        [HttpDelete("delete-data")]
        public IActionResult Delete([FromQuery] DateTime date)
        {
            _weatherForecastHolder.Delete(date);
            return Ok();
        }

        [HttpGet("get-data")]
        public IActionResult Get([FromQuery] DateTime dateFrom, [FromQuery] DateTime dateTo)
        {
            List<WeatherForecast> list = _weatherForecastHolder.Get(dateFrom, dateTo);
            return Ok(list);
        }

    }
}
