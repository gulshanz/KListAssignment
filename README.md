# KList DSL (Jetpack Compose)

This project implements a custom DSL called `KList`, inspired by Jetpack Compose’s `Modifier` chaining pattern. The idea is to build a reusable, scalable, and declarative API for rendering lists with section headers and item clicks — all using idiomatic Kotlin and Compose.

---

## What it does

- Allows you to build lists with a clean DSL like:
  ```kotlin
  KList.create()
      .padding(16.dp)
      .section("Top Gainers", coins) { coin ->
          KListItem(coin) {
              // Handle click
          }
      }
      .render()
