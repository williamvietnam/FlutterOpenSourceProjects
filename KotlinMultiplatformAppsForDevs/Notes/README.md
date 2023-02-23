#### Tasks list in this project:

1. [x] Setting up the project
2. [x] Adding the dependencies
3. [x] Building the shared module (database)
4. [x] The Domain layer
5. [x] The Data layer
6. [x] Search Note UseCase
7. [x] SqlDelight drivers
8. [x] The Android module (Note list screen)
9. [x] Dependency Injection
10. [x] Testing the Android app
11. [x] The Note details screen
12. [x] Navigation
13. [x] Finished Android app
14. [x] Building the iOS app in Xcode
15. [ ] iOS Note list screen
16. [ ] Testing the note list screen
17. [ ] iOS Note detail screen
18. [ ] Correcting some mistakes

#### Libraries used in this project:

1. [SQLDelight](https://www.youtube.com/watch?v=a2JbtyMPMH0&ab_channel=PhilippLackner):
   SQLDelight generates typesafe kotlin APIs from your SQL statements. It verifies your schema,
   statements, and migrations at compile-time and provides IDE features like autocomplete and
   refactoring which make writing and maintaining SQL simple.

3. [Date&Time](https://github.com/Kotlin/kotlinx-datetime):

- In multiplatform projects, add a dependency to the commonMain source set dependencies:

```commandline
kotlin {
    sourceSets {
        commonMain {
             dependencies {
                 implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
             }
        }
    }
}  
```

- The library provides the basic set of types for working with date and time
    + `Instant` to represent a moment on the UTC-SLS time scale;
    + `Clock to` obtain the current instant;
    + `LocalDateTime` to represent date and time components without a reference to the particular
      time zone;
    + `LocalDate` to represent the components of date only;
    + `LocalTime` to represent the components of time only;
    + `TimeZone` and FixedOffsetTimeZone provide time zone information to convert between `Instant`
      and `LocalDateTime`;
    + `Month` and `DayOfWeek` enums;
    + `DateTimePeriod` to represent a difference between two instants decomposed into date and time
      units;
    + `DatePeriod` is a subclass of `DateTimePeriod` with zero time components, it represents a
      difference between two LocalDate values decomposed into date units.
    + `DateTimeUnit` provides a set of predefined date and time units to use in arithmetic
      operations on `Instant` and `LocalDate`.
    + `UtcOffset` represents the amount of time the local date/time at a particular time zone
      differs from the date/time at UTC.