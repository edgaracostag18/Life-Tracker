# Grit

Grit is a private Android daily life recorder. The calendar is the central hub: tasks, tracked actions, routines, and journal entries all feed into calendar days so the user can see what actually happened without shame or gamification.

## Current MVP scope

Version 1 is Android-only and local-only. It includes:

- Full-month Calendar tab with activity dots and selected-day detail.
- Optional daily journal note/photo model, with photo files intended for app-private storage.
- Tasks with deadline, reminder timestamp, priority, status, completion, cancelation, and calendar presence.
- Habits as tracked actions with Positive, Negative, or Neutral labels and per-log label overrides.
- Routines as repeated checklists with Scheduled, Completed, Skipped, and Missed occurrence history.
- WorkManager missed-routine checking on a daily cadence and on app start.
- Default categories seeded on first launch and optional projects in the data model.
- Simple stats cards for tasks, action logs, routines, and journals.

## Tech stack

- Kotlin
- Jetpack Compose
- Material 3
- Room database
- ViewModels
- Kotlin coroutines and Flow
- Navigation Compose
- WorkManager
- Local app-private storage for journal photos

No Firebase, accounts, cloud sync, web app, desktop app, or AI features are included in version 1.

## Main navigation

The bottom navigation contains five tabs:

1. Calendar
2. Tasks
3. Habits
4. Routines
5. Stats

The app opens to Calendar by default.

## Data model overview

Room entities include `CategoryEntity`, `ProjectEntity`, `TaskEntity`, `TrackedActionEntity`, `ActionLogEntity`, `RoutineEntity`, `RoutineStepEntity`, `RoutineOccurrenceEntity`, and `JournalEntryEntity`. Timestamps are stored as epoch millis. Day-grouped records use ISO local dates (`YYYY-MM-DD`). Routine scheduled days use a compact comma-separated format such as `MON,TUE,WED,THU,FRI`.

## How to run

1. Open the repository in Android Studio.
2. Let Gradle sync dependencies.
3. Run the `app` configuration on an Android device or emulator.
4. From the command line, run `./gradlew assembleDebug` if a compatible Android SDK is installed.

## Intentionally excluded from version 1

- User accounts
- Cloud sync
- Web or desktop clients
- AI features
- Mood tracking
- Daily review flow
- Social features
- Gamification
- Complex habit goals
- Multiple photos per day
- Photos on tasks, habits, or routines
- Multiple categories or projects per item

## Future expansion ideas

- Sync adapters for web/desktop support.
- Richer category and project management screens.
- Routine step completion history per run.
- Reminder notifications with user-editable scheduling.
- Export/import of local records.
