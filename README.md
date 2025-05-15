# 🧭 mcplayer-stats-api

A Spring Boot RESTful API designed to support the **Minecraft Player Stats Tracker** plugin. This API stores, tracks, and manages player statistics from a Spigot Minecraft server in real time.

> This API is built to work with the following Minecraft server plugin:
👉 [mcplayer-stats-plugin (Spigot Plugin)](http://github.com/Phoenixxo/mcplayer-stats-plugin)

## 📦 Features

- 🔐 Secure REST endpoints for accessing and modifying player stats
- 🧑‍💻 Tracks player logins, deaths, block breaks, and more
- 🌐 Integrates seamlessly with a Spigot plugin over HTTP
- 💾 Connected to a persistent relational database (e.g., MySQL, PostgreSQL)
- ⚙️ Built with Spring Boot for fast, scalable performance

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL/PostgreSQL
- Maven
- Lombok

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven
- A running SQL database (e.g., MySQL or PostgreSQL)

### Clone & Build

```bash
git clone https://github.com/Phoenixxo/mcplayer-stats-api
cd mcplayer-stats-api
mvn clean install
