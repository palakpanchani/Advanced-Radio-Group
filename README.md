# Advanced Radio Group

![Kotlin](https://img.shields.io/badge/Kotlin-1.9+-blue.svg)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-Material3-brightgreen)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)
![Platform](https://img.shields.io/badge/Platform-Android-green)
![API](https://img.shields.io/badge/API-21%2B-orange)

A modern, reusable **Jetpack Compose Material 3 RadioGroup library** providing multiple customizable radio button styles for Android developers.

Designed with clean architecture, reusability, and scalability in mind.

---

## ✨ Features

- ✅ Material 3 based UI
- ✅ Multiple Radio Styles
- ✅ Fully customizable
- ✅ Clean and modular code structure
- ✅ Developer-friendly API
- ✅ Lightweight & easy integration
- ✅ Supports vertical scrolling
- ✅ Production-ready UI components

---

## 🎨 Available Styles

### 1️⃣ CapsuleRadioGroup
Rounded pill-shaped selectable buttons.

### 2️⃣ IconRadioGroup
Uses Material icons for selection state.

### 3️⃣ OutlinedRadioGroup
Minimal outlined style with customizable borders.

### 4️⃣ ClassicRadioGroup
Standard Material 3 circular radio buttons.

---

## 📦 Installation

### Option 1: Local Module

```kotlin
implementation(project(":advancedradio"))

## 📦 Usage Example

val options = listOf(
    AdvancedRadioOption("1", "Option 1"),
    AdvancedRadioOption("2", "Option 2"),
    AdvancedRadioOption("3", "Option 3")
)

var selected by remember { mutableStateOf<String?>(null) }

CapsuleRadioGroup(
    options = options,
    selectedOptionId = selected,
    onOptionSelected = { selected = it.id }
)
