# 🌱 CoalFired

**Part of the [LowCarb](https://github.com/Eddvance/LowCarb) application**

Carbon energy rate microservice that provides electricity pricing for fossil fuel-based energy sources.

## 🎯 Role

This service exposes an API endpoint returning carbon energy rates (€/kWh) consumed by the main LowCarb service for cost calculations.

> ✅ Uses real carbon energy rate data from New Zealand.

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.x
- Spring WebFlux (Reactive)
- Eureka Client
- OpenAPI / Swagger

## 🚀 Running

This service is part of the LowCarb microservices ecosystem. See the main [LowCarb repository](https://github.com/Eddvance/LowCarb) for full setup instructions with Docker Compose.

## 📡 API

```
GET /coalfired/rate
→ Returns carbon energy rate (NZ data)
```

## 📝 License

MIT License - see [LICENSE](LICENSE) for details.
