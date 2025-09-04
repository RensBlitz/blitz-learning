# Mini-Netflix Spring Boot (Controller-Only) — Windows + IntelliJ + Java

A beginner-friendly, step-by-step guide to build a tiny **“Mini-Netflix”** REST API in Spring Boot. This version:
- Uses **only a controller** with an in-memory `List` (no service, no repository, no database).
- Provides **method signatures and ResponseEntity return lines only**, plus precise `// implement the following here` comments.

---

## 1) Create the project with IntelliJ (Spring Initializr)
1. Open **IntelliJ IDEA** → **New Project** → **Spring Initializr**.
2. **Project SDK**: select your installed JDK (e.g., 21).
3. Fill in:
   - **Group**: `com.example`
   - **Artifact**: `mini-netflix`
   - **Language**: Java
   - **Type**: Maven (or Gradle if you prefer)
   - **Packaging**: Jar
4. **Dependencies**: add **Spring Web** only.
5. Click **Finish** → IntelliJ opens the new project.

---

## 2) Project structure you’ll use
Create these files under `src/main/java/com/example/mininetflix/`:

```
src/
 └─ main/
    ├─ java/
    │  └─ com/
    │     └─ example/
    │        └─ mininetflix/
    │           ├─ MiniNetflixApplication.java   (main class)
    │           ├─ Movie.java                    (domain model; plain class)
    │           ├─ MovieInput.java               (request body for create/update)
    │           └─ MovieController.java          (all endpoints + in-memory List)
    └─ resources/
       └─ application.properties                 (optional; can be empty)
```

---

## 3) Main application class
**File:** `src/main/java/com/example/mininetflix/MiniNetflixApplication.java`
```java
package com.example.mininetflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniNetflixApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiniNetflixApplication.class, args);
    }
}
```

---

## 4) Model classes 
**File:** `src/main/java/com/example/mininetflix/Movie.java`
```java
package com.example.mininetflix;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private int year;
    private double rating;

    // Getters & Setters (IntelliJ: Alt+Insert → Getter/Setter)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
}
```

**File:** `src/main/java/com/example/mininetflix/MovieInput.java`
```java
package com.example.mininetflix;

/**
 * Request payload for create/update operations.
 */
public class MovieInput {
    private String title;
    private String genre;
    private Integer year;
    private Double rating;

    // Getters & Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }
}
```

---

## 5) Controller
**File:** `src/main/java/com/example/mininetflix/MovieController.java`
```java
package com.example.mininetflix;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin // optional for browser-based clients
public class MovieController {

    // In-memory "store" (no DB, no repository, no service)
    private final List<Movie> movies = new ArrayList<>();

    public MovieController() {
        // Seed a couple of items so GET /api/movies returns data on first run
        Movie m1 = new Movie();
        m1.setId(1);
        m1.setTitle("Inception");
        m1.setGenre("Sci-Fi");
        m1.setYear(2010);
        m1.setRating(8.8);
        movies.add(m1);

        Movie m2 = new Movie();
        m2.setId(2);
        m2.setTitle("The Dark Knight");
        m2.setGenre("Action");
        m2.setYear(2008);
        m2.setRating(9.0);
        movies.add(m2);
    }

    // GET /api/movies → list all
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        // implement the following here:
        // 1) Return all movies from the 'movies' list.
        // 2) No transformation required.
        return ResponseEntity.ok(movies);
    }

    // GET /api/movies/{id} → get one by id
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
        // implement the following here:
        // 1) Iterate over 'movies' to find a Movie with getId() == id.
        // 2) If found → return ResponseEntity.ok(foundMovie)
        // 3) If not found → return ResponseEntity.notFound().build()
        return ResponseEntity.notFound().build();
    }

    // POST /api/movies → create (using MovieInput; ID policy without AtomicInteger)
    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody MovieInput input) {
        // implement the following here:
        // 1) Validate input: title must not be null/blank; other fields optional.
        // 2) Determine a new ID without AtomicInteger:
        //    - Compute nextId = movies.isEmpty() ? 1 : (maxIdInList + 1)
        //      (find max by iterating over 'movies').
        // 3) Create a new Movie, set id = nextId, and copy fields from 'input' (handle nulls).
        // 4) Add the new Movie to 'movies'.
        // 5) return ResponseEntity.ok(newMovie)  (simple OK; omit Location header for simplicity)
        return ResponseEntity.ok(null);
    }

    // PUT /api/movies/{id} → full update/replace
    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable int id, @RequestBody MovieInput input) {
        // implement the following here:
        // 1) Find existing movie by id (iterate 'movies').
        // 2) If not found → return ResponseEntity.notFound().build()
        // 3) If found → replace fields with values from 'input'.
        //    - Decide null-handling strategy (e.g., keep old value if input is null).
        // 4) return ResponseEntity.ok(updatedMovie)
        return ResponseEntity.notFound().build();
    }

    // DELETE /api/movies/{id} → delete by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
        // implement the following here:
        // 1) Locate the movie by id.
        // 2) If not found → return ResponseEntity.notFound().build()
        // 3) If found → remove it from 'movies'.
        // 4) return ResponseEntity.noContent().build()
        return ResponseEntity.noContent().build();
    }
}
```

---

## 6) Run the application
- In IntelliJ, open `MiniNetflixApplication` and click **Run** (green triangle).  
- Wait for the console message: `Started MiniNetflixApplication`.  
- The API is available at `http://localhost:8080`.

---

## 7) Quick tests with Postman

To test your API endpoints, use [Postman](https://www.postman.com/downloads/):

1. **Install Postman** and open it.
2. **Create a new request** for each endpoint:
   - **List all movies**
     - Method: `GET`
     - URL: `http://localhost:8080/api/movies`
   - **Get one movie**
     - Method: `GET`
     - URL: `http://localhost:8080/api/movies/1`
   - **Create a movie**
     - Method: `POST`
     - URL: `http://localhost:8080/api/movies`
     - Body: Select `raw` and `JSON`, then paste:
       ```json
       {
         "title": "Interstellar",
         "genre": "Sci-Fi",
         "year": 2014,
         "rating": 8.6
       }
       ```
   - **Update a movie**
     - Method: `PUT`
     - URL: `http://localhost:8080/api/movies/2`
     - Body: Select `raw` and `JSON`, then paste:
       ```json
       {
         "title": "The Dark Knight (Updated)",
         "genre": "Action",
         "year": 2008,
         "rating": 9.0
       }
       ```
   - **Delete a movie**
     - Method: `DELETE`
     - URL: `http://localhost:8080/api/movies/2`

3. **Send each request** and check the response in Postman.

---

## 8) Notes for beginners
- The `movies` list is **in-memory only**; data resets when you stop the app.
- The `createMovie` method explains a simple, loop-based way to compute the next ID.

