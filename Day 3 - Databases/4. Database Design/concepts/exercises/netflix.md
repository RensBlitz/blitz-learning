# Netflix Database Design Challenge

You're tasked with designing a database for Netflix, focusing on managing user accounts, profiles, content, and personalization features. This exercise will help you understand complex relationships and real-world database design challenges.

## Core Requirements:

### 1. Account & Profile Management:
- Main account holder:
  - Email
  - Password (hashed)
  - Subscription type (Basic, Standard, Premium)
  - Billing information
  - Max allowed profiles (based on subscription)
- Sub-profiles under each account:
  - Profile name
  - Avatar
  - Language preference
  - Maturity settings (Kids/Teen/Adult)
  - Individual viewing preferences
- Profile restrictions:
  - PIN protection for profiles
  - Content maturity restrictions

### 2. Content Organization:
- Content types:
  - Movies
  - TV Shows (with seasons and episodes)
  - Documentaries
  - Kids content
- Multiple categories per content:
  - Genre (Action, Drama, Comedy, etc.)
  - Themes (Romantic, Suspenseful, Feel-good)
  - Collections (Oscar Winners, Summer Blockbusters, 90s Classics)
  - Region-specific categories (Bollywood, K-Dramas, etc.)
- Content metadata:
  - Title
  - Description
  - Release year
  - Duration
  - Age rating
  - Cast and crew
  - Thumbnails/artwork
  - Trailer links

### 3. Personalization Features:
- Lists per profile:
  - My List (saved for later)
  - Currently Watching
  - Watched History
  - Hidden Titles (content user wants to hide)
- Personal preferences:
  - Favorite genres
  - Liked/Disliked content
  - Viewing history
  - Language preferences (audio and subtitle)

### 4. Viewing State Management:
- Watch progress:
  - For movies: timestamp where left off
  - For TV shows: 
    - Last watched episode
    - Episode progress
    - Auto-play next episode state
- Viewing quality preferences
- Subtitle/Audio preferences per content

## Your Task:

1. Design a comprehensive ERD that includes:
   - All necessary entities
   - Relationships with proper cardinality
   - Primary and foreign keys
   - Essential attributes for each entity

2. Design decisions to explain:
   - How would you handle the relationship between accounts and profiles?
   - How would you structure content categorization to allow for multiple categories/genres?
   - How would you design the watch progress system to work efficiently for both movies and TV shows?
   - How would you implement the "Currently Watching" list that needs to be ordered by last watched?

## Advanced Considerations:

### 1. Data Integrity:
- How to ensure a profile can't access content beyond its maturity rating?
- How to maintain watch history when a profile is deleted?
- How to handle shared viewing states when multiple profiles watch the same content?

### 2. Common Queries to Consider:
- Show all profiles under an account
- Get currently watching list for a profile, ordered by last watched
- Find all content in multiple categories (e.g., "Action" + "Sci-Fi" + "Blockbuster")
- Get watch progress for a TV show across all its episodes
- Get recommended content based on viewing history and preferences

### 3. Business Rules:
- How to enforce maximum profiles per subscription type?
- How to handle content availability based on subscription tier?
- How to manage PIN-protected profiles? 